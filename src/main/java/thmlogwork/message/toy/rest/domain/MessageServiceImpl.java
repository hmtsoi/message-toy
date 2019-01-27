package thmlogwork.message.toy.rest.domain;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thmlogwork.message.toy.rest.persistence.MessageRepository;

import java.util.List;

@Service
class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override public List<Message> getMessagesForUser( Integer userId ) {
        throw new NotImplementedException( "" );
    }
}
