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
    @NotEmpty
    private Integer groupId;


    List<SemesterEntity> semesterEntities;

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
}
