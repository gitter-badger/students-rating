DROP TABLE semesters IF EXISTS;
DROP TABLE courses IF EXISTS;
DROP TABLE groups IF EXISTS;
DROP TABLE students IF EXISTS;
DROP TABLE semester_courses IF EXISTS;
DROP TABLE semester_students IF EXISTS;
DROP TABLE course_students IF EXISTS;

CREATE TABLE semesters (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30)
);

CREATE TABLE courses (
  id     INTEGER IDENTITY PRIMARY KEY,
  name   VARCHAR(100),
  credit DOUBLE
);

CREATE TABLE groups (
  id     INTEGER IDENTITY PRIMARY KEY,
  name   VARCHAR(100)
);

CREATE TABLE students (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(100),
  last_name  VARCHAR(100),
  group_id   INTEGER
);
ALTER TABLE students ADD CONSTRAINT fk_sudents_groups FOREIGN KEY (group_id) REFERENCES groups(id);

CREATE TABLE semester_courses (
  semester_id INTEGER,
  course_id  INTEGER,
  UNIQUE (semester_id,course_id)
);
ALTER TABLE semester_courses ADD CONSTRAINT fk_semesters_courses_semesters FOREIGN KEY (semester_id) REFERENCES semesters(id);
ALTER TABLE semester_courses ADD CONSTRAINT fk_semesters_courses_courses FOREIGN KEY (course_id) REFERENCES courses(id);

CREATE TABLE semester_students (
  semester_id INTEGER,
  student_id  INTEGER,
  UNIQUE (semester_id, student_id)
);
ALTER TABLE semester_students ADD CONSTRAINT fk_semester_students_semesters FOREIGN KEY (semester_id) REFERENCES semesters(id);
ALTER TABLE semester_students ADD CONSTRAINT fk_semester_students_students FOREIGN KEY (student_id) REFERENCES students(id);

CREATE TABLE course_students (
  id         INTEGER IDENTITY PRIMARY KEY,
  course_id INTEGER,
  student_id INTEGER,
  grade      INTEGER,
  UNIQUE (course_id, student_id)
);
ALTER TABLE course_students ADD CONSTRAINT fk_course_students_courses FOREIGN KEY (course_id) REFERENCES courses(id);
ALTER TABLE course_students ADD CONSTRAINT fk_course_students_students FOREIGN KEY (student_id) REFERENCES students(id);


