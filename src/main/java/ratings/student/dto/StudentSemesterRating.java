package ratings.student.dto;

import ratings.student.domain.GroupEntity;
import ratings.student.domain.SemesterEntity;
import ratings.student.domain.StudentEntity;

/**
 * POJO for the rating for a specific student, on the specific semester.
 */
public class StudentSemesterRating {

    private StudentEntity studentEntity;

    private SemesterEntity semesterEntity;

    private GroupEntity groupEntity;

    private double academicRating;

    public void setAcademicRating(double academicRating) {
        this.academicRating = academicRating;
    }

    public double getAcademicRating() {
        return academicRating;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public void setSemesterEntity(SemesterEntity semesterEntity) {
        this.semesterEntity = semesterEntity;
    }

    public void setGroupEntity(GroupEntity groupEntity) {
        this.groupEntity = groupEntity;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public SemesterEntity getSemesterEntity() {
        return semesterEntity;
    }

    public GroupEntity getGroupEntity() {
        return groupEntity;
    }
}
