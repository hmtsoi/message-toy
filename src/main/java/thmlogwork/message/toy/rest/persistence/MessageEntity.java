package thmlogwork.message.toy.rest.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table( name = "messages" )
class MessageEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    @Column( name = "sender_id" )
    private Integer senderId;
    @Column( name = "receiver_id" )
    private Integer receiverId;

    @Column( name = "created_timestamp" )
    private Instant createdTimestamp;

    public MessageEntity() {
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

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId( Integer receiverId ) {
        this.receiverId = receiverId;
    }

    public Instant getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp( Instant createdTimestamp ) {
        this.createdTimestamp = createdTimestamp;
    }
}
