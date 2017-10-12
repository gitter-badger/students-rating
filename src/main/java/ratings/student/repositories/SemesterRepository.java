package ratings.student.repositories;


import org.springframework.data.repository.Repository;
import ratings.student.domain.SemesterEntity;

import java.util.List;

public interface SemesterRepository extends Repository<SemesterEntity, Integer> {

    List<SemesterEntity> findById(Integer id );

    SemesterEntity findByName( String name );

    List<SemesterEntity> findAll();

    void save( SemesterEntity groupEntity );
}
