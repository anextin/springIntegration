package com.example.springInteg.demo.router;

import com.example.springInteg.demo.config.PMAdapterConfig;
import com.example.springInteg.demo.config.PMAggregatorChannelGateway;
import com.example.springInteg.demo.config.PMChannellGateway;
import com.example.springInteg.demo.model.eai.ProductOrderCreate;
import com.example.springInteg.demo.model.target.CCSResponseModel;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class BaseServiceRouter {
    private static final Logger LOG = LoggerFactory.getLogger(BaseServiceRouter.class);

    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(BaseServiceRouter.class);

    @Autowired
    private PMAdapterConfig.PMGateway pmGateway;

    @Autowired
    private PMChannellGateway pmChannellGateway;

    @Autowired
    private PMAggregatorChannelGateway pmAggregatorChannelGateway;


    @ServiceActivator(inputChannel = "registrationRequest")
    public String register(@Payload ProductOrderCreate
            productOrderCreate) {

      //  pmChannellGateway.pmRequest(productOrderCreate);
        logger.info("Received eaiRequest from channel: {}, publishing it to the vibe web service", productOrderCreate);
        /*
        pmGateway.postRequest(MessageBuilder.withPayload(productOrderCreate)
                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .build());
         */
        pmChannellGateway.pmRequest(productOrderCreate);
        return null;
    }

    @ServiceActivator(inputChannel = "ccsChannel")
    public String productMapper(@Payload CCSResponseModel ccsResponseModel) {
        System.out.println("burada");
        System.out.println(ccsResponseModel);

        pmAggregatorChannelGateway.aggregateRequest(ccsResponseModel);

        return null;
    }

    @ServiceActivator(inputChannel = "aggregationCompletedChannel")
    public void handleCompletedGroupReservation(ProductOrderCreate productOrderCreate) {
        System.out.println(productOrderCreate);

    }
}
