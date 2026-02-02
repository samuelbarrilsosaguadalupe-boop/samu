CREATE TABLE Charlas(
	id_Charla SMALLINT IDENTITY(1,1) NOT NULL,
	nombre VARCHAR(100) NOT NULL,
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
	CONSTRAINT Check_Asistencia CHECK (id_Charla >= 0 AND id_Usuario >=0),		--Check que se pide en el enunciado
);
CREATE TABLE Fecha(
	id_Charla SMALLINT NOT NULL,
	fechahora SMALLDATETIME NOT NULL,
	
	CONSTRAINT fk_Fechas_Charlas FOREIGN KEY (id_Charla)
		REFERENCES Charlas(id_Charla),
);
CREATE TABLE Colegios(
	id_Colegio SMALLINT NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	persona_Contacto VARCHAR(100) NOT NULL,
	tfno_Contacto CHAR(13),

	CONSTRAINT PK_id_Colegio PRIMARY KEY (id_Colegio),
	CONSTRAINT CS_nombre UNIQUE (nombre),
);
CREATE TABLE Colegios_Actividades(
	id_Reserva SMALLINT IDENTITY (1,1) NOT NULL,
	id_Colegio SMALLINT NULL DEFAULT 0,
	id_Charla SMALLINT NULL,
	fecha DATE NOT NULL,
	numero_Asistentes SMALLINT NOT NULL,

	CONSTRAINT PK_id_Reserva PRIMARY KEY (id_Reserva),
	CONSTRAINT FK_Charla_Actividades FOREIGN KEY (id_Charla)
		REFERENCES Charlas(id_Charla) ON DELETE NO ACTION,
	CONSTRAINT FK_id_Colegio_Actividades FOREIGN KEY (id_Colegio)
		REFERENCES Colegios(id_Colegio) ON DELETE CASCADE,
);

--PRUEBAS
INSERT INTO Charlas (id_Charla, nombre)
	VALUES (1, 'La IA?');										--Prueba de not null
INSERT INTO Usuario (id_Usuario, nombre, telefono)
	VALUES (1, 'Samuel', '+34700521867');
INSERT INTO Asistencia (id_Charla, id_Usuario)
	VALUES (1, 25);											--Prueba de fallo
INSERT INTO Fecha (id_Charla, Fechahora) 
	VALUES (1, '2026-05-05 12:46:43');
INSERT INTO Asistencia (id_Charla, id_Usuario) 
	VALUES (-5, 1);											--Fallo de Check
INSERT INTO Colegios (id_Colegio, nombre, persona_Contacto, tfno_Contacto)
	VALUES 
	(0, 'plazas disponibles', 'no procede', 'no procede'),
	(1, 'Guadalupe', 'Tomas', '+34567832493'),
	(2, 'Reino Aftasi', 'Juan', '+34943567832');


INSERT INTO Colegios_Actividades (id_Reserva, id_Colegio, id_Charla, fecha, numero_asistentes)
	VALUES
	(1, 1, 1, '2026-04-04', 5),
	(2, 2, 2, '2026-05-08', 4);


--Pruebas de borrado
	--Borrado con Cascada 
DELETE FROM Colegios WHERE id_Colegio = 1;
SELECT * FROM Colegios_Actividades; -- visualizar que se ha borrado

	--Borrado con Restricción
DELETE FROM Charlas WHERE id_Charla = 1;

--Prueba de comprobaciones de un foreign key
INSERT INTO Charlas
	VALUES
	(1, 'expo'),
	(2, 'IA'),
	(3, 'Foreign keys'),
	(4, 'Recursivas');
INSERT INTO Usuario
	VALUES
	(2, 'Juan Carlos', '+34765456543'),
	(3, 'Ivan', '+34765456543'),
	(4, 'Pablo', '+34765456543');
INSERT INTO Asistencia
	VALUES (7, 7);--Comprobacion de que no existan en la tabla padre (Los datos no existen en la tabla padre)

INSERT INTO Asistencia
	VALUES (2,2);
DELETE FROM Charlas WHERE id_Charla = 2;--Comprobacion de intentar eliminar un dato en la tabla padre que tiene datos en la tabla hija(Los datos estan tanto en la tabla
--padre como en la hija)

UPDATE Asistencia SET id_Charla =6 WHERE id_Charla=2; --Estoy actualizando un dato que no existe en la tabla padre

UPDATE Charlas SET id_Charla = 8 WHERE id_Charla=2; --Estoy actualizando un dato que ya existe en la tabla hijo impidiendo que se cambie de la tabla padre
