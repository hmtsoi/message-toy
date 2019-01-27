package thmlogwork.message.toy.rest.v1.messages;

import thmlogwork.message.toy.rest.domain.Message;

import java.util.List;

import static java.util.stream.Collectors.toList;

class MessagesResponseFactory {

    private MessagesResponseFactory() {
    }

    static MessagesResponse map( List<Message> messageList ) {

        final List<String> messages = messageList.stream()
                .map( m -> m.getMessage() )
                .collect( toList() );
        return new MessagesResponse( messages );
    }
}
