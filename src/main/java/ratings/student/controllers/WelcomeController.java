package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * {@link Controller} for a welcome page.
 */
@Controller
public class WelcomeController {

    private static final String WELCOME_PAGE = "welcome";

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public @ResponseBody String welcomePage(Map<String, Object> model ) {
        model.put( "page", WELCOME_PAGE );
        model.put("message", this.message);
        model.put( "method", "GET" );
        return WELCOME_PAGE;
    }
}
