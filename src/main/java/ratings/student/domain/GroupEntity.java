package ratings.student.domain;

import ratings.student.domain.base.BaseEntity;
import ratings.student.domain.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean object for a groups table.
 */
@Entity
@Table(name = "groups")
public class GroupEntity extends NamedEntity {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
