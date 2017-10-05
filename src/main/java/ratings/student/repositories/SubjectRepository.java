package ratings.student.repositories;

import org.springframework.data.repository.Repository;
import ratings.student.domain.SubjectEntity;

import java.util.List;

public interface SubjectRepository extends Repository<SubjectEntity, Integer> {

    List<SubjectEntity> findAll();

    void save( SubjectEntity entity );
}
