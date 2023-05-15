

CREATE TABLE products
(
    id         BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    category       VARCHAR(255)   NOT NULL,
    description TEXT,
    price       int NOT NULL,
    image   VARCHAR(255)
);


INSERT INTO products (id, name,category, description, price, image)
VALUES (1, 'Футболка с логотипом','Одежда', 'Классическая футболка с логотипом на груди', 59,'top522.jpg'),
       (2, 'Джинсы', 'Одежда', 'Классические джинсы на высокой посадке', 49,'1.jpeg' ),
       (3, 'Куртка', 'Одежда', 'Куртка с капюшоном и застежкой на молнии', 99, '3.jpg'),
       (4, 'Спортивный костюм Adidas', 'Одежда','Для разминок. Заминок. И отдыха после тренировок. Этот спортивный костюм легко надевается поверх другой экипировки.',49,'adidas.jpg'),
       (5, 'Спортивный костюм Puma', 'Одежда','Мужские спортивные костюмы от PUMA — это удобная модная одежда для интенсивных тренировок, домашней и повседневной носки',99,'puma.jpg'),
       (6, 'Спортивный костюм Nike', 'Одежда','Спортивный костюм Nike можно использовать как тренировочный так и парадный.Спортивный костюм Nike Academy16 Knit состоит из кофты и штанов.',59, 'nike.jpg'),
       (7,'Ноутбук Asus TUF Dash F15 FX516PE', 'Компьютеры',  'Операционная система: Windows 10. Процессор: Intel Core  i7-11370H.', 1000, '5.png'),
       (8,'Ноутбук Asus ROG Strix G14', 'Компьютеры', 'Основу аппаратной платформы ноутбукаApple  составляют четырехъядерный процессор Intel Core i7 1185G7, видеокарта Nvidia GeForce MX450 и 16 Гб оперативной памяти.', 1000,'8.jpg'),
       (9,'Ноутбук Asus Vivobook Pro 14X', 'Компьютеры','Игровой ноутбук Asus Vivobook оборудован видеокартой GeForce RTX 3050 c 4 Гб памяти, позволяющей запускать современные игры с оптимальными настройками. ', 900,'9.jpg'),
       (10,'Ноутбук Asus ROG Strix G15', 'Компьютеры', 'Asus N7600PC-KV116W — ноутбук из серии Vivabook Pro. Его характерная особенность — 16-дюймовый экран, созданный на базе матрицы OLED. ', 1100,'10.jpg'),
       (11,'Ноутбук Asus TUF Gaming F15', 'Компьютеры', 'Лэптоп использует шестиядерный процессор Intel Core i5 11400H, видеокарту GeForce RTX 3060 с 6 Гб памяти, а также 16 Гб оперативной памяти DDR4.', 1100,'12.jpg'),
       (12,'Ноутбук Asus X409F', 'Компьютеры', 'Диагональ экрана, выполненного по технологии IPS, составляет 17,3 дюйма. Его разрешение — 1920 х 1080 пикселей, частота обновления — 144 Гц.', 900,'17.jpeg');
