CREATE DATABASE IF NOT EXISTS examen
use examen
CREATE TABLE IF NOT EXISTS Pacientes_Temperaturas (
    NSS int(12),
    FechaHora DATETIME NOT NULL DEFAULT NOW(),
    TEMPERATURA DECIMAL (4,2) NOT NULL,
    CONSTRAINT pk_NSS PRIMARY KEY (NSS)
);
CREATE TABLE IF NOT EXISTS Principal_Pacientes (
    NSS int(12),
    DNI char(9),
    Nombre VARCHAR(100),
    tipo ENUM('A','B','AB','O') NOT NULL,
    rh ENUM('+','-') NOT NULL,
    CONSTRAINT pk_NSS PRIMARY KEY (NSS),
    CONSTRAINT FK_pac1_DNI_pac2_DNI FOREIGN KEY (DNI) REFERENCES Pacientes_Nombres(DNI)
            ON DELETE CASCADE
            ON UPDATE CASCADE
);
CREATE TABLE IF NOT EXISTS Pacientes_Nombres (
    DNI char(9),
    Nombre VARCHAR(100),
    CONSTRAINT pk_DNI PRIMARY KEY (DNI)
);