package thmlogwork.message.toy.rest.v1.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@JsonInclude( JsonInclude.Include.NON_NULL )
class MessagesResponse {

    private List<Message> messages;

    @AllArgsConstructor
    @Getter
    @JsonInclude( JsonInclude.Include.NON_NULL )
    public static class Message {

        private String message;
        private String senderName;
        private String messageTimestamp;
    }

}
