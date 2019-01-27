package thmlogwork.message.toy.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import thmlogwork.message.toy.domain.Message;

import java.sql.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Repository
class MessageRepositoryImpl implements MessageRepository {

    @Autowired
    private MessageJpaRepository messageJpaRepository;

    @Override
    public List<Message> getMessagesForUser( Integer userId ) {
        final List<MessageEntity> entities = messageJpaRepository.getMessagesForUser( userId );
        return entities.stream()
                .map( e -> new Message( e.getMessage(),
                                        e.getSenderId(),
                                        e.getSenderName(),
                                        e.getReceiverId(),
                                        null,
                                        e.getCreatedTimestamp().toInstant() )
                )
                .collect( toList() );
    }

    @Override
    public Long saveMessage( Message message, Integer userId ) {
        final MessageEntity entity = new MessageEntity();
        entity.setMessage( message.getMessage() );
        entity.setSenderId( userId );
        entity.setSenderName( message.getSenderName() );
        entity.setReceiverId( userId );
        entity.setCreatedTimestamp( Date.from( message.getMessageTimestamp() ) );

        final MessageEntity savedEntity = messageJpaRepository.saveAndFlush( entity );
        return savedEntity.getId();
    }
}
