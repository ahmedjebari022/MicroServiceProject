package tn.esprit.messagemicroservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.messagemicroservice.entity.Message;
import tn.esprit.messagemicroservice.repository.MessageRepository;

import java.util.List;
@AllArgsConstructor
@Service
@RequestMapping("/service")
public class ServiceImp implements IService{
    MessageRepository messageRepos;


    @Override
    public Message createMessage(Message message) {
        return message;
    }

    @Override
    public List<Message> getAllMessages() {
        return List.of();
    }

    @Override
    public List<Message> getMessagesBySender(String sender) {
        return List.of();
    }

    @Override
    public List<Message> getMessageById(int id) {
        return List.of();
    }

    @Override
    public void markAsRead(int id) {

    }
}
