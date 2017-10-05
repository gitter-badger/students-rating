package ratings.student.domain;

import org.hibernate.validator.constraints.NotEmpty;
import ratings.student.domain.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        return groupId != null ? groupId.equals(that.groupId) : that.groupId == null;
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        return result;
    }
}
