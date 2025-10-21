use portfolio

create table NavegadorFoto(
id int identity(1,1) primary key not null,
srcImage varchar(max) not null,
srcImagenMiniatura varchar(max) not null,
descripcion varchar(max) not null,
titulo varchar(max) not null,
)

insert into NavegadorFoto values
('/imagenes/navigator/1.jpg','/imagenes/navigator/11.jpg','Description for Image 1','Title 1'),
('/imagenes/navigator/2.jpg','/imagenes/navigator/22.jpg','Description for Image 2','Title 2'),
('/imagenes/navigator/3.jpg','/imagenes/navigator/33.jpg','Description for Image 3','Title 3'),
('/imagenes/navigator/4.jpg','/imagenes/navigator/44.jpg','Description for Image 4','Title 4'),
('/imagenes/navigator/5.jpg','/imagenes/navigator/55.jpg','Description for Image 5','Title 5'),
('/imagenes/navigator/6.jpg','/imagenes/navigator/66.jpg','Description for Image 6','Title 6')


select * from NavegadorFoto


create table menuCategory(
id int identity(1,1) primary key not null,
name varchar(max) not null,
description varchar(max) not null,
imagen varchar(max) not null,
date datetime not null,
)

insert into menuCategory values
('MitoCode','projects to mitoCode by JSF','','2020-02-01'),
('AulaMatriz','projecto to CofeeShop','','2021-01-05'),
('Various','projecto to Various','','2021-01-05')

select * from menuCategory