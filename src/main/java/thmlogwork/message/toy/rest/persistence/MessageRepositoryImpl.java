package thmlogwork.message.toy.rest.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import thmlogwork.message.toy.rest.domain.Message;

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
}
