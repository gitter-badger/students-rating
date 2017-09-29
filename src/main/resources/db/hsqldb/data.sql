INSERT INTO subjects VALUES ( 1, 'subject 1', 3.5 );
INSERT INTO subjects VALUES ( 2, 'subject 2', 4.5 );
INSERT INTO subjects VALUES ( 3, 'subject 3', 3.5 );
INSERT INTO subjects VALUES ( 4, 'subject 4', 4.1 );

INSERT INTO groups VALUES (1, 'group name');

INSERT INTO students VALUES (1,'firstName 1','lastName 1',1);
INSERT INTO students VALUES (2,'firstName 2','lastName 2',1);
INSERT INTO students VALUES (3,'firstName 3','lastName 3',1);
INSERT INTO students VALUES (4,'firstName 4','lastName 4',1);
INSERT INTO students VALUES (5,'firstName 5','lastName 5',1);

INSERT INTO semesters VALUES (1, 'semester 1');

INSERT INTO subject_students VALUES (1, 1, 60);
INSERT INTO subject_students VALUES (2, 1, 70);
INSERT INTO subject_students VALUES (3, 1, 80);
INSERT INTO subject_students VALUES (4, 1, 90);

INSERT INTO subject_students VALUES (1, 2, 55);
INSERT INTO subject_students VALUES (2, 2, 65);
INSERT INTO subject_students VALUES (3, 2, 75);
INSERT INTO subject_students VALUES (4, 2, 86);

INSERT INTO subject_students VALUES (1, 3, 51);
INSERT INTO subject_students VALUES (2, 3, 61);
INSERT INTO subject_students VALUES (3, 3, 71);
INSERT INTO subject_students VALUES (4, 3, 81);

INSERT INTO subject_students VALUES (1, 4, 66);
INSERT INTO subject_students VALUES (2, 4, 76);
INSERT INTO subject_students VALUES (3, 4, 95);
INSERT INTO subject_students VALUES (4, 4, 87);

INSERT INTO subject_students VALUES (1, 5, 96);
INSERT INTO subject_students VALUES (2, 5, 87);
INSERT INTO subject_students VALUES (3, 5, 77);
INSERT INTO subject_students VALUES (4, 5, 80);

INSERT INTO semester_students VALUES (1, 1);
INSERT INTO semester_students VALUES (1, 2);
INSERT INTO semester_students VALUES (1, 3);
INSERT INTO semester_students VALUES (1, 4);
INSERT INTO semester_students VALUES (1, 5);

INSERT INTO semester_subjects VALUES (1, 1);
INSERT INTO semester_subjects VALUES (1, 2);
INSERT INTO semester_subjects VALUES (1, 3);
INSERT INTO semester_subjects VALUES (1, 4);