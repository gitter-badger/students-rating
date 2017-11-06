CREATE DATABASE IF NOT EXISTS studentsrating;

ALTER DATABASE studentsrating
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON studentsrating.* TO root@localhost IDENTIFIED BY 'root';

USE studentsrating;

CREATE TABLE IF NOT EXISTS semesters (
  id INT(4) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS courses (
  id INT(4) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  credit DOUBLE NOT NULL
);

CREATE TABLE IF NOT EXISTS groups (
  id INT(4) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS students (
  id INT(4) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(40) NOT NULL,
  last_name VARCHAR(40) NOT NULL,
  group_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (group_id) REFERENCES groups(id)
);

CREATE TABLE IF NOT EXISTS semester_courses (
  semester_id INT(4) UNSIGNED NOT NULL,
  course_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (semester_id) REFERENCES semesters(id),
  FOREIGN KEY (course_id) REFERENCES courses(id),
  UNIQUE (semester_id, course_id)
);

CREATE TABLE IF NOT EXISTS semester_students (
  semester_id INT(4) UNSIGNED NOT NULL,
  student_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (semester_id) REFERENCES semesters(id),
  FOREIGN KEY (student_id) REFERENCES students(id),
  UNIQUE (semester_id, student_id)
);

CREATE TABLE IF NOT EXISTS course_students (
  id INT(4) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  course_id INT(4) UNSIGNED NOT NULL,
  student_id INT(4) UNSIGNED NOT NULL,
  grade INT(2) NOT NULL,
  FOREIGN KEY (course_id) REFERENCES courses(id),
  FOREIGN KEY (student_id) REFERENCES students(id),
  UNIQUE (course_id, student_id)
);