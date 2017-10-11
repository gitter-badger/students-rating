package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ratings.student.domain.StudentEntity;
import ratings.student.repositories.StudentRepository;

import java.util.List;
import java.util.Map;

/**
 * {@link Controller} for a {@link StudentEntity}.
 */
@Controller
@RequestMapping( value = "/students")
public class StudentsController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    public String showStudents( Map<String, Object> model ) {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        model.put( "students", studentEntities );
        return "students";
    }
}
