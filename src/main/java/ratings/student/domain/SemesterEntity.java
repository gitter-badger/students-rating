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
    @JoinTable( name = "semester_subjects", joinColumns = {
            @JoinColumn(name = "semester_id", nullable = false, updatable = false ) },
            inverseJoinColumns = { @JoinColumn( name = "subject_id", nullable = false, updatable = false) } )
    Set<SubjectEntity> subjects;

    public Set<SubjectEntity> getSubjects() {
        if ( subjects == null ) subjects = new HashSet<>();
        return subjects;
    }

    public void setSubjects(Set<SubjectEntity> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SemesterEntity that = (SemesterEntity) o;

        return subjects != null ? subjects.equals(that.subjects) : that.subjects == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (subjects != null ? subjects.hashCode() : 0);
        return result;
    }
}
