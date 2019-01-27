package thmlogwork.message.toy.rest.persistence;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Repository;
import thmlogwork.message.toy.rest.domain.Message;

import java.util.List;

@Repository
class MessageRepositoryImpl implements MessageRepository {

    @Override public List<Message> getMessagesForUser( Integer userId ) {
        throw new NotImplementedException( "" );
    }
}
