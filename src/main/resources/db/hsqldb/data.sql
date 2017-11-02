INSERT INTO courses VALUES ( 1, 'course 1', 3.5 );
INSERT INTO courses VALUES ( 2, 'course 2', 4.5 );
INSERT INTO courses VALUES ( 3, 'course 3', 3.5 );
INSERT INTO courses VALUES ( 4, 'course 4', 4.1 );

INSERT INTO groups VALUES (1, 'group name');

INSERT INTO students VALUES (1,'firstName 1','lastName 1',1);
INSERT INTO students VALUES (2,'firstName 2','lastName 2',1);
INSERT INTO students VALUES (3,'firstName 3','lastName 3',1);
INSERT INTO students VALUES (4,'firstName 4','lastName 4',1);
INSERT INTO students VALUES (5,'firstName 5','lastName 5',1);

INSERT INTO semesters VALUES (1, 'semester 1');

INSERT INTO course_students VALUES (1 ,1, 1, 60);
INSERT INTO course_students VALUES (2, 2, 1, 70);
INSERT INTO course_students VALUES (3, 3, 1, 80);
INSERT INTO course_students VALUES (4, 4, 1, 90);

INSERT INTO course_students VALUES (5, 1, 2, 55);
INSERT INTO course_students VALUES (6, 2, 2, 65);
INSERT INTO course_students VALUES (7, 3, 2, 75);
INSERT INTO course_students VALUES (8, 4, 2, 86);

INSERT INTO course_students VALUES (10, 1, 3, 51);
INSERT INTO course_students VALUES (11, 2, 3, 61);
INSERT INTO course_students VALUES (12, 3, 3, 71);
INSERT INTO course_students VALUES (13, 4, 3, 81);

INSERT INTO course_students VALUES (14, 1, 4, 66);
INSERT INTO course_students VALUES (15, 2, 4, 76);
INSERT INTO course_students VALUES (16, 3, 4, 95);
INSERT INTO course_students VALUES (17, 4, 4, 87);

INSERT INTO course_students VALUES (18, 1, 5, 96);
INSERT INTO course_students VALUES (19, 2, 5, 87);
INSERT INTO course_students VALUES (20, 3, 5, 77);
INSERT INTO course_students VALUES (21, 4, 5, 80);

INSERT INTO semester_students VALUES (1, 1);
INSERT INTO semester_students VALUES (1, 2);
INSERT INTO semester_students VALUES (1, 3);
INSERT INTO semester_students VALUES (1, 4);
INSERT INTO semester_students VALUES (1, 5);

INSERT INTO semester_courses VALUES (1, 1);
INSERT INTO semester_courses VALUES (1, 2);
INSERT INTO semester_courses VALUES (1, 3);
INSERT INTO semester_courses VALUES (1, 4);