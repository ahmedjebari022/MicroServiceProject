package tn.esprit.messagemicroservice.service;

import tn.esprit.messagemicroservice.entity.Message;
import tn.esprit.messagemicroservice.repository.MessageRepository;

import java.util.List;

public interface IService {

 Message createMessage(Message message);
 List<Message> getAllMessages();
 List<Message> getMessagesBySender(String sender);
 List<Message> getMessageById(int id);
 void markAsRead(int id);
}
