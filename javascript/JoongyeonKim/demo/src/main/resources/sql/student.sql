create table vuestudent(
   student_no int not null auto_increment,
   name varchar(200) not null,
   school_year int not null,
   grade int not null,
   reg_date timestamp not null default now(),
   primary key(student_no)
);

insert into vuestudent (name, school_year, grade) values
('이융', 1, 23);

insert into vuestudent (name, school_year, grade) values
('이황', 1, 89);

insert into vuestudent (name, school_year, grade) values
('김유신', 1, 75);

insert into vuestudent (name, school_year, grade) values
('계백', 1, 67);

insert into vuestudent (name, school_year, grade) values
('관창', 1, 57);

insert into vuestudent (name, school_year, grade) values
('궁예', 1, 43);

insert into vuestudent (name, school_year, grade) values
('장보고', 1, 68);

insert into vuestudent (name, school_year, grade) values
('이도', 1, 100);

insert into vuestudent (name, school_year, grade) values
('이방원', 1, 95);

insert into vuestudent (name, school_year, grade) values
('정몽주', 1, 93);

insert into vuestudent (name, school_year, grade) values
('견훤', 1, 39);




