package ratings.student.domain;

import ratings.student.domain.base.NamedEntity;

import javax.persistence.*;

@Entity
@Table( name = "subjects" )
public class SubjectEntity extends NamedEntity {

    @Column( name = "credit" )
    private Double credit;

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCredit() {
        return credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectEntity entity = (SubjectEntity) o;

        return credit != null ? credit.equals(entity.credit) : entity.credit == null;
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }
}
