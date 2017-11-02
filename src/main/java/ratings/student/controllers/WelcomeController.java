package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;

/**
 * {@link Controller} for a welcome page.
 */
@Controller
public class WelcomeController {

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public String welcomePage( Map<String, Object> model ) {

        model.put( "page", "welcomePage, Man." );
        model.put("message", this.message);
        model.put( "method", "GET" );
        return "welcome";
    }
}
