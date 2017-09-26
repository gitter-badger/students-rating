package ratings.student.domain;

import ratings.student.domain.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean object for a groups table.
 */
@Entity
@Table(name = "groups")
public class GroupEntity extends BaseEntity {
}
