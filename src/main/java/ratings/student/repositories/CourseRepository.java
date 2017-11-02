package ratings.student.repositories;

import org.springframework.data.repository.Repository;
import ratings.student.domain.CourseEntity;

import java.util.List;

public interface CourseRepository extends Repository<CourseEntity, Integer> {

    List<CourseEntity> findAll();

    void save( CourseEntity entity );
}
