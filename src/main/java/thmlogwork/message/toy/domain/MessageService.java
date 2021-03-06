package thmlogwork.message.toy.domain;

import java.util.List;

public interface MessageService {

    List<Message> getMessagesForUser( Integer userId );

    Long saveMessage( Message message, Integer userId);

}
