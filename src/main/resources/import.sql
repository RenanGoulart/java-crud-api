-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO tb_categories(name) VALUES ('Livros');
INSERT INTO tb_categories(name) VALUES ('Informática');

INSERT INTO tb_products(category_id, name, price) VALUES (1, 'Percy Jackson', 44.50);
INSERT INTO tb_products(category_id, name, price) VALUES (1, 'Harry Potter', 55.00);
INSERT INTO tb_products(category_id, name, price) VALUES (2, 'Teclado', 89.90);
INSERT INTO tb_products(category_id, name, price) VALUES (2, 'Mouse', 29.90);