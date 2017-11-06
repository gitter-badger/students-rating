##
#  Data for a test drive.
##
USE studentsrating;

# courses data:
INSERT IGNORE INTO courses VALUES ( 1, 'Linear algebra', 3.5 );
INSERT IGNORE INTO courses VALUES ( 2, 'Geometry', 4.5 );
INSERT IGNORE INTO courses VALUES ( 3, 'Mathematical analysis', 3.5 );
INSERT IGNORE INTO courses VALUES ( 4, 'Public Relations and Image Making', 4.1 );

# Groups data:
INSERT IGNORE INTO groups VALUES (1, 'Full-time group');

# Students data:
INSERT IGNORE INTO students VALUES (1,'Alexey','Pogorelov',1);
INSERT IGNORE INTO students VALUES (2,'Aleksander','Akhiezer',1);
INSERT IGNORE INTO students VALUES (3,'Lev','Landau',1);
INSERT IGNORE INTO students VALUES (4,'Isaak','Khalatnikov',1);
INSERT IGNORE INTO students VALUES (5,'Alexei','Abrikosov',1);

# Semesters data:
INSERT IGNORE INTO semesters VALUES (1, '1970-1971-1');

# course Students data:
# student 1
INSERT IGNORE INTO course_students VALUES (null, 1, 1, 60);
INSERT IGNORE INTO course_students VALUES (null, 2, 1, 70);
INSERT IGNORE INTO course_students VALUES (null, 3, 1, 80);
INSERT IGNORE INTO course_students VALUES (null, 4, 1, 90);

# student 2
INSERT IGNORE INTO course_students VALUES (null, 1, 2, 55);
INSERT IGNORE INTO course_students VALUES (null, 2, 2, 65);
INSERT IGNORE INTO course_students VALUES (null, 3, 2, 75);
INSERT IGNORE INTO course_students VALUES (null, 4, 2, 86);

# student 3
INSERT IGNORE INTO course_students VALUES (null, 1, 3, 51);
INSERT IGNORE INTO course_students VALUES (null, 2, 3, 61);
INSERT IGNORE INTO course_students VALUES (null, 3, 3, 71);
INSERT IGNORE INTO course_students VALUES (null, 4, 3, 81);

# student 4
INSERT IGNORE INTO course_students VALUES (null, 1, 4, 66);
INSERT IGNORE INTO course_students VALUES (null, 2, 4, 76);
INSERT IGNORE INTO course_students VALUES (null, 3, 4, 95);
INSERT IGNORE INTO course_students VALUES (null, 4, 4, 87);

# student 5
INSERT IGNORE INTO course_students VALUES (null, 1, 5, 96);
INSERT IGNORE INTO course_students VALUES (null, 2, 5, 87);
INSERT IGNORE INTO course_students VALUES (null, 3, 5, 77);
INSERT IGNORE INTO course_students VALUES (null, 4, 5, 80);

# Semester students data:
INSERT IGNORE INTO semester_students VALUES (1, 1);
INSERT IGNORE INTO semester_students VALUES (1, 2);
INSERT IGNORE INTO semester_students VALUES (1, 3);
INSERT IGNORE INTO semester_students VALUES (1, 4);
INSERT IGNORE INTO semester_students VALUES (1, 5);

# Semester course data:
INSERT IGNORE INTO semester_courses VALUES (1, 1);
INSERT IGNORE INTO semester_courses VALUES (1, 2);
INSERT IGNORE INTO semester_courses VALUES (1, 3);
INSERT IGNORE INTO semester_courses VALUES (1, 4);