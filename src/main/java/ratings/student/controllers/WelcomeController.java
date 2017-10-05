package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ratings.student.domain.StudentEntity;

import java.util.Arrays;
import java.util.List;
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

    @RequestMapping( value = "/students", method = RequestMethod.GET )
    public String students( Map<String, Object> model ) {
        StudentEntity s1 = new StudentEntity();
        s1.setFirstName( "Roman" );
        s1.setLastName( "Beskrovnyi" );
        s1.setGroupId(5);

        StudentEntity s2 = new StudentEntity();
        s2.setFirstName( "Sergey" );
        s2.setLastName( "Voroshilov" );
        s2.setGroupId(5);

        StudentEntity s3 = new StudentEntity();
        s3.setFirstName( "Nikolay" );
        s3.setLastName( "Baskov" );
        s3.setGroupId(5);

        List<StudentEntity> students = Arrays.asList( s1, s2, s3 );
        model.put( "students", students );
        return "students";
    }
}
