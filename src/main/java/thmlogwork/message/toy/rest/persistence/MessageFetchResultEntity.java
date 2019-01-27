package thmlogwork.message.toy.rest.persistence;

import java.time.Instant;

public class MessageFetchResultEntity {

    private Long id;

    private String message;

    private Integer senderId;
    private String senderName;
    private Integer receiverId;
    private Integer receiverName;

    private Instant createdTimestamp;

    public MessageFetchResultEntity( Long id,
                                     String message,
                                     Integer senderId,
                                     String senderName,
                                     Integer receiverId,
                                     Integer receiverName,
                                     Instant createdTimestamp ) {
        this.id = id;
        this.message = message;
        this.senderId = senderId;
        this.senderName = senderName;
        this.receiverId = receiverId;
        this.receiverName = receiverName;
        this.createdTimestamp = createdTimestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId( Integer senderId ) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName( String senderName ) {
        this.senderName = senderName;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId( Integer receiverId ) {
        this.receiverId = receiverId;
    }

    public Integer getReceiverName() {
        return receiverName;
    }

    public void setReceiverName( Integer receiverName ) {
        this.receiverName = receiverName;
    }

    public Instant getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp( Instant createdTimestamp ) {
        this.createdTimestamp = createdTimestamp;
    }
}
