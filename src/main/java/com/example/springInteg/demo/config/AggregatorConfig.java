package com.example.springInteg.demo.config;


import com.example.springInteg.demo.model.eai.ProductOrderCreate;
import com.example.springInteg.demo.model.target.CCSResponseModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.integration.annotation.Aggregator;
import org.springframework.integration.annotation.Splitter;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@EnableIntegration
public class AggregatorConfig {

    @Autowired
    private PMAdapterConfig.PMGateway pmGateway;

    private static final Logger logger = LogManager.getLogger(AggregatorConfig.class);
    @Bean
    public MessageChannel pmChannel() {
        return new DirectChannel();
    }
    @Bean
    public MessageChannel ccsChannel() {
        return new DirectChannel();
    }
    @Bean
    public MessageChannel pmAggregatorChannel() {
        return new DirectChannel();
    }
    @Bean
    public MessageChannel aggregationCompletedChannel() {
        return new DirectChannel();
    }

    @Splitter(inputChannel = "pmChannel", outputChannel = "ccsChannel")
    public ProductOrderCreate splitter(ProductOrderCreate productOrderCreate) {

        String arda = "";
        pmGateway.postRequest(MessageBuilder.withPayload(productOrderCreate)
                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .build());

        /*
        logger.info("Splitting group: {}", productOrderCreate.getExternalId());
        return groupReservation.getParties().stream()
                .map(partyReservation -> MessageBuilder.withPayload(partyReservation)
                        .setHeader("RESERVATION_ID", groupReservation.getReservationId())
                        .build()).collect(Collectors.toList());

         */
        return productOrderCreate;
    }
    @Aggregator(inputChannel = "pmAggregatorChannel", outputChannel = "aggregationCompletedChannel")
    public CCSResponseModel aggregator(List<Message<ProductOrderCreate>> productOrderCreate) {
        String arda = "";
       /* CCSResponseModel groupReservation = new GroupReservation(
                (String) partyReservations.get(0).getHeaders().get("RESERVATION_ID"));
        groupReservation.getParties().addAll(partyReservations.stream()
                .map(Message::getPayload)
                .collect(Collectors.toList()));
        logger.info("Aggregating group: {} - {} parties",
                groupReservation.getReservationId(), groupReservation.getParties().size());

        */
        return null;
    }



}

