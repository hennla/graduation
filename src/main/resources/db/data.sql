INSERT INTO USERS (ID, NAME, EMAIL, PASSWORD, ENABLED)
VALUES (1, 'user@gmail.com', 'User', '123', true),
       (2, 'admin@javaops.ru', 'Admin', '321', true);

INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);

INSERT INTO RESTAURANT (ID, NAME)
VALUES (1, 'Astoriya'),
       (2, 'Aragvi'),
       (3, 'Pesto');

INSERT INTO DISH (ID, NAME)
VALUES (1, 'Pizza Margarita'),
       (2, 'Pasta with seafood'),
       (3, 'Roll Philadelphia'),
       (4, 'Greece Salad'),
       (5, 'Tiramisu'),
       (6, 'Beef steak'),
       (7, 'Fried Eggs'),
       (8, 'Onion soup'),
       (9, 'Fish'),
       (10, 'Pork Cutlets');

INSERT INTO MENU (ID, DATE, RESTAURANT_ID)
VALUES (1, DATEADD(DAY, -2, CURRENT_DATE), 1),
       (2, DATEADD(DAY, -2, CURRENT_DATE), 2),
       (3, DATEADD(DAY, -2, CURRENT_DATE), 3),
       (4, DATEADD(DAY, -1, CURRENT_DATE), 1),
       (5, DATEADD(DAY, -1, CURRENT_DATE), 2),
       (6, DATEADD(DAY, -1, CURRENT_DATE), 3),
       (7, CURRENT_DATE, 1),
       (8, CURRENT_DATE, 2),
       (9, CURRENT_DATE, 3);
INSERT INTO MENU_DISHES (MENU_ID, DISH_ID, PRICE)
VALUES (1, 1, 23600),
       (1, 3, 5200),
       (1, 4, 15200),
       (2, 6, 23100),
       (2, 7, 6200),
       (3, 10, 36505),
       (4, 1, 25200),
       (4, 2, 16400),
       (4, 5, 9000),
       (5, 7, 6450),
       (5, 8, 4269),
       (6, 9, 39800),
       (7, 2, 17000),
       (7, 3, 5460),
       (7, 5, 8600),
       (8, 6, 25100),
       (8, 8, 4980),
       (9, 9, 31205);