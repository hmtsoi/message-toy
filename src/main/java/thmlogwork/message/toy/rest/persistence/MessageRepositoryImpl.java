package thmlogwork.message.toy.rest.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import thmlogwork.message.toy.rest.domain.Message;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
class MessageRepositoryImpl implements MessageRepository {

    private static final String MESSAGE_FETCH_QUERY =
            "";

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private MessageJpaRepository messageJpaRepository;

    @Override public List<Message> getMessagesForUser( Integer userId ) {
        final Query query = entityManager.createNativeQuery( MESSAGE_FETCH_QUERY,
                                                             MessageFetchResultEntity.class.getSimpleName() );
        return query.getResultList();
    }
}
