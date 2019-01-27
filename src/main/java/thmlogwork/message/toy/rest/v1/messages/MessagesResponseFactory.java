package thmlogwork.message.toy.rest.v1.messages;

import thmlogwork.message.toy.rest.domain.Message;

import java.util.List;

public class MessagesResponseFactory {

    private MessagesResponseFactory() {
    }

    public static MessagesResponse map( List<Message> messageList ) {
        return new MessagesResponse();
    }
}
