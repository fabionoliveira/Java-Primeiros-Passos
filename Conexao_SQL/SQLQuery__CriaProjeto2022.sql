/*
USE MASTER
CREATE DATABASE Projeto2022
*/

use Projeto2022

CREATE TABLE Genero ( 
cd_Genero int not null identity(1,1),
ds_Genero Varchar(30) not null,
abr_Genero Varchar(5) not null,
CONSTRAINT pk_Genero PRIMARY KEY (cd_genero)
)

INSERT INTO Genero (ds_genero, abr_genero) VALUES ('Feminino','Fem')
INSERT INTO Genero (ds_genero, abr_genero) VALUES ('Masculino','Masc')
INSERT INTO Genero (ds_genero, abr_genero) VALUES ('Não Informado','NI')
INSERT INTO Genero (ds_genero, abr_genero) VALUES ('Não Binário','NB')

SELECT  cd_genero, ds_genero, abr_genero  FROM Genero

USE Projeto2022
CREATE TABLE Nacionalidade (
cd_Nacionalidade   int not null identity(1,1), 
ds_Nacionalidade   Varchar(30) not null, 
abr_Nacionalidade  char(5) not null, 
CONSTRAINT pk_Nacionalidade PRIMARY KEY (cd_Nacionalidade)

)

INSERT INTO Nacionalidade (ds_Nacionalidade, abr_Nacionalidade) 
       VALUES ('tESTE','tst')

INSERT INTO Nacionalidade (ds_Nacionalidade, abr_Nacionalidade) 
        VALUES ('Brasileira','BRA')

INSERT INTO Nacionalidade (ds_Nacionalidade, abr_Nacionalidade) 
        VALUES ('testestes','12345')

SELECT cd_Nacionalidade, ds_Nacionalidade, abr_Nacionalidade FROM Nacionalidade

SELECT cd_Nacionalidade, ds_Nacionalidade, abr_Nacionalidade 
FROM Nacionalidade
WHERE cd_Nacionalidade = 4

DELETE FROM Nacionalidade
WHERE cd_Nacionalidade = 4
