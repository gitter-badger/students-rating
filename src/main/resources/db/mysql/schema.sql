CREATE DATABASE IF NOT EXISTS studentsrating;

USE studentsrating;

CREATE TABLE IF NOT EXISTS semesters (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS subjects (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  credit DOUBLE NOT NULL
);

CREATE TABLE IF NOT EXISTS groups (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS students (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(40) NOT NULL,
  last_name VARCHAR(40) NOT NULL,
  group_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (group_id) REFERENCES groups(id)
);

CREATE TABLE IF NOT EXISTS semester_subjects (
  semester_id INT(4) UNSIGNED NOT NULL,
  subject_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (semester_id) REFERENCES semesters(id),
  FOREIGN KEY (subject_id) REFERENCES subjects(id),
  UNIQUE (semester_id, subject_id)
);

CREATE TABLE IF NOT EXISTS semester_students (
  semester_id INT(4) UNSIGNED NOT NULL,
  student_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (semester_id) REFERENCES semesters(id),
  FOREIGN KEY (student_id) REFERENCES students(id),
  UNIQUE (semester_id, student_id)
);

CREATE TABLE IF NOT EXISTS subject_students (
  subject_id INT(4) UNSIGNED NOT NULL,
  student_id INT(4) UNSIGNED NOT NULL,
  grade INT(2) NOT NULL,
  FOREIGN KEY (subject_id) REFERENCES subjects(id),
  FOREIGN KEY (student_id) REFERENCES students(id),
  UNIQUE (subject_id, student_id)
);