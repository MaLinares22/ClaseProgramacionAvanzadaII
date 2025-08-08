-- Creacion de la Base de Datos ,Usuario para la conexion y sus Tablas--
CREATE USER 'Conexion'@'localhost' IDENTIFIED BY 'Blanca#Manuel';
GRANT ALL PRIVILEGES ON *.* TO 'Conexion'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;


CREATE DATABASE SistemaHoteleroMB;
USE SistemaHoteleroMB;

CREATE TABLE Huespedes(
ID_Huesped INT PRIMARY KEY,
Nombre_Huesped VARCHAR(50) NOT NULL,
Apellido_Huesped VARCHAR(50) NOT NULL,
Correo_Huesped VARCHAR(50) NOT NULL,
DNI_Huesped VARCHAR(15) UNIQUE NOT NULL,
Telefono_Huesped VARCHAR(50) NOT NULL
);

CREATE TABLE Habitaciones(
Numero_Habitacion INT PRIMARY KEY,
ID_Habitacion VARCHAR (10) NOT NULL,
Tipo_Habitacion VARCHAR (25) NOT NULL,
Precio DECIMAL (10,2) NOT NULL,
Estado_Habitacion VARCHAR (50) NOT NULL
);

CREATE TABLE Roles(
ID_Rol INT PRIMARY KEY,
Descripcion_Rol VARCHAR (50) NOT NULL
);

CREATE TABLE Empleados(
ID_Empleados INT PRIMARY KEY,
Nombre_Empleado VARCHAR (50) NOT NULL,
Apellido_Empleado VARCHAR (50) NOT NULL,
Fecha_Entrada DATE NOT NULL,
Numero_Empleado VARCHAR (20) NOT NULL,
Correo_Empleado VARCHAR (50) NOT NULL,
DNI_Empleado VARCHAR (15) UNIQUE NOT NULL,
Sueldo DECIMAL (10,2) NOT NULL,
Rol_Empleado INT NOT NULL,
Hora_Entrada TIME NOT NULL,
Hora_Salida TIME NOT NULL,
FOREIGN KEY (Rol_Empleado) REFERENCES Roles (ID_Rol)
);

CREATE TABLE Pagos(
ID_Pago INT PRIMARY KEY,
Tipo_Pago VARCHAR (30),
Beneficio_Pago VARCHAR (50) NOT NULL
);

CREATE TABLE Servicios(
ID_Servicio INT PRIMARY KEY,
Servicio VARCHAR (50) NOT NULL,
Descripcion VARCHAR (60) NOT NULL,
Precio DECIMAL (10,2) NOT NULL,
Duracion VARCHAR (50) NOT NULL
);

CREATE TABLE Reservas(
ID_Reserva INT PRIMARY KEY,
ID_Huesped INT NOT NULL,
ID_Habitacion INT NOT NULL,
Tiempo_Reserva VARCHAR(50) NOT NULL,
Tipo_Pago INT NOT NULL,
Estado_Pago VARCHAR(20) NOT NULL,
FOREIGN KEY (ID_Huesped) REFERENCES Huespedes (ID_Huesped),
FOREIGN KEY (ID_Habitacion) REFERENCES Habitaciones (Numero_Habitacion),
FOREIGN KEY (Tipo_Pago) REFERENCES Pagos (ID_Pago)
);

CREATE TABLE Reservas_Servicios(
ID_ReservaSer INT PRIMARY KEY,
ID_Huesped INT NOT NULL,
ID_Servicio INT NOT NULL,
Fecha_ReservaSer DATE NOT NULL,
FOREIGN KEY (ID_Huesped) REFERENCES Huespedes (ID_Huesped),
FOREIGN KEY (ID_Servicio) REFERENCES Servicios (ID_Servicio)
);


-- Insertar datos de Prueba --
INSERT INTO Huespedes VALUES 
(1, 'Carlos', 'Ramírez', 'carlosr@gmail.com', '0801199912345', '98765432'),
(2, 'Ana', 'López', 'ana.lopez@hotmail.com', '0801200212346', '94562318'),
(3, 'Pedro', 'Martínez', 'pedrom@gmail.com', '0801199812347', '93482130'),
(4, 'Lucía', 'González', 'lucia.g@yahoo.com', '0801199712348', '95678122'),
(5, 'María', 'Fernández', 'mfernandez@gmail.com', '0801199612349', '98832211'),
(6, 'Luis', 'Santos', 'lsantos@gmail.com', '0801199512350', '92345678'),
(7, 'Sofía', 'Pineda', 'sofia.p@gmail.com', '0801199412351', '93456781'),
(8, 'Jorge', 'Zelaya', 'jorgez@gmail.com', '0801199312352', '94321109'),
(9, 'Carla', 'Reyes', 'carla_r@hotmail.com', '0801199212353', '95678211'),
(10, 'Mario', 'Orellana', 'mario.ore@gmail.com', '0801199112354', '91234567'),
(11, 'Natalia', 'Castro', 'ncastro@gmail.com', '0801199012355', '98765421'),
(12, 'Gabriel', 'Mejía', 'gmejia@gmail.com', '0801198912356', '92345611'),
(13, 'Valeria', 'Torres', 'val.torres@gmail.com', '0801198812357', '90012345'),
(14, 'David', 'Perdomo', 'dperdomo@gmail.com', '0801198712358', '90112233'),
(15, 'Andrea', 'Rosales', 'andrea.ros@gmail.com', '0801198612359', '90011223');

SELECT * FROM Huespedes;

INSERT INTO Habitaciones VALUES 
(1, 'A10', 'Individual', 400.00, 'Disponible'),
(2, 'A11', 'Individual', 400.00, 'Ocupado'),
(3, 'A12', 'Individual', 400.00, 'Mantenimiento'),
(4, 'B20', 'Doble', 600.00, 'Disponible'),
(5, 'B21', 'Doble', 600.00, 'Ocupado'),
(6, 'B22', 'Doble', 600.00, 'Disponible'),
(7, 'C30', 'Suite', 1200.00, 'Ocupado'),
(8, 'C31', 'Suite', 1200.00, 'Disponible'),
(9, 'C32', 'Suite', 1200.00, 'Mantenimiento'),
(10, 'D40', 'Familiar', 1500.00, 'Ocupado'),
(11, 'D41', 'Familiar', 1500.00, 'Disponible'),
(12, 'D42', 'Familiar', 1500.00, 'Disponible'),
(13, 'E50', 'Premium', 2000.00, 'Disponible'),
(14, 'E51', 'Premium', 2000.00, 'Ocupado'),
(15, 'E52', 'Premium', 2000.00, 'Disponible');

SELECT * FROM Habitaciones;

INSERT INTO Roles VALUES
(1, 'Administrador'),
(2, 'Recepcionista'),
(3, 'Limpieza'),
(4, 'Cocinero'),
(5, 'Gerente'),
(6, 'Botones'),
(7, 'Seguridad'),
(8, 'Mantenimiento'),
(9, 'Encargado de Eventos'),
(10, 'Barista'),
(11, 'Mozo'),
(12, 'Conserje'),
(13, 'Servicio al Cliente'),
(14, 'Contador'),
(15, 'Técnico');

SELECT * FROM Roles;

INSERT INTO Empleados VALUES
(1, 'José', 'Pérez', '2020-01-10', '98765432', 'josep@gmail.com', '0801200012345', 800.00, 1, '08:00', '17:00'),
(2, 'Ana', 'Mendoza', '2021-03-15', '37482910', 'anam@gmail.com', '0801200112346', 700.00, 2, '07:00', '16:00'),
(3, 'Luis', 'Hernández', '2020-06-20', '88990123', 'luish@gmail.com', '0801200212347', 600.00, 3, '09:00', '18:00'),
(4, 'Claudia', 'García', '2022-01-05', '91437256', 'claudiag@gmail.com', '0801200312348', 1000.00, 5, '08:00', '17:00'),
(5, 'Mario', 'Ortiz', '2019-11-11', '70123456', 'marioo@gmail.com', '0801200412349', 650.00, 4, '10:00', '19:00'),
(6, 'Rosa', 'Zavala', '2021-02-25', '87654321', 'rosaz@gmail.com', '0801200512350', 450.00, 6, '06:00', '15:00'),
(7, 'Sergio', 'Navarro', '2022-04-01', '78451236', 'sergion@gmail.com', '0801200612351', 500.00, 7, '14:00', '23:00'),
(8, 'Diana', 'Cruz', '2023-01-20', '91112223', 'dianac@gmail.com', '0801200712352', 600.00, 8, '08:00', '17:00'),
(9, 'Juan', 'Salinas', '2023-05-10', '31234567', 'juans@gmail.com', '0801200812353', 750.00, 9, '12:00', '21:00'),
(10, 'Paola', 'Rivas', '2020-08-08', '78123490', 'paolar@gmail.com', '0801200912354', 500.00, 10, '09:00', '18:00'),
(11, 'Carlos', 'Amaya', '2022-09-13', '89345678', 'carlos.a@gmail.com', '0801201012355', 550.00, 11, '11:00', '20:00'),
(12, 'Elena', 'Moreno', '2021-06-06', '74321234', 'elenam@gmail.com', '0801201112356', 500.00, 12, '07:00', '16:00'),
(13, 'Javier', 'Suazo', '2019-12-12', '91123456', 'javiers@gmail.com', '0801201212357', 700.00, 13, '10:00', '19:00'),
(14, 'Marcos', 'Rosales', '2023-02-14', '78904561', 'marcosr@gmail.com', '0801201312358', 900.00, 14, '08:00', '17:00'),
(15, 'Daniela', 'Villanueva', '2022-10-10', '31098765', 'daniv@gmail.com', '0801201412359', 650.00, 15, '07:00', '16:00');

SELECT * FROM Empleados;

INSERT INTO Pagos VALUES
(1, 'Efectivo', 'Ninguno'),
(2, 'Tarjeta Débito', '12%'),
(3, 'Tarjeta Crédito', '15%'),
(4, 'PayPal', '10%'),
(5, 'Transferencia', 'Ninguno'),
(6, 'Criptomoneda', 'Ninguno'),
(7, 'Cheque', 'Ninguno'),
(8, 'Zelle', 'Ninguno'),
(9, 'Apple Pay', 'Recargo'),
(10, 'Google Pay', 'Ninguno'),
(11, 'Tarjeta Prepago', 'Ninguno'),
(12, 'POS portátil', 'Ninguno'),
(13, 'Cortesía', 'Ninguno'),
(14, 'Regalia Empresa', 'Ninguno'),
(15, 'Otro', 'Ninguno');

SELECT * FROM Pagos;

INSERT INTO Servicios VALUES
(1, 'Spa', 'Masajes relajantes y faciales', 45.00, '60 minutos'),
(2, 'Gimnasio', 'Acceso completo al gimnasio', 15.00, '1 día'),
(3, 'Desayuno Buffet', 'Incluye frutas, cereales, café', 12.00, '1 día'),
(4, 'Almuerzo Buffet', 'Comida variada internacional', 20.00, '1 día'),
(5, 'Cena Romántica', 'Incluye vino y postre', 30.00, '1 noche'),
(6, 'Lavandería', 'Lavado y planchado de ropa', 10.00, 'Por servicio'),
(7, 'Sala de Juegos', 'Videojuegos y entretenimiento', 8.00, '1 hora'),
(8, 'Piscina', 'Acceso total a piscina', 10.00, '1 día'),
(9, 'Jacuzzi', 'Jacuzzi privado', 25.00, '1 hora'),
(10, 'Sauna', 'Acceso a sauna', 18.00, '1 hora'),
(11, 'Tour Turístico', 'Tour guiado por la ciudad', 50.00, '1 día'),
(12, 'Transporte', 'Traslado aeropuerto-hotel', 25.00, '1 viaje'),
(13, 'Sala de Reuniones', 'Alquiler por evento', 100.00, '4 horas'),
(14, 'Bar', 'Servicio de bebidas', 15.00, '2 horas'),
(15, 'Netflix', 'Acceso a cuenta premium', 5.00, '1 noche');

SELECT * FROM Servicios;

INSERT INTO Reservas VALUES
(1, 1, 1, '3 noches', 1, 'Pagado'),
(2, 2, 2, '1 noche', 2, 'Pendiente'),
(3, 3, 3, '2 noches', 3, 'Pagado'),
(4, 4, 4, '5 noches', 4, 'Pagado'),
(5, 5, 5, '2 noches', 5, 'Pendiente'),
(6, 6, 6, '1 noche', 6, 'Pagado'),
(7, 7, 7, '4 noches', 7, 'Pagado'),
(8, 8, 8, '3 noches', 8, 'Pendiente'),
(9, 9, 9, '2 noches', 9, 'Pagado'),
(10, 10, 10, '1 noche', 10, 'Pagado'),
(11, 11, 11, '6 noches', 11, 'Pendiente'),
(12, 12, 12, '2 noches', 12, 'Pagado'),
(13, 13, 13, '3 noches', 13, 'Pagado'),
(14, 14, 14, '4 noches', 14, 'Pendiente'),
(15, 15, 15, '1 noche', 15, 'Pagado');

SELECT * FROM Reservas;

INSERT INTO Reservas_Servicios VALUES
(1, 1, 1, '2025-06-10'),
(2, 2, 2, '2025-06-10'),
(3, 3, 3, '2025-06-10'),
(4, 4, 4, '2025-06-10'),
(5, 5, 5, '2025-06-10'),
(6, 6, 6, '2025-06-10'),
(7, 7, 7, '2025-06-10'),
(8, 8, 8, '2025-06-10'),
(9, 9, 9, '2025-06-10'),
(10, 10, 10, '2025-06-10'),
(11, 11, 11, '2025-06-10'),
(12, 12, 12, '2025-06-10'),
(13, 13, 13, '2025-06-10'),
(14, 14, 14, '2025-06-10'),
(15, 15, 15, '2025-06-10');

SELECT * FROM Reservas_Servicios;

-- Creacion de los Indices--
CREATE INDEX idx_NombreCompleto_Empleado ON Empleados(Nombre_Empleado, Apellido_Empleado);
CREATE INDEX idx_DNI_Empleado ON Empleados(DNI_Empleado);
CREATE INDEX idx_Contacto_Empleado ON Empleados (Numero_Empleado, Correo_Empleado);
CREATE INDEX idx_Identificacion_Habitacion ON Habitaciones (ID_Habitacion);
CREATE INDEX idx_Estado_Habitacion ON Habitaciones (Estado_Habitacion);
CREATE INDEX idx_NombreCompleto_Huesped ON Huespedes (Nombre_Huesped, Apellido_Huesped);
CREATE INDEX idx_Contacto_Huesped ON Huespedes (Correo_Huesped, Telefono_Huesped);
CREATE INDEX idx_Identificacion ON Huespedes (DNI_Huesped);
CREATE INDEX idx_TipoDePago ON Pagos (Tipo_Pago);
CREATE INDEX idx_Conexiones_Reserva ON Reservas (ID_Reserva, ID_Huesped, ID_Habitacion);
CREATE INDEX idx_Conexiones_Servicios ON reservas_servicios (ID_ReservaSer, ID_Huesped, ID_Servicio);
CREATE INDEX idx_Roles ON Roles (Descripcion_Rol);
CREATE INDEX idx_Informacion_Servicio ON Servicios (Servicio, Descripcion, Precio);
