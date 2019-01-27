package thmlogwork.message.toy.rest.domain;

import java.util.List;

public interface MessageService {

    List<Message> getMessagesForUser( Integer userId );

}
