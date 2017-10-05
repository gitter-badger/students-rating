package ratings.student.repositories;

import org.springframework.data.repository.Repository;
import ratings.student.domain.GroupEntity;

import java.util.List;

public interface GroupRepository extends Repository<GroupEntity, Integer> {

    List<GroupEntity> findById( Integer id );

    List<GroupEntity> findAll();

    void save( GroupEntity groupEntity );
}
