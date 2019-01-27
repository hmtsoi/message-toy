package thmlogwork.message.toy.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thmlogwork.message.toy.persistence.MessageRepository;

import java.util.List;
import java.util.Objects;

@Service
class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override public List<Message> getMessagesForUser( Integer userId ) {
        Objects.requireNonNull( userId );
        return messageRepository.getMessagesForUser( userId );
    }
}
