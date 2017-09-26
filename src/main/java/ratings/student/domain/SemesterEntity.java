package ratings.student.domain;

import ratings.student.domain.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Simple JavaBean object for a semesters table.
 */
@Entity
@Table(name = "semesters")
public class SemesterEntity extends BaseEntity {

    private Integer studentId;

    public SemesterEntity( Integer studentId ) {
        this.studentId = studentId;
    }

    List<SubjectEntity> subjectEntities;
}
