package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Test;
import ratings.student.domain.CourseEntity;

import java.util.List;

/**
 * Integration-level testing for a {@link CourseRepository}
 */
public class CourseRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

    @Test
    public void testRepositoryMethods() {
        CourseEntity entity = createRandomCourse();
        courseRepository.save( entity );
        List<CourseEntity> entities = courseRepository.findAll();
        Assert.assertTrue( entities.contains( entity ) );
    }
}
