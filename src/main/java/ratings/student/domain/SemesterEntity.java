package ratings.student.domain;

import ratings.student.domain.base.NamedEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple JavaBean object for a semesters table.
 */
@Entity
@Table( name = "semesters" )
public class SemesterEntity extends NamedEntity {

    @ManyToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL )
    @JoinTable( name = "semester_courses", joinColumns = {
            @JoinColumn(name = "semester_id", nullable = false, updatable = false ) },
            inverseJoinColumns = { @JoinColumn( name = "course_id", nullable = false, updatable = false) } )
    private Set<CourseEntity> courses;

    public Set<CourseEntity> getCourses() {
        if ( courses == null ) courses = new HashSet<>();
        return courses;
    }

    public void setCourses(Set<CourseEntity> courses) {
        this.courses = courses;
    }

    @Override
    public SemesterEntity clone()  {
        try {
            SemesterEntity entity = (SemesterEntity) super.clone();
            Set<CourseEntity> clonedCourses = new HashSet<>();
            for(CourseEntity course: entity.getCourses()) {
                clonedCourses.add(course.clone());
            }
            entity.setCourses(clonedCourses);
            return entity;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SemesterEntity that = (SemesterEntity) o;

        return courses != null ? courses.equals(that.courses) : that.courses == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (courses != null ? courses.hashCode() : 0);
        return result;
    }
}
