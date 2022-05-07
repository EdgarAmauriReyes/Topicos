create database Escuela
use Escuela

create table Alumnos(
noControl varchar(10) not null,
nombre varchar(50),
apPaterno varchar(50),
apMaterno varchar(50)
constraint pk_l primary key (noControl)
)

Go
create procedure 

alta_alumnos(
@nc varchar(10),
@nom varchar(50),
@ap varchar(50),
@am varchar(50)
)
as
insert into Alumnos
values(@nc,@nom,@am,@ap)
go

create procedure edita_alumnos(
@nc varchar(10),
@nom varchar(50),
@ap varchar(50),
@am varchar(50)
)
as 
update Alumnos set nombre= @nom, apPaterno=@ap,
apMaterno=@am
where noControl= @nc
go

create procedure borrar_alumnos(
@nc varchar(10)
)
as
delete from Alumnos
where noControl= @nc
go

create procedure ver_alumnos(
@nc varchar(10)
)
as
select * from Alumnos
where noControl= @nc
go