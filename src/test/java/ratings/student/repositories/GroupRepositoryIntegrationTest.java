package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ratings.student.BaseIntegrationTest;
import ratings.student.RandomizeData;
import ratings.student.domain.GroupEntity;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Integration-level testing for {@link GroupEntity} object.
 */
public class GroupRepositoryIntegrationTest extends BaseIntegrationTest {

    @Test
    public void testMethods() {
        GroupEntity groupEntity = createRandomGroup( 1 );
        groupRepository.save( groupEntity );

        List<GroupEntity> groups = groupRepository.findAll();
        Assert.assertEquals( 1, groups.size() );
        Assert.assertEquals( groupEntity, groups.get( 0 ) );

        groups = groupRepository.findById( groupEntity.getId() );
        Assert.assertEquals( 1, groups.size() );
        Assert.assertEquals( groupEntity, groups.get( 0 ) );
    }
}
