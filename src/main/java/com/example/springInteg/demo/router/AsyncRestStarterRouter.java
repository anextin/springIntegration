package com.example.springInteg.demo.router;


import com.example.springInteg.demo.model.eai.ProductOrderCreate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@Controller
@RestController
public class AsyncRestStarterRouter {


    private static final Logger LOG = LoggerFactory.getLogger(AsyncRestStarterRouter.class);


    private final MessageChannel registrationRequestChannel;

    public AsyncRestStarterRouter(@Qualifier("registrationRequest") MessageChannel registrationRequestChannel) {
        this.registrationRequestChannel = registrationRequestChannel;
    }




    @RequestMapping("/deneme")
            public ResponseEntity request(@RequestBody ProductOrderCreate productOrderCreate) {

        Message<ProductOrderCreate> message = MessageBuilder.withPayload(productOrderCreate)
                .setHeader("dateTime", OffsetDateTime.now())
                .build();

        registrationRequestChannel.send(message);
        LOG.debug("Message sent to registration request channel");


        String response = "Message sent to registration request channel";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}

