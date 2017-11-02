package ratings.student.repositories;


import org.springframework.data.repository.Repository;
import ratings.student.domain.SemesterEntity;

import java.util.List;

public interface SemesterRepository extends Repository<SemesterEntity, Integer> {

    SemesterEntity findByName( String name );

    void save( SemesterEntity groupEntity );
}
