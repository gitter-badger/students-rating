package ratings.student.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import ratings.student.domain.StudentEntity;

import java.util.List;

public interface StudentRepository extends Repository<StudentEntity, Integer> {

    List<StudentEntity> findAll();

    StudentEntity findById( int id );

    void save(StudentEntity entity);
}
