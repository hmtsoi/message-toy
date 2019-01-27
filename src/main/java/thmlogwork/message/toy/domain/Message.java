package thmlogwork.message.toy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Message {

    private String message;

    private Integer senderId;
    private String senderName;
    private Integer receiverId;
    private Integer receiverName;

    private Instant messageTimestamp;

}
