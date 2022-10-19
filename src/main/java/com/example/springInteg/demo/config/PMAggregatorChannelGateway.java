package com.example.springInteg.demo.config;

import com.example.springInteg.demo.model.eai.ProductOrderCreate;
import com.example.springInteg.demo.model.target.CCSResponseModel;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

//@MessagingGateway(name = "reservationAggregatorChannelGateway", defaultRequestChannel = "reservationAggregatorChannel")
@MessagingGateway(name = "pmAggregatorChannelGateway", defaultRequestChannel = "pmAggregatorChannel")
public interface PMAggregatorChannelGateway {
    @Gateway
    void aggregateRequest(CCSResponseModel ccsResponseModel);

}
