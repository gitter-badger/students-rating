##
#  Data for a test drive.
##

# Subjects data:
INSERT IGNORE INTO subjects VALUES ( 1, 'subject 1', 3.5 );
INSERT IGNORE INTO subjects VALUES ( 2, 'subject 2', 4.5 );
INSERT IGNORE INTO subjects VALUES ( 3, 'subject 3', 3.5 );
INSERT IGNORE INTO subjects VALUES ( 4, 'subject 4', 4.1 );

# Groups data:
INSERT IGNORE INTO groups VALUES (1, 'group name');

# Students data:
INSERT IGNORE INTO students VALUES (1,'student 1',1);
INSERT IGNORE INTO students VALUES (2,'student 2',1);
INSERT IGNORE INTO students VALUES (3,'student 3',1);
INSERT IGNORE INTO students VALUES (4,'student 4',1);
INSERT IGNORE INTO students VALUES (5,'student 5',1);

# Semesters data:
INSERT IGNORE INTO semesters VALUES (1, 'semester 1');

# Subject Students data:
# student 1
INSERT IGNORE INTO subject_students VALUES (1, 1, 60);
INSERT IGNORE INTO subject_students VALUES (2, 1, 70);
INSERT IGNORE INTO subject_students VALUES (3, 1, 80);
INSERT IGNORE INTO subject_students VALUES (4, 1, 90);

# student 2
INSERT IGNORE INTO subject_students VALUES (1, 2, 55);
INSERT IGNORE INTO subject_students VALUES (2, 2, 65);
INSERT IGNORE INTO subject_students VALUES (3, 2, 75);
INSERT IGNORE INTO subject_students VALUES (4, 2, 86);

# student 3
INSERT IGNORE INTO subject_students VALUES (1, 3, 51);
INSERT IGNORE INTO subject_students VALUES (2, 3, 61);
INSERT IGNORE INTO subject_students VALUES (3, 3, 71);
INSERT IGNORE INTO subject_students VALUES (4, 3, 81);

# student 4
INSERT IGNORE INTO subject_students VALUES (1, 4, 66);
INSERT IGNORE INTO subject_students VALUES (2, 4, 76);
INSERT IGNORE INTO subject_students VALUES (3, 4, 95);
INSERT IGNORE INTO subject_students VALUES (4, 4, 87);

# student 5
INSERT IGNORE INTO subject_students VALUES (1, 5, 96);
INSERT IGNORE INTO subject_students VALUES (2, 5, 87);
INSERT IGNORE INTO subject_students VALUES (3, 5, 77);
INSERT IGNORE INTO subject_students VALUES (4, 5, 80);

# Semester students data:
INSERT IGNORE INTO semester_students VALUES (1, 1);
INSERT IGNORE INTO semester_students VALUES (1, 2);
INSERT IGNORE INTO semester_students VALUES (1, 3);
INSERT IGNORE INTO semester_students VALUES (1, 4);
INSERT IGNORE INTO semester_students VALUES (1, 5);

# Semester subject data:
INSERT IGNORE INTO semester_subjects VALUES (1, 1);
INSERT IGNORE INTO semester_subjects VALUES (1, 2);
INSERT IGNORE INTO semester_subjects VALUES (1, 3);
INSERT IGNORE INTO semester_subjects VALUES (1, 4);