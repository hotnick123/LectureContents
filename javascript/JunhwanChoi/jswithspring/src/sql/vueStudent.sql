create table vuestudent(
    student_no int not null auto_increment,
    name varchar(200) not null,
    grade float not null,

    reg_date timestamp not null default now(),
    primary key(student_no)
);

insert into vuestudent (name, grade) values
('최준환', 3.5);

insert into vuestudent (name, grade) values
('조현철', 4.5);
