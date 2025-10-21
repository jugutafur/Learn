use portfolio

drop table menuCategory


create table proyecto(
id int identity(1,1) primary key not null,
nombre varchar(max) not null,
descripcion varchar(max) not null,
categoria varchar(max) not null,
imagenSrc varchar(max) not null,
fechaActualizacion datetime not null,
)

insert into proyecto values
('nombreUno','DescripcionUno','CategoriaUno','','2001-01-11'),
('nombreDos','DescripcionDos','CategoriaDos','','2001-02-12'),
('nombreTres','DescripcionTres','CategoriaTres','','2001-03-13'),
('nombreCuatro','DescripcionCuatro','CategoriaCuatro','','2001-04-14'),
('nombreCinco','DescripcionCinco','CategoriaCinco','','2001-05-15'),
('nombreSeis','DescripcionSeis','CategoriaSeis','','2001-06-16')