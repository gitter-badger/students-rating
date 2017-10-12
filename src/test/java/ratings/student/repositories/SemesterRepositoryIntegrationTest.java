package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import ratings.student.domain.SemesterEntity;

/**
 * Integration-level testing for {@link SemesterRepository} object.
 */
public class SemesterRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

    @Test
    @Transactional()
    @Rollback( false )
    public void testFindAll() {
        SemesterEntity semesterEntity = createRandomSemester();
        semesterRepository.save( semesterEntity );
        SemesterEntity retrievingSemester = semesterRepository.findByName( semesterEntity.getName() );
        Assert.assertEquals( semesterEntity, retrievingSemester );
    }
}
