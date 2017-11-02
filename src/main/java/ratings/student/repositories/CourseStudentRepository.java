package ratings.student.repositories;

import org.springframework.data.repository.Repository;
import ratings.student.domain.CourseStudentEntity;

public interface CourseStudentRepository extends Repository<CourseStudentEntity, Integer> {

    CourseStudentEntity findByGrade(int grade );

    CourseStudentEntity findByCourseIdAndStudentId(int courseId, int studentId );

    void save(CourseStudentEntity courseStudentEntity);
}
