package thmlogwork.message.toy.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "messages" )
class MessageEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    @Column( name = "sender_id" )
    private Integer senderId;
    @Column( name = "sender_name" )
    private String senderName;

    @Column( name = "receiver_id" )
    private Integer receiverId;

    @Column( name = "created_timestamp" )
    private Date createdTimestamp;

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

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp( Date createdTimestamp ) {
        this.createdTimestamp = createdTimestamp;
    }
}
