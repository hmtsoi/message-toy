package thmlogwork.message.toy.rest.v1.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thmlogwork.message.toy.rest.ApiPaths;
import thmlogwork.message.toy.rest.domain.Message;
import thmlogwork.message.toy.rest.domain.MessageService;

import java.util.List;

@RestController
@RequestMapping( value = ApiPaths.MESSAGES_PATH, produces = MediaType.APPLICATION_JSON_VALUE )
public class MessagesController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<MessagesResponse> getMessages() {
        final List<Message> messages =
                messageService.getMessagesForUser( getUserId() );
        final MessagesResponse response = MessagesResponseFactory.map( messages );
        return new ResponseEntity<>( response, HttpStatus.OK );
    }

    private Integer getUserId() {
        // TODO get user id by the authorization token in the request
        return 10;
    }
}
