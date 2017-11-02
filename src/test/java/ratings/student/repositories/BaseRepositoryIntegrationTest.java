package ratings.student.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ratings.student.RandomizeData;

import static org.junit.Assert.assertNotNull;

/**
 * Base Integration test object for all tests.
 */
@RunWith( SpringRunner.class )
@SpringBootTest
public class BaseRepositoryIntegrationTest extends RandomizeData {

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    SemesterRepository semesterRepository;

    @Autowired
    CourseStudentRepository courseStudentRepository;

    @Test
    public void testBaseRepository() {
        assertNotNull( groupRepository );
        assertNotNull( studentRepository );
        assertNotNull(courseRepository);
        assertNotNull( semesterRepository );
        assertNotNull(courseStudentRepository);
    }
}
