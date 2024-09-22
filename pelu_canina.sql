-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 22-09-2024 a las 14:49:13
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pelu_canina`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `duenio`
--

CREATE TABLE `duenio` (
  `ID_DUENIO` int(11) NOT NULL,
  `CELDUENIO` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `duenio`
--

INSERT INTO `duenio` (`ID_DUENIO`, `CELDUENIO`, `NOMBRE`) VALUES
(37, '234799567', 'juan perez'),
(38, '3544787544', 'ale gomes'),
(39, '8865437', 'marcos pa'),
(40, '22976543', 'maria sol'),
(41, '7654999', 'elena ro'),
(42, '3232299', 'luis gary'),
(43, '8766544', 'mario ros'),
(44, '887654333', 'luis to'),
(45, '8765522', 'maria mia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `NUM_CLIENTE` int(11) NOT NULL,
  `ALERGICO` varchar(255) DEFAULT NULL,
  `ATENCION_ESPECIAL` varchar(255) DEFAULT NULL,
  `COLOR` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `OBSERVACIONES` varchar(255) DEFAULT NULL,
  `RAZA` varchar(255) DEFAULT NULL,
  `UNDUENIO_ID_DUENIO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`NUM_CLIENTE`, `ALERGICO`, `ATENCION_ESPECIAL`, `COLOR`, `NOMBRE`, `OBSERVACIONES`, `RAZA`, `UNDUENIO_ID_DUENIO`) VALUES
(37, 'SI', 'NO', 'marron', 'max', 'ninguna', 'labrador retriever', 37),
(38, 'SI', 'SI', 'negra', 'bella dona', 'ninguna', 'beagle', 38),
(39, 'NO', 'NO', 'blanco', 'rocky', '	ninguna', 'bulldog frances', 39),
(40, 'SI', 'SI', 'gris', 'luna', 'niguna', 'persa', 40),
(41, 'SI', 'NO', 'dorado', 'charlie', 'no', 'golden retriever', 41),
(42, 'SI', 'SI', 'blanco y negro', 'oliver', 'ninguna', 'sphynx', 42),
(43, 'SI', 'SI', 'tricolor', 'daisy', 'no', 'scottish fold', 43),
(44, 'NO', 'SI', 'atigrado', 'toby', 'no', 'american shorthair', 44),
(45, 'SI', 'NO', 'naranja', 'simba', 'no', 'maine coon', 45);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `duenio`
--
ALTER TABLE `duenio`
  ADD PRIMARY KEY (`ID_DUENIO`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`NUM_CLIENTE`),
  ADD KEY `FK_MASCOTA_UNDUENIO_ID_DUENIO` (`UNDUENIO_ID_DUENIO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `duenio`
--
ALTER TABLE `duenio`
  MODIFY `ID_DUENIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `NUM_CLIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `FK_MASCOTA_UNDUENIO_ID_DUENIO` FOREIGN KEY (`UNDUENIO_ID_DUENIO`) REFERENCES `duenio` (`ID_DUENIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
