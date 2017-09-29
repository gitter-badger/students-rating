package ratings.student.domain;

import ratings.student.domain.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Simple JavaBean object for a semesters table.
 */
@Entity
@Table( name = "semesters" )
public class SemesterEntity extends BaseEntity {

//    @OneToMany( mappedBy =  "subject_id" )
//    @JoinColumn( name = "subjects" )
//    List<SubjectEntity> subjectEntities;
}
