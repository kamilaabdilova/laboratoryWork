CREATE TABLE users (
                       id INT PRIMARY KEY,
                       email varchar(45) not null UNIQUE,
                       password varchar(200) not null,
                       account varchar(25) not null

);
INSERT INTO users (id, email, account, password) VALUES (1, 'john@gmail.com', 'john25', 'john1');
INSERT INTO users (id, email, account, password) VALUES (2, 'mary@gmail.com', 'mary56', 'mar45');

CREATE TABLE products
(
    id          INT PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    description TEXT,
    price       int NOT NULL,
    image   VARCHAR(255)
);


INSERT INTO products (id, name, description, price, image)
VALUES (1, 'Футболка с логотипом', 'Классическая футболка с логотипом на груди', 29,
        'images/1.jpeg'),
       (2, 'Джинсы', 'Классические джинсы на высокой посадке', 49, 'images/top522.jpg'),
       (3, 'Куртка', 'Куртка с капюшоном и застежкой на молнии', 99, 'images/3.jpg');