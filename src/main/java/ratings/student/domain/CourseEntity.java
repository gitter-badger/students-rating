package ratings.student.domain;

import ratings.student.domain.base.NamedEntity;

import javax.persistence.*;

@Entity
@Table( name = "courses" )
public class CourseEntity extends NamedEntity {

    @Column( name = "credit" )
    private Double credit;

    @Transient
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCredit() {
        return credit;
    }

    @Override
    public CourseEntity clone()  {
        try {
            return (CourseEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity entity = (CourseEntity) o;

        return credit != null ? credit.equals(entity.credit) : entity.credit == null;
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }
}
