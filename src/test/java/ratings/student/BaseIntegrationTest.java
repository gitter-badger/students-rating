package ratings.student;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import ratings.student.repositories.GroupRepository;
import ratings.student.repositories.StudentRepository;
import ratings.student.repositories.SubjectRepository;

import static org.junit.Assert.assertNotNull;

/**
 * Based class for an Integration testing.
 */
public class BaseIntegrationTest extends BaseTest {

    @Autowired
    public StudentRepository studentRepository;

    @Autowired
    public GroupRepository groupRepository;

    @Autowired
    public SubjectRepository subjectRepository;
}
