package ratings.student.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;
import ratings.student.domain.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple JavaBean object for a students table.
 */
@Entity
@Table(name = "students")
public class StudentEntity extends BaseEntity {

    @Column( name = "last_name" )
    @NotEmpty
    private String lastName;

    @Column( name = "first_name" )
    @NotEmpty
    private String firstName;

    @Column( name = "group_id" )
    private Integer groupId;


    @ManyToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL )
    @JoinTable( name = "semester_students", joinColumns = {
            @JoinColumn(name = "student_id", nullable = false, updatable = false ) },
            inverseJoinColumns = { @JoinColumn( name = "semester_id", nullable = false, updatable = false) } )
    private Set<SemesterEntity> semesters;

    public Set<SemesterEntity> getSemesters() {
        if ( semesters == null ) semesters = new HashSet<>();
        return semesters;
    }

    public void setSemesters(Set<SemesterEntity> semesters) {
        this.semesters = semesters;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    @Override
    public boolean equals(Object obj) { return EqualsBuilder.reflectionEquals(this, obj, "id", "semesters"); }

    @Override
    public int hashCode() { return HashCodeBuilder.reflectionHashCode(this, "id", "semesters"); }

    @Override
    public String toString() { return ToStringBuilder.reflectionToString(this); }
}
