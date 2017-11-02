package ratings.student.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "course_students" )
public class CourseStudentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name = "course_id" )
    private int courseId;

    @Column( name = "student_id" )
    private int studentId;

    @Column( name = "grade" )
    private int grade;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getStudentId() {
        return studentId;
    }


}
