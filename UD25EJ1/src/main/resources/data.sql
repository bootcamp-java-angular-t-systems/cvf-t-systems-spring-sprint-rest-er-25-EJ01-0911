-- Inserts para Fabricantes
INSERT INTO fabricantes (codigo, nombre) VALUES (1, 'Fabricante 1');
INSERT INTO fabricantes (codigo, nombre) VALUES (2, 'Fabricante 2');
INSERT INTO fabricantes (codigo, nombre) VALUES (3, 'Fabricante 3');
INSERT INTO fabricantes (codigo, nombre) VALUES (4, 'Fabricante 4');
INSERT INTO fabricantes (codigo, nombre) VALUES (5, 'Fabricante 5');

-- Inserts para Articulos
INSERT INTO articulos (codigo, nombre, precio, fabricante_id) VALUES (1, 'Articulo 1', 10.5, 1);
INSERT INTO articulos (codigo, nombre, precio, fabricante_id) VALUES (2, 'Articulo 2', 20.0, 1);
INSERT INTO articulos (codigo, nombre, precio, fabricante_id) VALUES (3, 'Articulo 3', 15.75, 2);
INSERT INTO articulos (codigo, nombre, precio, fabricante_id) VALUES (4, 'Articulo 4', 30.2, 2);
INSERT INTO articulos (codigo, nombre, precio, fabricante_id) VALUES (5, 'Articulo 5', 25.0, 3);
