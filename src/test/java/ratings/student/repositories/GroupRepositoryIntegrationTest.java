package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Test;
import ratings.student.domain.GroupEntity;

import java.util.List;

/**
 * Integration-level testing for {@link GroupEntity} object.
 */
public class GroupRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

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
