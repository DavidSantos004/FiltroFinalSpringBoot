CREATE TYPE EstadoDeVisualizacion AS ENUM (
  'pendiente',
  'viendo',
  'terminado',
  'abandonado'
);

CREATE TABLE usuario (
  IdUsuario SERIAL PRIMARY KEY UNIQUE,
  Nombre VARCHAR(255),
  CorreoElectronico VARCHAR(255),
  Edad int
);

CREATE TABLE contenido (
  IdContenido SERIAL PRIMARY KEY UNIQUE,
  Nombre VARCHAR(255),
  TipoDeContenido VARCHAR(255) UNIQUE,
  Genero1 VARCHAR(255),
  Genero2 VARCHAR(255),
  EstadoDeVisualizacion EstadoDeVisualizacion
);

CREATE TABLE plataforma (
  IdPlataforma SERIAL PRIMARY KEY UNIQUE,
  TipoDeContenido varchar(255),
  PlataformaContenido VARCHAR(255)
);

CREATE TABLE calificaciones (
  IdCalificacion SERIAL PRIMARY KEY UNIQUE,
  IdContenido SERIAL,
  IdUsuario SERIAL,
  Calificacion VARCHAR(255),
  Comentario VARCHAR(255)
);

ALTER TABLE plataforma ADD FOREIGN KEY (TipoDeContenido) REFERENCES contenido (TipoDeContenido);

ALTER TABLE calificaciones ADD FOREIGN KEY (IdContenido) REFERENCES contenido (IdContenido);

ALTER TABLE calificaciones ADD FOREIGN KEY (IdUsuario) REFERENCES usuario (IdUsuario);



INSERT INTO contenido VALUES (1, 'Rick And Morty', 'serie', 'accion', 'entretenimiento', 'viendo');
INSERT INTO contenido VALUES (2, 'El Aro', 'pelicula', 'accion', 'Terror', 'viendo');
INSERT INTO contenido VALUES (3, 'El Señor De Los Anillos', 'libro', 'accion', 'aventura', 'viendo');

INSERT INTO plataforma VALUES (1, 'serie', 'Nexflix');
INSERT INTO plataforma VALUES (2, 'pelicula', 'HBO');
INSERT INTO plataforma VALUES (3, 'libro', 'E-Book');

INSERT INTO usuario VALUES (1, 'david', 'ds0299646@gmail.com', 19);
INSERT INTO usuario VALUES (2, 'sebas', 'sebas111@gmail.com', 17);
INSERT INTO usuario VALUES (3, 'javier', 'javiersmt99@gmail.com', 23);

INSERT INTO calificaciones VALUES (1, 1, 1, 8.5, 'me gusto mucho la trama y lo comico de la serie');
INSERT INTO calificaciones VALUES (2, 2, 2, 4, 'no me gusto mucho porque no da miedo');
INSERT INTO calificaciones VALUES (3, 3, 3, 7, 'el gusto por la historia que tiene pero siento que hace falta darle mas protagonismo a ciertos personajes');





