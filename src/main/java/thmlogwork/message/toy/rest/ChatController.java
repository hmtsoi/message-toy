package thmlogwork.message.toy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping( value = "/chat" )
public class ChatController {

    @GetMapping
    public ModelAndView getChat() {
        final ModelAndView output = new ModelAndView( "chat" );
        output.addObject( "pageName", "new" );
        return output;
    }

}
