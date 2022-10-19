package com.example.springInteg.demo.config;

import com.example.springInteg.demo.model.eai.ProductOrderCreate;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

//@MessagingGateway(name = "groupReservationChannelGateway", defaultRequestChannel = "groupReservationChannel")
@MessagingGateway(name = "pmChannelGateway", defaultRequestChannel = "pmChannel")
public interface PMChannellGateway {

    @Gateway
    void pmRequest(ProductOrderCreate productOrderCreate);
    //void publishGroupReservation(GroupReservation message);
}

