package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import ratings.student.domain.SemesterEntity;

/**
 * Integration-level testing for {@link SemesterRepository} object.
 */
public class SemesterRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

    private SemesterEntity semesterEntity = createRandomSemester();

    @Before
    public void initDB() {
        semesterRepository.save( semesterEntity );
    }

    @Test
    @Transactional()
    public void testFindByNameMethod() {
        SemesterEntity retrievingSemester = semesterRepository.findByName( semesterEntity.getName() );
        Assert.assertEquals( semesterEntity, retrievingSemester );
    }
}
