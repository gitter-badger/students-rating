package ratings.student;

import ratings.student.domain.GroupEntity;
import ratings.student.domain.StudentEntity;
import ratings.student.domain.SubjectEntity;

import java.util.concurrent.ThreadLocalRandom;

public abstract class RandomizeData {

    public String randomHexString() {
        return Integer.toHexString( ThreadLocalRandom.current().nextInt() );
    }

    public int randomInteger( int from, int to ) {
        return ThreadLocalRandom.current().nextInt( from, to );
    }

    public double randomDouble( double from, double to ) {
        return ThreadLocalRandom.current().nextDouble( from, to );
    }

    public StudentEntity createRandomStudent( int groupId ) {
        StudentEntity student = new StudentEntity();
        student.setFirstName( randomHexString() );
        student.setLastName( randomHexString() );
        student.setGroupId( groupId );
        return student;
    }

    public GroupEntity createRandomGroup( int id ) {
        GroupEntity group = new GroupEntity();
        group.setName( randomHexString() );
        group.setId( id );
        return group;
    }

    public SubjectEntity createRandomSubject() {
        SubjectEntity entity = new SubjectEntity();
        entity.setCredit( randomDouble( 0.5, 5 ) );
        entity.setName( randomHexString() );
        return entity;
    }
}
