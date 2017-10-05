package ratings.student.domain;

import com.fasterxml.jackson.databind.util.Named;
import ratings.student.domain.base.BaseEntity;
import ratings.student.domain.base.NamedEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Simple JavaBean object for a semesters table.
 */
@Entity
@Table( name = "semesters" )
public class SemesterEntity extends NamedEntity {
}
