package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Test;
import ratings.student.domain.SubjectEntity;

import java.util.List;

/**
 * Integration-level testing for a {@link SubjectRepository}
 */
public class SubjectRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

    @Test
    public void testRepositoryMethods() {
        SubjectEntity entity = createRandomSubject();

        subjectRepository.save( entity );

        List<SubjectEntity> entities = subjectRepository.findAll();

        Assert.assertTrue( entities.contains( entity ) );
    }
}
