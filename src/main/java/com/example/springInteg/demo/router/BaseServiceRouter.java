package com.example.springInteg.demo.router;

import com.example.springInteg.demo.config.HttpOutboundGatewayConfig;
import com.example.springInteg.demo.config.VibeAdapterConfig;
import com.example.springInteg.demo.model.eai.ProductOrderCreate;
import com.example.springInteg.demo.model.target.CCSResponseModel;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler;
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
    private VibeAdapterConfig.PublishReservationGateway publishReservationGateway;
/*
    @Autowired
    private HttpOutboundGatewayConfig.GetReservationGateway getReservationGateway;


 */

    @ServiceActivator(inputChannel = "registrationRequest")
    public void register(@Payload ProductOrderCreate
            productOrderCreate) {

        System.out.println(productOrderCreate);
        System.out.println(productOrderCreate.toString());
        System.out.println(productOrderCreate);
/*
        HttpRequestExecutingMessageHandler handler = new HttpRequestExecutingMessageHandler(
                "http://localhost:9090/vibe");


 */
        ProductOrderCreate reservation = productOrderCreate;

        logger.info("Received reservation from channel: {}, publishing it to the reservation web service", reservation);
        publishReservationGateway.publishReservation(MessageBuilder.withPayload(reservation)
                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .build());

        /*
        ProductOrderCreate serviceReservation = getReservationGateway.getReservation(reservation.getId());
        logger.info("Reservation from web service: {}", serviceReservation);



        handler.setExpectReply(true);
        handler.setExpectedResponseType(CCSResponseModel.class);
        handler.setOutputChannelName("vibeResponse");

        */


    }
}
