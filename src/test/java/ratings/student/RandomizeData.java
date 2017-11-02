package ratings.student;

import ratings.student.domain.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class RandomizeData {

    protected String randomHexString() {
        return Integer.toHexString( ThreadLocalRandom.current().nextInt() );
    }

    protected int randomInteger(int from, int to) {
        return ThreadLocalRandom.current().nextInt( from, to );
    }

    protected double randomDouble(double from, double to) {
        return ThreadLocalRandom.current().nextDouble( from, to );
    }

    protected StudentEntity createRandomStudent( int groupId ) {
        StudentEntity student = new StudentEntity();
        student.setFirstName( randomHexString() );
        student.setLastName( randomHexString() );
        student.setGroupId( groupId );
        return student;
    }

    protected GroupEntity createRandomGroup( int id ) {
        GroupEntity group = new GroupEntity();
        group.setName( randomHexString() );
        group.setId( id );
        return group;
    }

    protected CourseEntity createRandomCourse() {
        CourseEntity entity = new CourseEntity();
        entity.setCredit( randomDouble( 0.5, 5 ) );
        entity.setName( randomHexString() );
        return entity;
    }

    protected SemesterEntity createRandomSemester() {
        SemesterEntity semesterEntity = new SemesterEntity();
        semesterEntity.setName( randomHexString() );
        List<CourseEntity> courseList = Stream.of(1,2,3,4,5)
                .map(it -> createRandomCourse())
                .collect(Collectors.toList());
        Set<CourseEntity> courses = new HashSet<>();
        courses.addAll( courseList );
        semesterEntity.setCourses( courses );
        return semesterEntity;
    }
}
