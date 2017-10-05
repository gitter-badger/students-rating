package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ratings.student.domain.StudentEntity;
import ratings.student.domain.SubjectEntity;
import ratings.student.repositories.StudentRepository;
import ratings.student.repositories.SubjectRepository;

import java.util.List;
import java.util.Map;

/**
 * {@link Controller} for a welcome page.
 */
@Controller
public class WelcomeController {

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public String welcomePage( Map<String, Object> model ) {
        model.put( "page", "welcomePage, Man." );
        model.put("message", this.message);
        model.put( "method", "GET" );
        return "welcome";
    }

    @RequestMapping( value = "/students", method = RequestMethod.GET )
    public String showStudents( Map<String, Object> model ) {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        model.put( "students", studentEntities );
        return "students";
    }

    @RequestMapping( value = "/subjects", method = RequestMethod.GET )
    public String showSubjects( Map<String, Object> model ) {
        List<SubjectEntity> subjectEntities = subjectRepository.findAll();
        model.put( "subjects", subjectEntities );
        return "subjects";
    }
}
