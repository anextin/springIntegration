package com.example.springInteg.demo.config;

import com.example.springInteg.demo.model.eai.ProductOrderCreate;
import com.example.springInteg.demo.model.target.CCSResponseModel;
import com.example.springInteg.demo.router.BaseServiceRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

@Configuration
public class VibeAdapterConfig {

    private static final Logger LOG = LoggerFactory.getLogger(BaseServiceRouter.class);
    @Bean
    public MessageChannel toReservationServiceChannel() {
        return new DirectChannel();
    }

    @Bean
    @ServiceActivator(inputChannel = "toReservationServiceChannel")
    public MessageHandler postReservationToService() {
        // Create a new HttpRequestExecutingMessageHandler
        HttpRequestExecutingMessageHandler messageHandler = new HttpRequestExecutingMessageHandler(
                "http://localhost:9093/vibe");
        messageHandler.setHttpMethod(HttpMethod.POST);
        messageHandler.setExpectReply(true);
        LOG.warn("messageHandler 32");
       // System.out.println("messageHandler 32");
        messageHandler.setExpectedResponseType(CCSResponseModel.class);
        messageHandler.setOutputChannelName("getVibeResponse");
        LOG.warn("messageHandler 40");
        return messageHandler;
    }

    @MessagingGateway(defaultRequestChannel = "toReservationServiceChannel")
    public interface VibeGateway {
        void postRequest(Message<ProductOrderCreate> message);
    }
}
