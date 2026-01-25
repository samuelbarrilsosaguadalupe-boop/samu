CREATE TABLE Charlas(
	id_Charla SMALLINT IDENTITY(1,1) NOT NULL,
	nombre VARCHAR(255) NOT NULL,
	informacion_adicional VARCHAR(MAX) NULL,
	
	CONSTRAINT PK_Charlas PRIMARY KEY (id_Charla),								--Primary key
);
CREATE TABLE Usuario(
	id_Usuario SMALLINT NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	telefono CHAR(13) NOT NULL,
	
	PRIMARY KEY (id_Usuario), 													--Primary key
	CONSTRAINT CS_Telefono UNIQUE (telefono),									--Clave secundaria
);
CREATE TABLE Asistencia(
	id_Charla SMALLINT NOT NULL,
	id_Usuario SMALLINT NOT NULL,
	
	CONSTRAINT PK_Asistencia PRIMARY KEY (id_Charla, id_Usuario),				--Primary key
	
	CONSTRAINT FK_Asistencia_Charla FOREIGN KEY (id_Charla)						--Foreig keys
		REFERENCES Charlas(id_Charla),
	CONSTRAINT FK_Asistencia_Usuario FOREIGN KEY (id_Usuario)
		REFERENCES Usuario(id_Usuario),
	CONSTRAINT Check_Asistencia CHECK (id_Charla >= 0 AND id_Ususario >=0),		--Check que se pide en el enunciado
);
CREATE TABLE Fecha(
	id_Charla SMALLINT NOT NULL,
	fechahora SMALLDATETIME NOT NULL,
	
	CONSTRAINT fk_Fechas_Charlas FOREIGN KEY (id_Charla)
		REFERENCES Charlas(id_Charla),
);

--PRUEBAS
INSERT INTO Charlas (id_Charla, nombre)
	VALUES (1, 'Base de datos');
INSERT INTO Usuario (id_Usuario, nombre, telefono)
	VALUES (1, 'Samuel', '+34700521867');
INSERT INTO Asistencia (id_Charla, id_Usuario)
	VALUES (1, 25);											--Prueba de fallo
INSERT INTO Fecha (id_Charla, Fechahora) 
	VALUES (1, '2026-05-25 12:46:43');
INSERT INTO Usuario (idUsuario, nombre, telefono) 
	VALUES (-5, 'Ramon', '+34678945435');					--Fallo de Check