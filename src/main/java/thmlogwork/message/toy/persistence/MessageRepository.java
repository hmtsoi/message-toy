package thmlogwork.message.toy.persistence;

import thmlogwork.message.toy.domain.Message;

import java.util.List;

public interface MessageRepository {

    List<Message> getMessagesForUser( Integer userId );

}
