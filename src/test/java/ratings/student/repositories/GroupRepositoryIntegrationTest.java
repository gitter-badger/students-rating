package ratings.student.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ratings.student.domain.GroupEntity;

import java.util.List;

/**
 * Integration-level testing for {@link GroupRepository} object.
 */
public class GroupRepositoryIntegrationTest extends BaseRepositoryIntegrationTest {

    private GroupEntity groupEntity = createRandomGroup(1);

    @Before
    public void initDB() {
        groupRepository.save(groupEntity);
    }

    @Test
    public void testSaveAndFindAllMethods() {
        List<GroupEntity> groups = groupRepository.findAll();
        Assert.assertEquals(1, groups.size());
        Assert.assertEquals(groupEntity, groups.get(0));
    }

    @Test
    public void testFindByIdMethod() {
        GroupEntity group = groupRepository.findById(groupEntity.getId());
        Assert.assertNotNull(group);
        Assert.assertEquals(groupEntity, group);
    }
}
