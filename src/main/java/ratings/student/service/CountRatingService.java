package ratings.student.service;

import org.springframework.stereotype.Service;
import ratings.student.domain.*;
import ratings.student.dto.StudentSemesterRating;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The service, which count students ratings by provided arguments.
 */
@Service
public class CountRatingService extends BaseService {

    /**
     * Count students rating by provided group and semester names.
     *
     * @param groupName    the name of the group.
     * @param semesterName the name of the semester.
     * @return the collection of the {@link StudentSemesterRating} objects.
     */
    public List<StudentSemesterRating> countStudentsRating(String groupName, String semesterName ) {
        GroupEntity groupEntity = groupRepository.findByName( groupName );
        List<StudentEntity> students = studentRepository.findByGroupId( groupEntity.getId() );
        setAllCourseObjectsUnique( students );
        populateStudentGrades( students, semesterName );
        return students.stream()
                .map( studentEntity -> {
                    SemesterEntity semesterEntity = retrieveSemesterByName( studentEntity.getSemesters(), semesterName );
                    StudentSemesterRating studentSemesterRating = new StudentSemesterRating();
                    studentSemesterRating.setGroupEntity( groupEntity );
                    studentSemesterRating.setSemesterEntity( semesterEntity );
                    studentSemesterRating.setStudentEntity(studentEntity );
                    studentSemesterRating.setAcademicRating( countAcademicRating( semesterEntity.getCourses() ) );
                    return studentSemesterRating; } )
                .collect( Collectors.toList() );
    }

    /**
     * Set all collections of the {@link CourseEntity} unique.
     *
     * @param students the collection of the {@link StudentEntity} objects.
     */
    private void setAllCourseObjectsUnique(List<StudentEntity> students) {
        students.forEach( studentEntity ->
            studentEntity.setSemesters( cloneSemesterEntity( studentEntity.getSemesters() ) ));
    }

    private Set<SemesterEntity> cloneSemesterEntity( Set<SemesterEntity> semesters ) {
        Set<SemesterEntity> clonedSemesters = new HashSet<>();
        for (SemesterEntity semester: semesters) clonedSemesters.add(semester.clone());
        return clonedSemesters;
    }

    /**
     * Populate courses grade for specific student and semester.
     *
     * @param students     the collection of the {@link StudentEntity} objects.
     * @param semesterName the name of the semester.
     */
    private void populateStudentGrades( List<StudentEntity> students, String semesterName ) {
        CourseStudentEntity courseStudentEntity;
        for (StudentEntity student: students ) {
            for(CourseEntity course: retrieveSemesterByName( student.getSemesters(), semesterName ).getCourses() ) {
                courseStudentEntity = courseStudentRepository.findByCourseIdAndStudentId( course.getId(),
                                                                                          student.getId() );
                course.setGrade( courseStudentEntity.getGrade() );
            }
        }
    }

    /**
     * Count academic rating for specific student by provided personal exam session object.
     *
     * @param courseEntities the collection of the {@link CourseEntity}
     * @return academic rating in {@code double}.
     */
    private static double countAcademicRating(Set<CourseEntity> courseEntities ) {
        double amountOfAllCredits = courseEntities.stream()
                                                   .mapToDouble( CourseEntity::getCredit )
                                                   .sum();
        return courseEntities.stream()
                              .mapToDouble( courseEntity -> ratingPercourse( courseEntity, amountOfAllCredits ) )
                              .sum();
    }

    /**
     * Formula for a counting rating for a academic course.
     *
     * @param course    the academic course.
     * @param allCredits the amount of the all credits by semester.
     * @return rating per course.
     */
    private static double ratingPercourse(CourseEntity course, double allCredits ){
        return ( course.getCredit() * course.getGrade() ) / allCredits;
    }

    /**
     * Find specific collection of the {@link CourseEntity} objects
     * by provided semester name.
     *
     * @param semesters    the collection of the {@link SemesterEntity} objects.
     * @param semesterName the name of the specific semester.
     * @return the collection of the {@link CourseEntity} objects.
     */
    private SemesterEntity retrieveSemesterByName( Set<SemesterEntity> semesters, String semesterName ) {
        return semesters.stream()
                .filter( semesterEntity -> semesterEntity.getName().equals( semesterName ) )
                .findFirst().get();
    }
}
