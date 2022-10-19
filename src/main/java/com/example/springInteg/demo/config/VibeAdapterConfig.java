package com.example.springInteg.demo.config;

import com.example.springInteg.demo.model.eai.ProductOrderCreate;
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

        // Setup our reply configuration - we do not expect a reply
        messageHandler.setExpectReply(false);

        return messageHandler;
    }

    @MessagingGateway(defaultRequestChannel = "toReservationServiceChannel")
    public interface PublishReservationGateway {
        void publishReservation(Message<ProductOrderCreate> message);
    }
}
