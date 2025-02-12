package tn.esprit.messagemicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.messagemicroservice.entity.Message;

@RestController("/message")
public class MessageRestApi {

    @GetMapping("/create-message")
    public String createMessage(@RequestBody Message message) {
        return "aa";
    }

}
