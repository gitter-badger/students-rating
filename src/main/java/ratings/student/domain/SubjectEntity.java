package ratings.student.domain;

import ratings.student.domain.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "subjects" )
public class SubjectEntity extends BaseEntity {

    @Column( name = "credit" )
    private Double credit;
    
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCredit() {
        return credit;
    }
}
