package com.example.demo;

import com.example.demo.email.SendEmailService;
import com.example.demo.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class StreamsApplication {

    @Autowired
    private SendEmailService service;

    public static void main(String[] args) {

        SpringApplication.run(StreamsApplication.class, args);

        var random = Util.genPass();
        System.out.println(random);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() throws MessagingException {

        service.sendSimpleEmail(
                "ricardo.ave.gonzalez@gmail.com",
                "Estimado usuario valorado...",
                "verificación de correo..."
        );
    }
}
