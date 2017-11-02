package ratings.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import ratings.student.repositories.GroupRepository;
import ratings.student.repositories.StudentRepository;
import ratings.student.repositories.CourseRepository;
import ratings.student.repositories.CourseStudentRepository;

/**
 * The base object for all services.
 */
public class BaseService {

    @Autowired
    protected StudentRepository studentRepository;

    @Autowired
    protected GroupRepository groupRepository;

    @Autowired
    protected CourseRepository courseRepository;

    @Autowired
    protected CourseStudentRepository courseStudentRepository;
}
