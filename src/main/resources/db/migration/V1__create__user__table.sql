DROP TABLE IF EXISTS `tb_user`;
create table if not exists tb_user(
    id int primary key,
    username varchar(20),
    password varchar(20),
    age int,
    sex char(1),
    email varchar(20)
)