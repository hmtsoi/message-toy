package thmlogwork.message.toy.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/health", produces = MediaType.APPLICATION_JSON_VALUE )
public class HealthController {

    @GetMapping
    public ResponseEntity getHealth() {
        return ResponseEntity.ok( new Object() {
            public final String message = "healthy";
        } );
    }

}
