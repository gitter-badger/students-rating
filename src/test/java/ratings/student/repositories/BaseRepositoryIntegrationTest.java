package ratings.student.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ratings.student.RandomizeData;

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
    SubjectRepository subjectRepository;

    /**
     * This test needs to be for making it as Base Test.
     */
    @Test
    public void testBaseRepository() {}
}
