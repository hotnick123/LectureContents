create table monster(
    monster_no int not null auto_increment,
    name varchar(30) not null,
    hp int not null,
    exp int not null,
    money int not null,
    primary key(monster_no)
);