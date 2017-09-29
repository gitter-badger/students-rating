DROP TABLE semesters IF EXISTS;
DROP TABLE subjects IF EXISTS;
DROP TABLE groups IF EXISTS;
DROP TABLE students IF EXISTS;
DROP TABLE semester_subjects IF EXISTS;
DROP TABLE semester_students IF EXISTS;
DROP TABLE subject_students IF EXISTS;

CREATE TABLE semesters (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30)
);

CREATE TABLE subjects (
  id     INTEGER IDENTITY PRIMARY KEY,
  name   VARCHAR(30),
  credit DOUBLE
);

CREATE TABLE groups (
  id     INTEGER IDENTITY PRIMARY KEY,
  name   VARCHAR(30)
);

CREATE TABLE students (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(40),
  last_name  VARCHAR(40),
  group_id   INTEGER
);
ALTER TABLE students ADD CONSTRAINT fk_sudents_groups FOREIGN KEY (group_id) REFERENCES groups(id);

CREATE TABLE semester_subjects (
  semester_id INTEGER,
  subject_id  INTEGER,
  UNIQUE (semester_id,subject_id)
);
ALTER TABLE semester_subjects ADD CONSTRAINT fk_semesters_subjects_semesters FOREIGN KEY (semester_id) REFERENCES semesters(id);
ALTER TABLE semester_subjects ADD CONSTRAINT fk_semesters_subjects_subjects FOREIGN KEY (subject_id) REFERENCES subjects(id);

CREATE TABLE semester_students (
  semester_id INTEGER,
  student_id  INTEGER,
  UNIQUE (semester_id, student_id)
);
ALTER TABLE semester_students ADD CONSTRAINT fk_semester_students_semesters FOREIGN KEY (semester_id) REFERENCES semesters(id);
ALTER TABLE semester_students ADD CONSTRAINT fk_semester_students_students FOREIGN KEY (student_id) REFERENCES students(id);

CREATE TABLE subject_students (
  subject_id INTEGER,
  student_id INTEGER,
  grade      INTEGER,
  UNIQUE (subject_id, student_id)
);
ALTER TABLE subject_students ADD CONSTRAINT fk_subject_students_subjects FOREIGN KEY (subject_id) REFERENCES subjects(id);
ALTER TABLE subject_students ADD CONSTRAINT fk_subject_students_students FOREIGN KEY (student_id) REFERENCES students(id);


