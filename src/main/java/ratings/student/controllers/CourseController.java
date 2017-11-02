package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ratings.student.domain.CourseEntity;
import ratings.student.repositories.CourseRepository;

import java.util.List;
import java.util.Map;

/**
 * {@link Controller} for a {@link CourseEntity}.
 */
@Controller
@RequestMapping( value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    public String showCourses( Map<String, Object> model ) {
        List<CourseEntity> courses = courseRepository.findAll();
        model.put( "courses", courses );
        return "courses";
    }
}
