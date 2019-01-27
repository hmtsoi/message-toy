package thmlogwork.message.toy.rest.persistence;

import thmlogwork.message.toy.rest.domain.Message;

import java.util.List;

public interface MessageRepository {

    List<Message> getMessagesForUser( Integer userId );

}
