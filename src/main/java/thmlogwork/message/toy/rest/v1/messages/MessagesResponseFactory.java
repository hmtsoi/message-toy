package thmlogwork.message.toy.rest.v1.messages;

import thmlogwork.message.toy.rest.domain.Message;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

import static java.time.ZoneOffset.UTC;
import static java.util.stream.Collectors.toList;

class MessagesResponseFactory {

    private MessagesResponseFactory() {
    }

    static MessagesResponse map( List<Message> messageList ) {

        final List<MessagesResponse.Message> messages = messageList.stream()
                .map( MessagesResponseFactory::map )
                .collect( toList() );
        return new MessagesResponse( messages );
    }

    static MessagesResponse.Message map( Message message ) {

        final String timestamp = message.getMessageTimestamp()
                .atZone( UTC )
                .format( DateTimeFormatter.ofLocalizedDateTime( FormatStyle.MEDIUM ) );
        return new MessagesResponse.Message(
                message.getMessage(),
                message.getSenderName(),
                timestamp
        );
    }
}
