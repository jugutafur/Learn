use springboot

create table tarjeta (
id int(10) Auto_Increment primary key,
descripcion varchar(255) not null,
urlImagen varchar(255) not null,
titulo varchar(255) not null,
fecha Date not null
)

insert into tarjeta (descripcion, urlImagen, titulo, fecha) values
('desc Uno','titu Uno', 'imag Uno', '2021/09/24')
('desc Dos','titu Dos', 'imag Dos', '2021/12/24')

select * from tarjeta