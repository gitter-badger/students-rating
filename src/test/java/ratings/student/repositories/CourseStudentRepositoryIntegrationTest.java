package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Test;
import ratings.student.domain.CourseStudentEntity;

/**
 * Integration-level tesing for {@link CourseStudentRepository} object.
 */
public class CourseStudentRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

    @Test
    public void testSaveMethod() {
        CourseStudentEntity entity = courseStudentRepository.findByGrade( 60 );
        Assert.assertNotNull(entity);
    }

    @Test
    public void testFindByCourseAndStudentIds() {
        CourseStudentEntity entity = courseStudentRepository.findByCourseIdAndStudentId(1,1);
        Assert.assertNotNull(entity);
    }
}
