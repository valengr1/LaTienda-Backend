use latienda;

insert into condicion_tributaria (descripcion) values ("Responsable inscripto"); /*id: 1*/
insert into condicion_tributaria (descripcion) values ("Monotributo"); /*id: 2*/
insert into condicion_tributaria (descripcion) values ("Exento"); /*id: 3*/
insert into condicion_tributaria (descripcion) values ("No Responsable"); /*id: 4*/
insert into condicion_tributaria (descripcion) values ("Consumidor Final"); /*id: 5*/

select * from condicion_tributaria;

/*CUIT: 2 dígitos aleatorios, 8 dígitos que corresponden al número de sociedad asignado, 1 digito verificador*/
insert into tienda (cuit, descripcion, condiciontributaria_id) values (21246876548, "tienda de ropa multimarca",1); /*cuit: 21246876548*/
select * from tienda;

insert into sucursal (tienda_cuit, direccion) values (21246876548, "Los alamos 731 - Tucuman"); /*id: 1 - Centro*/
insert into sucursal (tienda_cuit, direccion) values (21246876548, "Santa fe 900 - Tucuman"); /*id: 3 - Norte*/
select * from sucursal;


insert into vendedor (legajo,nombre,apellido,mail,usuario,contraseña,sucursal_id) values ("50545","Valentin","Gonzalez Reinoso", "valen@gmail.com", "valengr1", "123", 1);
insert into vendedor (legajo,nombre,apellido,mail,usuario,contraseña,sucursal_id) values ("50234","Jose","Bovi", "jb@gmail.com", "josebv", "456", 1);
insert into vendedor (legajo,nombre,apellido,mail,usuario,contraseña,sucursal_id) values ("50114","Natalia","Morales", "nati@gmail.com", "natim", "789", 3);
insert into vendedor (legajo,nombre,apellido,mail,usuario,contraseña,sucursal_id) values ("50377","Matias","Molina", "matim@gmail.com", "matim", "111", 3);

select * from vendedor;

insert into punto_venta (sucursal_id) values (1);
insert into punto_venta (sucursal_id) values (3);
select * from punto_venta;

insert into tipo_talle (descripcion) values ("LATAM"); /*id: 1*/
insert into tipo_talle (descripcion) values ("USA"); /*id: 2*/
select * from tipo_talle;

/*Talles LATAM*/
insert into talle (descripcion, tipotalle_id) values ("15", 1);
insert into talle (descripcion, tipotalle_id) values ("16", 1);
insert into talle (descripcion, tipotalle_id) values ("17", 1);
insert into talle (descripcion, tipotalle_id) values ("18", 1);
insert into talle (descripcion, tipotalle_id) values ("19", 1);
insert into talle (descripcion, tipotalle_id) values ("20", 1);
insert into talle (descripcion, tipotalle_id) values ("21", 1);
insert into talle (descripcion, tipotalle_id) values ("22", 1);
insert into talle (descripcion, tipotalle_id) values ("23", 1);
insert into talle (descripcion, tipotalle_id) values ("24", 1);
insert into talle (descripcion, tipotalle_id) values ("25", 1);
insert into talle (descripcion, tipotalle_id) values ("26", 1);
insert into talle (descripcion, tipotalle_id) values ("27", 1);
insert into talle (descripcion, tipotalle_id) values ("28", 1);
insert into talle (descripcion, tipotalle_id) values ("29", 1);
insert into talle (descripcion, tipotalle_id) values ("30", 1);
insert into talle (descripcion, tipotalle_id) values ("31", 1);
insert into talle (descripcion, tipotalle_id) values ("32", 1);
insert into talle (descripcion, tipotalle_id) values ("33", 1);
insert into talle (descripcion, tipotalle_id) values ("34", 1);
insert into talle (descripcion, tipotalle_id) values ("35", 1);
insert into talle (descripcion, tipotalle_id) values ("36", 1);
insert into talle (descripcion, tipotalle_id) values ("37", 1);
insert into talle (descripcion, tipotalle_id) values ("38", 1);
insert into talle (descripcion, tipotalle_id) values ("39", 1);
insert into talle (descripcion, tipotalle_id) values ("40", 1);
insert into talle (descripcion, tipotalle_id) values ("41", 1);
insert into talle (descripcion, tipotalle_id) values ("42", 1);
insert into talle (descripcion, tipotalle_id) values ("43", 1);
insert into talle (descripcion, tipotalle_id) values ("44", 1);
insert into talle (descripcion, tipotalle_id) values ("45", 1);
insert into talle (descripcion, tipotalle_id) values ("46", 1);
insert into talle (descripcion, tipotalle_id) values ("47", 1);
insert into talle (descripcion, tipotalle_id) values ("48", 1);
insert into talle (descripcion, tipotalle_id) values ("49", 1);
insert into talle (descripcion, tipotalle_id) values ("50", 1);
insert into talle (descripcion, tipotalle_id) values ("51", 1);
insert into talle (descripcion, tipotalle_id) values ("52", 1);
insert into talle (descripcion, tipotalle_id) values ("53", 1);
insert into talle (descripcion, tipotalle_id) values ("54", 1);
insert into talle (descripcion, tipotalle_id) values ("104", 1);
insert into talle (descripcion, tipotalle_id) values ("106", 1);
insert into talle (descripcion, tipotalle_id) values ("108", 1);
insert into talle (descripcion, tipotalle_id) values ("110", 1);
insert into talle (descripcion, tipotalle_id) values ("112", 1);
insert into talle (descripcion, tipotalle_id) values ("114", 1);
insert into talle (descripcion, tipotalle_id) values ("116", 1);
insert into talle (descripcion, tipotalle_id) values ("118", 1);
insert into talle (descripcion, tipotalle_id) values ("120", 1);

select * from talle where tipotalle_id = 1;

/*Talles USA*/
insert into talle (descripcion, tipotalle_id) values ("0", 2);
insert into talle (descripcion, tipotalle_id) values ("1", 2);
insert into talle (descripcion, tipotalle_id) values ("2", 2);
insert into talle (descripcion, tipotalle_id) values ("3", 2);
insert into talle (descripcion, tipotalle_id) values ("4", 2);
insert into talle (descripcion, tipotalle_id) values ("5", 2);
insert into talle (descripcion, tipotalle_id) values ("6", 2);
insert into talle (descripcion, tipotalle_id) values ("7", 2);
insert into talle (descripcion, tipotalle_id) values ("8", 2);
insert into talle (descripcion, tipotalle_id) values ("9", 2);
insert into talle (descripcion, tipotalle_id) values ("10", 2);
insert into talle (descripcion, tipotalle_id) values ("11", 2);
insert into talle (descripcion, tipotalle_id) values ("12", 2);
insert into talle (descripcion, tipotalle_id) values ("13", 2);
insert into talle (descripcion, tipotalle_id) values ("14", 2);
insert into talle (descripcion, tipotalle_id) values ("15", 2);
insert into talle (descripcion, tipotalle_id) values ("16", 2);
insert into talle (descripcion, tipotalle_id) values ("17", 2);
insert into talle (descripcion, tipotalle_id) values ("18", 2);
insert into talle (descripcion, tipotalle_id) values ("19", 2);
insert into talle (descripcion, tipotalle_id) values ("20", 2);
insert into talle (descripcion, tipotalle_id) values ("22", 2);
insert into talle (descripcion, tipotalle_id) values ("28", 2);
insert into talle (descripcion, tipotalle_id) values ("30", 2);
insert into talle (descripcion, tipotalle_id) values ("32", 2);
insert into talle (descripcion, tipotalle_id) values ("34", 2);
insert into talle (descripcion, tipotalle_id) values ("36", 2);
insert into talle (descripcion, tipotalle_id) values ("38", 2);
insert into talle (descripcion, tipotalle_id) values ("40", 2);
insert into talle (descripcion, tipotalle_id) values ("42", 2);
insert into talle (descripcion, tipotalle_id) values ("44", 2);
insert into talle (descripcion, tipotalle_id) values ("XS", 2);
insert into talle (descripcion, tipotalle_id) values ("S", 2);
insert into talle (descripcion, tipotalle_id) values ("M", 2);
insert into talle (descripcion, tipotalle_id) values ("L", 2);
insert into talle (descripcion, tipotalle_id) values ("XL", 2);
insert into talle (descripcion, tipotalle_id) values ("XXL", 2);
insert into talle (descripcion, tipotalle_id) values ("XXXL", 2);

insert into color (descripcion) values ("Blanco");
insert into color (descripcion) values ("Negro");
insert into color (descripcion) values ("Gris");
insert into color (descripcion) values ("Azul");
insert into color (descripcion) values ("Rojo");
insert into color (descripcion) values ("Verde");
insert into color (descripcion) values ("Morado");
insert into color (descripcion) values ("Amarillo");
insert into color (descripcion) values ("Rosa");
insert into color (descripcion) values ("Naranja");

select * from color;

insert into categoria (descripcion) values ("Ropa deportiva");
insert into categoria (descripcion) values ("Ropa casual");
insert into categoria (descripcion) values ("Calzado deportivo");
insert into categoria (descripcion) values ("Calzado informal");

select * from categoria;

insert into marca (descripcion) values ("Adidas");
insert into marca (descripcion) values ("Nike");
insert into marca (descripcion) values ("Under Armour");
insert into marca (descripcion) values ("Puma");
insert into marca (descripcion) values ("Fila");
insert into marca (descripcion) values ("Lacoste");
insert into marca (descripcion) values ("Tommy Hilfiger");
insert into marca (descripcion) values ("Levi's");

select * from marca;

insert into deposito (descripcion, sucursal_id) values ("Deposito Centro",1);
insert into deposito (descripcion, sucursal_id) values ("Deposito Norte",3);

select * from deposito;

insert into articulo (id,descripcion,costo,margen_ganancia,marca_id,categoria_id) values (1,"Remera cuello en V", 10000, 0.7,1,2);
insert into articulo (id,descripcion,costo,margen_ganancia,marca_id,categoria_id) values (2,"Pantalon adizero", 15000, 0.7,2,1);
insert into articulo (id,descripcion,costo,margen_ganancia,marca_id,categoria_id) values (3,"Zapatilla Air Jordan", 30000, 0.7,2,4);
insert into articulo (id,descripcion,costo,margen_ganancia,marca_id,categoria_id) values (4,"Remera cuello en V", 10000, 0.7,1,2);

select * from articulo;
 
select articulo.id, articulo.descripcion, articulo.costo, articulo.margen_ganancia, marca.descripcion as marca, categoria.descripcion as categoria
 from articulo inner join marca on articulo.marca_id = marca.id inner join categoria on articulo.categoria_id = categoria.id;

insert into stock (articulo_id, color_id, talle_id, cantidad_disponible, deposito_id) values (1,2,71,10,1);
insert into stock (articulo_id, color_id, talle_id, cantidad_disponible, deposito_id) values (1,4,71,10,1);
insert into stock (articulo_id, color_id, talle_id, cantidad_disponible, deposito_id) values (1,1,71,10,1);
insert into stock (articulo_id, color_id, talle_id, cantidad_disponible, deposito_id) values (1,2,71,10,1);

select a.descripcion, col.descripcion as color, t.descripcion as talle, m.descripcion as marca, cat.descripcion as categoria, s.cantidad_disponible from stock as s 
  inner join articulo as a on s.articulo_id = a.id
  inner join color as col on s.color_id = col.id
  inner join talle as t on s.talle_id = t.id
  inner join marca as m on a.marca_id = m.id
  inner join categoria as cat on a.categoria_id = cat.id;

select * from talle where descripcion = "M";




