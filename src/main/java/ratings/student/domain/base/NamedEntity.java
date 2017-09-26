package ratings.student.domain.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Simple JavaBean object adds a name property to {@link BaseEntity}.
 * Used as a bse class for object needing these properties.
 */
@MappedSuperclass
public abstract class NamedEntity extends BaseEntity {

    @Column( name = "name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
