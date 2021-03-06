package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Test;
import ratings.student.domain.StudentEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Integration-testing for a {@link StudentRepository} object.
 */
public class StudentRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

    @Test
    public void testSaveMethod() {
        int groupId = 1;
        int studentsCount = randomInteger( 5, 10 );
        groupRepository.save( createRandomGroup( groupId ) );

        List<StudentEntity> expectedStudents = new ArrayList<>();
        StudentEntity student;
        for( int i = 0; i < studentsCount ; i++ ) {
            student = createRandomStudent( groupId );
            expectedStudents.add( student );
            studentRepository.save( student );
        }

        List<StudentEntity> students = studentRepository.findAll();
        for( StudentEntity studentEntity: expectedStudents ) {
            Assert.assertTrue( students.contains( studentEntity ) );
        }
    }

    @Test
    public void testFindByGroupId() {
        List<StudentEntity> studentEntities = studentRepository.findByGroupId(1);
        Assert.assertNotNull(studentEntities);
        Assert.assertEquals(5, studentEntities.size());
    }
}
