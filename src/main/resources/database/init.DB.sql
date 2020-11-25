CREATE TABLE IF NOT EXISTS product(
    id    BIGINT auto_increment primary key,
    title varchar(45) not null,
    name  varchar(45) not null,
    price varchar(10) not null
);
