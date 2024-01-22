-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-01-2024 a las 22:22:59
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbsystem_002`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_actualizar_persona` (IN `_nombre` VARCHAR(45), IN `_dni` INT(11), IN `_direccion` VARCHAR(50), IN `_telefono` INT(11), IN `_correo` VARCHAR(50), IN `_civil` VARCHAR(15), IN `_hijo` VARCHAR(15), IN `_can_hijo` INT(11), IN `_sexo` VARCHAR(10), IN `_estado` VARCHAR(10), IN `_id` INT(11))   BEGIN 
UPDATE persona SET nombre = _nombre, num_dni = _dni, direccion = _direccion, telefono = _telefono , correo = _correo, es_civil = _civil, hijo = _hijo, can_hijo = _can_hijo, sexo = _sexo, estado = _estado WHERE idpersona = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_actualizar_stock_material` (IN `_canti` VARCHAR(11), IN `_estado` INT(11), IN `_id` INT(11))   BEGIN 
UPDATE material SET stock_final = _canti,estado = _estado WHERE idMaterial= _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_eliminar_cliente` (IN `_id` INT(11))   BEGIN

UPDATE cliente SET estado = 0 WHERE id = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_eliminar_maquinaria` (IN `_id` INT(11))   BEGIN 
UPDATE maquinaria SET estado = 0 WHERE idMaquinaria= _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_eliminar_material` (IN `_id` INT(11))   BEGIN 
UPDATE material SET estado = 0 WHERE idMaterial= _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_eliminar_usuario` (IN `_id` INT(11))   BEGIN
UPDATE usuario SET estado = 0 WHERE id = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_modificar_cliente` (IN `_razonsocial` VARCHAR(40), IN `_ruc` VARCHAR(12), IN `_direccion` VARCHAR(50), IN `_telefono` INT(11), IN `_id` INT(11))   BEGIN
UPDATE cliente SET razonsocial=_razonsocial,ruc=_ruc,direccion=_direccion ,telefono = _telefono  WHERE id = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_modificar_maquinaria` (IN `_prove` VARCHAR(30), IN `_fecha` VARCHAR(11), IN `_serie` VARCHAR(11), IN `_numero` VARCHAR(11), IN `_maquina` VARCHAR(100), IN `_horas` VARCHAR(11), IN `_dias` VARCHAR(10), IN `_precio` DECIMAL(11,2), IN `_total` DECIMAL(11,2), IN `_fecha_inicio` VARCHAR(11), IN `_fecha_fin` VARCHAR(11), IN `id` INT(11))   BEGIN 
UPDATE maquinaria SET idprove = (SELECT P.idprove FROM proveedor P WHERE P.razonsocial = _prove),fecha= _fecha, serie = _serie, numero = _numero, idmaquina =(SELECT m.id FROM maquina m WHERE m.maquina = _maquina), horas= _horas, dias = _dias, precio_hora = _precio, total = _total, fecha_inicio = _fecha_inicio, fecha_fin = _fecha_fin WHERE idMaquinaria = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_modificar_material` (IN `_prove` VARCHAR(30), IN `_fecha_ingreso` VARCHAR(11), IN `_serie` VARCHAR(11), IN `_numero` VARCHAR(11), IN `_material` VARCHAR(100), IN `_cantidad` VARCHAR(11), IN `_unidad` VARCHAR(10), IN `_precio` DECIMAL(11,2), IN `_total` DECIMAL(11,2), IN `_id` INT(11))   BEGIN 

UPDATE material SET idprove = (SELECT P.idprove FROM proveedor P WHERE P.razonsocial = _prove), fecha_ingreso= _fecha_ingreso, serie = _serie, numero = _numero, idproducto =(SELECT p.id FROM producto p WHERE p.producto = _material), cantidad = _cantidad, idunidad = (SELECT U.id FROM unidad_medida U WHERE U.unidad_medida = _unidad), precio = _precio, total = _total WHERE idMaterial= _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_modificar_usuario` (IN `_usuario` VARCHAR(11), IN `_passwor` VARCHAR(11), IN `_rol` VARCHAR(11), IN `_persona` VARCHAR(35), IN `_id` INT(11))   BEGIN
UPDATE usuario SET usuario = _usuario, passwor = _passwor, idrol = (SELECT r.id FROM rol r WHERE r.rol =_rol), idpersona = (SELECT p.idpersona FROM persona p WHERE p.nombre = _persona) WHERE id = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_maquina` (IN `_maquina` VARCHAR(100))   BEGIN 
INSERT INTO maquina(id, maquina, estado) VALUES (NULL,_maquina,1);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_maquinaria` (IN `_prove` VARCHAR(30), IN `_fecha` VARCHAR(11), IN `_serie` VARCHAR(11), IN `_numero` VARCHAR(11), IN `_maquina` VARCHAR(100), IN `_horas` VARCHAR(11), IN `_dias` VARCHAR(10), IN `_precio` DECIMAL(11,2), IN `_total` DECIMAL(11,2), IN `_fecha_inicio` VARCHAR(11), IN `_fecha_fin` VARCHAR(11))   BEGIN 
INSERT INTO maquinaria(idMaquinaria, idprove, fecha, serie, numero,idmaquina, horas, dias, precio_hora, total, fecha_inicio, fecha_fin, estado) VALUES (NULL,(SELECT P.idprove FROM proveedor P WHERE P.razonsocial = _prove), _fecha, _serie, _numero,(SELECT m.id FROM maquina m WHERE m.maquina = _maquina), _horas, _dias, _precio, _total, _fecha_inicio, _fecha_fin,1);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_material` (IN `_prove` VARCHAR(30), IN `_fecha_ingreso` VARCHAR(11), IN `_serie` VARCHAR(11), IN `_numero` VARCHAR(11), IN `_material` VARCHAR(100), IN `_cantidad` VARCHAR(11), IN `_unidad` VARCHAR(10), IN `_precio` DECIMAL(11,2), IN `_total` DECIMAL(11,2), IN `_estado` INT(2))   BEGIN 
INSERT INTO material(idMaterial, idprove, fecha_ingreso, serie, numero, idproducto, cantidad,stock_final, idunidad, precio, total, estado) 
VALUES (NULL,(SELECT P.idprove FROM proveedor P WHERE P.razonsocial = _prove), _fecha_ingreso, _serie, _numero,(SELECT p.id FROM producto p WHERE p.producto = _material), _cantidad,_cantidad,(SELECT U.id FROM unidad_medida U WHERE U.unidad_medida = _unidad),_precio, _total, _estado);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_persona` (IN `_nombre` VARCHAR(45), IN `_dni` INT(11), IN `_direccion` VARCHAR(50), IN `_telefono` INT(11), IN `_correo` VARCHAR(50), IN `_civil` VARCHAR(15), IN `_hijo` VARCHAR(15), IN `_can_hijo` INT(11), IN `_sexo` VARCHAR(10), IN `_estado` VARCHAR(10))   BEGIN 
INSERT INTO persona(idpersona, nombre, num_dni, direccion, telefono, correo, es_civil, hijo, can_hijo, sexo, estado) VALUES (NULL,_nombre, _dni, _direccion, _telefono,_correo,_civil,_hijo,_can_hijo,_sexo,_estado);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_producto` (IN `_producto` VARCHAR(50))   BEGIN
INSERT INTO producto(id, producto, estado) VALUES (null, _producto,1);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_proveedor` (IN `_nombre` VARCHAR(45), IN `_ruc` VARCHAR(30), IN `_direccion` VARCHAR(50), IN `_telefono` INT(11))   BEGIN 
INSERT INTO proveedor(idprove, razonsocial, ruc, direccion, telefono) VALUES (NULL, _nombre, _ruc, _direccion, _telefono);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_ticket` (IN `_idU` VARCHAR(40), IN `_idC` VARCHAR(40), IN `_serie` VARCHAR(11), IN `_numero` VARCHAR(11), IN `_subtotal` DECIMAL(11,2), IN `_total` DECIMAL(11,2))   BEGIN
INSERT INTO ticket(idT, idUsuario, idCliente, serie, numero, subtotal, total) VALUES (NULL,(SELECT u.id FROM usuario u WHERE u.usuario =_idU),(SELECT c.id FROM cliente c WHERE c.razonsocial =_idC), _serie, _numero, _subtotal, _total);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registrar_usuario` (IN `_usuario` VARCHAR(11), IN `_passwor` VARCHAR(11), IN `_rol` VARCHAR(11), IN `_persona` VARCHAR(35))   BEGIN
INSERT INTO usuario(id, usuario, passwor, idrol, idpersona, estado) VALUES (NULL,_usuario, _passwor, (SELECT r.id FROM rol r WHERE r.rol =_rol),(SELECT p.idpersona FROM persona p WHERE p.nombre = _persona),1);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registra_cliente` (IN `_razonsocial` VARCHAR(40), IN `_ruc` VARCHAR(12), IN `_direccion` VARCHAR(50), IN `_telefono` INT(11))   BEGIN
INSERT INTO cliente(id, razonsocial, ruc, direccion, telefono, estado) VALUES (NULL, _razonsocial, _ruc, _direccion, _telefono,1);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_registro_detalle_ticket` (IN `_id` INT(11), IN `_descripcion` VARCHAR(50), IN `_dias` INT(11), IN `_horas` INT(11), IN `_cantidad` INT(11), IN `_precio` DECIMAL(11,2), IN `_total` DECIMAL(11,2))   BEGIN
INSERT INTO detalle_ticket(iddt, idTicket, descripcion, dias, horas, cantidad, precio, total) 
VALUES (NULL, _id, _descripcion, _dias, _horas, _cantidad, _precio, _total);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `razonsocial` varchar(50) NOT NULL,
  `ruc` varchar(12) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` int(11) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `razonsocial`, `ruc`, `direccion`, `telefono`, `estado`) VALUES
(1, 'Multiservicios Mayanga', '0912435645', 'calle avenida bagua jr.1243', 975761665, 1),
(2, 'pedidos ya rsc', '3245678921', 'callejos bagua la capital', 987456321, 1),
(3, 'loper', '346678', 'rergrgeththe', 867495, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ticket`
--

CREATE TABLE `detalle_ticket` (
  `iddt` int(11) NOT NULL,
  `idTicket` int(11) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `dias` int(11) NOT NULL,
  `horas` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` decimal(11,2) NOT NULL,
  `total` decimal(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_ticket`
--

INSERT INTO `detalle_ticket` (`iddt`, `idTicket`, `descripcion`, `dias`, `horas`, `cantidad`, `precio`, `total`) VALUES
(1, 6, 'Jk Cesar Llaguento Carlos', 4, 0, 0, '3.00', '12.00'),
(2, 6, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(3, 6, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(4, 7, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '4.00', '32.00'),
(5, 7, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(6, 7, 'Excavadora de orugas Caterpill', 2, 8, 14, '300.00', '4800.00'),
(7, 8, 'Jk Cesar Llaguento Carlos', 4, 0, 0, '4.00', '16.00'),
(8, 8, 'Excavadora de orugas Caterpill', 2, 8, 0, '300.00', '4800.00'),
(9, 8, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(10, 9, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '2.00', '4.00'),
(11, 9, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(12, 9, 'Excavadora de orugas Caterpill', 2, 8, 1, '300.00', '4800.00'),
(13, 10, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '4.00', '5.00'),
(14, 10, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(15, 10, '', 0, 0, 14, '0.00', '0.00'),
(16, 11, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '4.00', '12.00'),
(17, 11, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(18, 12, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(19, 12, 'Excavadora de orugas Caterpill', 2, 8, 1, '300.00', '4800.00'),
(20, 12, 'Jk Cesar Llaguento Carlos', 3, 0, 1, '4.00', '5.00'),
(21, 13, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '3.00', '4.00'),
(22, 13, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(23, 14, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '4.00', '12.00'),
(24, 14, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(25, 14, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(26, 14, 'Excavadora de orugas Caterpill', 2, 8, 1, '300.00', '4800.00'),
(27, 14, '', 0, 0, 1, '0.00', '0.00'),
(28, 15, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '23.00', '45.00'),
(29, 15, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(30, 15, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(31, 15, 'Excavadora de orugas Caterpill', 2, 8, 14, '300.00', '4800.00'),
(32, 16, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(33, 16, 'Jk Cesar Llaguento Carlos', 4, 0, 1, '4.00', '12.00'),
(34, 16, 'Excavadora de orugas Caterpill', 2, 8, 1, '300.00', '4800.00'),
(35, 17, 'Romina Carrasco Silva ', 4, 0, 0, '40.00', '160.00'),
(36, 17, 'Excavadora de orugas Caterpill', 2, 8, 0, '300.00', '4800.00'),
(37, 17, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(38, 17, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(39, 18, 'Jk Cesar Llaguento Carlos', 4, 0, 0, '50.00', '200.00'),
(40, 18, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(41, 18, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(42, 18, 'Excavadora de orugas Caterpill', 2, 8, 14, '300.00', '4800.00'),
(43, 19, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '4.00', '8.00'),
(44, 19, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(45, 19, 'Excavadora de orugas Caterpill', 2, 8, 1, '300.00', '4800.00'),
(46, 20, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '4.00', '12.00'),
(47, 20, 'Cemento Apu ', 0, 0, 14, '25.00', '350.00'),
(48, 20, 'Excavadora de orugas Caterpill', 2, 8, 14, '300.00', '4800.00'),
(49, 20, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(50, 21, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '40.00', '120.00'),
(51, 21, 'Clavo de calamina acerado de 3', 0, 0, 1, '4.00', '2.00'),
(52, 22, 'Clavo de calamina acerado de 3', 0, 0, 3, '4.00', '12.00'),
(53, 22, 'Cemento Apu ', 0, 0, 3, '25.00', '75.00'),
(54, 22, 'Jk Cesar Llaguento Carlos', 3, 0, 3, '3.00', '9.00'),
(55, 22, 'Excavadora de orugas Caterpill', 2, 8, 3, '300.00', '4800.00'),
(56, 23, 'Jk Cesar Llaguento Carlos', 3, 0, 0, '4.00', '12.00'),
(57, 23, 'Taladro eléctrico', 1, 3, 0, '40.00', '120.00'),
(58, 23, 'Espuma de poliuretano', 0, 0, 17, '25.00', '425.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquina`
--

CREATE TABLE `maquina` (
  `id` int(11) NOT NULL,
  `maquina` varchar(50) NOT NULL,
  `estado` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `maquina`
--

INSERT INTO `maquina` (`id`, `maquina`, `estado`) VALUES
(1, 'Generadores', 1),
(2, 'Motor eléctrico', 1),
(3, 'Transformadores', 1),
(4, 'Taladro eléctrico', 1),
(5, 'Corta tubos', 1),
(6, 'Formon', 1),
(7, 'Maquinas de Rebobinado', 1),
(8, 'Talador de mesa', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquinaria`
--

CREATE TABLE `maquinaria` (
  `idMaquinaria` int(11) NOT NULL,
  `idprove` int(11) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `serie` varchar(11) NOT NULL,
  `numero` varchar(11) NOT NULL,
  `idmaquina` int(11) NOT NULL,
  `horas` varchar(15) NOT NULL,
  `dias` varchar(15) NOT NULL,
  `precio_hora` decimal(11,2) NOT NULL,
  `total` decimal(11,2) NOT NULL,
  `fecha_inicio` varchar(11) NOT NULL,
  `fecha_fin` varchar(11) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `maquinaria`
--

INSERT INTO `maquinaria` (`idMaquinaria`, `idprove`, `fecha`, `serie`, `numero`, `idmaquina`, `horas`, `dias`, `precio_hora`, `total`, `fecha_inicio`, `fecha_fin`, `estado`) VALUES
(1, 1, '09-11-2023', '001', 'N° 000001', 1, '8', '2', '300.00', '4800.00', '10-11-2023', '11-11-2023', 1),
(2, 2, '23-01-2024', '003', 'N°00021', 4, '3', '1', '40.00', '120.00', '23-01-2024', '23-01-2024', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

CREATE TABLE `material` (
  `idMaterial` int(11) NOT NULL,
  `idprove` int(11) NOT NULL,
  `fecha_ingreso` varchar(11) NOT NULL,
  `serie` varchar(11) NOT NULL,
  `numero` varchar(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` varchar(10) NOT NULL,
  `stock_final` int(11) NOT NULL,
  `idunidad` int(11) NOT NULL,
  `precio` decimal(11,2) NOT NULL,
  `total` decimal(11,2) NOT NULL,
  `estado` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `material`
--

INSERT INTO `material` (`idMaterial`, `idprove`, `fecha_ingreso`, `serie`, `numero`, `idproducto`, `cantidad`, `stock_final`, `idunidad`, `precio`, `total`, `estado`) VALUES
(1, 2, '08-11.2023', '001', 'N° 000001', 1, '20', 17, 1, '4.00', '2.00', 1),
(2, 1, '08-11-2023', '001', 'N° 000002', 2, '20', 20, 1, '25.00', '350.00', 1),
(3, 2, '22-01-2024', '002', 'N° 000345', 1, '6', 6, 3, '20.00', '120.00', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `num_dni` int(8) NOT NULL,
  `direccion` varchar(32) NOT NULL,
  `telefono` int(9) NOT NULL,
  `correo` varchar(32) NOT NULL,
  `es_civil` varchar(11) NOT NULL,
  `hijo` varchar(11) NOT NULL,
  `can_hijo` int(9) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `fecha_ingreso` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idpersona`, `nombre`, `num_dni`, `direccion`, `telefono`, `correo`, `es_civil`, `hijo`, `can_hijo`, `sexo`, `estado`, `fecha_ingreso`) VALUES
(1, 'Jk Cesar Llaguento Carlos', 65743892, 'Buenos Aires - Bagua - Amazonas', 975761665, 'llaguentocarloscesar96@gmail.com', 'soltero', 'NO', 0, 'M', 'Activo', '0000-00-00 00:00:00'),
(2, 'Roger Altamirano ', 65743892, 'Bagua - Amazonas', 975761665, 'altamirano@gmail.com', 'Soltero', 'NO', 0, 'M', 'Activo', '0000-00-00 00:00:00'),
(3, 'Romina Carrasco Silva ', 65743892, 'Bagua - Amazonas', 975761665, 'carrascosilva@gmail.com', 'Soltero', 'NO', 0, 'F', 'Activo', '0000-00-00 00:00:00'),
(4, 'Merlyn Marin', 98701243, 'Trita - Amazonas', 987456321, 'marin@gmail.com', 'Soltero', 'NO', 0, 'M', 'Activo', '2024-01-10 19:14:26'),
(5, 'Jorge Luis Mayanga Castro', 42361641, 'Av. Bagua N° 3241', 987123654, 'mayanga@gmail.com', 'Casado', 'SI', 1, 'M', 'Activo', '0000-00-00 00:00:00'),
(6, 'Carlos Rivera Rivera', 89764523, 'Huancayo', 908567432, 'carlosrivera', 'Soltero', 'SI', 1, 'M', 'Activo', '0000-00-00 00:00:00'),
(7, 'Cristian Rodrigues Carrasco', 56431289, 'Av. Mariano Melgar N° 3524', 213765489, 'cristian@gmail.com', 'Viudo', 'SI', 0, 'M', 'Activo', '0000-00-00 00:00:00'),
(8, 'Flor Pileña', 90876543, 'Huancayo', 123456789, 'florpileña@gmail.com', 'Casado', 'SI', 4, 'F', 'Activo', '0000-00-00 00:00:00'),
(9, 'Sociedad de Julica', 21345678, 'Julica-Perú', 123456789, 'sociedad@gmail.com', 'Casado', 'SI', 4, 'M', 'Activo', '0000-00-00 00:00:00'),
(10, 'Juan Carlos Rivera', 9876534, 'Jaen-Peú', 321432879, 'juancarlos@gmail.com', 'Casado', 'SI', 5, 'M', 'Activo', '0000-00-00 00:00:00'),
(11, 'Jose Acuña Rivera', 43643622, 'Cajamarca - Perú', 353524523, 'acuñarivera@gmail.com', 'Viudo', 'SI', 23, 'M', 'Activo', '0000-00-00 00:00:00'),
(12, 'Pepe Goicochea Bobadilla', 23456789, 'Luya - Amazonas', 123456987, 'pepe@gmail.com', 'Casado', 'SI', 3, 'M', 'Activo', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `producto` varchar(50) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `producto`, `estado`) VALUES
(1, 'Canaletas de Plástico', 1),
(2, 'Espuma de poliuretano', 1),
(3, 'Aislante térmico', 1),
(4, 'Tubos de Cobre', 1),
(5, 'Aislante térmico', 1),
(6, 'Tarjeta Universal', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idprove` int(11) NOT NULL,
  `razonsocial` varchar(30) NOT NULL,
  `ruc` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idprove`, `razonsocial`, `ruc`, `direccion`, `telefono`) VALUES
(1, 'Multiservicios Mayanga', '912435645', 'Buenos Aires - Bagua - Amazona', 975761665),
(2, 'Inmobiliaria Jhony', '1234567890', 'Buenos Aires - Bagua - Amazona', 975761665),
(3, 'Consorcio Constructor JLContru', '10483351521', 'Bagua - Amazonas - Perú', 975761665),
(4, 'Pulga Producciones SA', '4321456781', 'Luya - Chachapoyas - Perú', 908765432),
(5, 'Admision 2023', '3245768901', 'bagua', 99999999);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id` int(11) NOT NULL,
  `rol` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `rol`) VALUES
(1, 'admin'),
(2, 'empleado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `idT` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `serie` varchar(11) NOT NULL,
  `numero` varchar(11) NOT NULL,
  `subtotal` decimal(11,2) NOT NULL,
  `total` decimal(11,2) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`idT`, `idUsuario`, `idCliente`, `serie`, `numero`, `subtotal`, `total`, `fecha`) VALUES
(1, 1, 1, '0001', '0000001', '4810.00', '4810.00', '2023-11-20 21:28:02'),
(2, 1, 1, '0001', '000002', '5164.00', '5164.00', '2023-11-20 21:35:35'),
(3, 1, 1, '0001', '000003', '5176.00', '5176.00', '2023-11-20 21:44:04'),
(4, 1, 1, '0001', '000004', '5172.00', '5172.00', '2023-11-20 21:47:35'),
(5, 1, 1, '0001', '000005', '360.00', '360.00', '2023-11-20 21:49:17'),
(6, 1, 1, '0001', '000006', '364.00', '364.00', '2023-11-20 22:06:40'),
(7, 1, 1, 'F0001', '000007', '5182.00', '5182.00', '2023-11-21 01:29:22'),
(8, 1, 1, 'F0001', '000008', '4818.00', '4818.00', '2023-11-21 01:30:53'),
(9, 1, 1, 'F0001', '000009', '4806.00', '4806.00', '2023-11-21 01:35:17'),
(10, 1, 1, 'F0001', '0000010', '355.00', '355.00', '2023-11-21 01:40:09'),
(11, 1, 1, 'F0001', '0000010', '362.00', '362.00', '2023-11-21 01:44:44'),
(12, 1, 1, 'F0001', '0000010', '4807.00', '4807.00', '2023-11-21 01:48:22'),
(13, 1, 1, 'F0001', '0000010', '354.00', '354.00', '2023-11-21 01:50:22'),
(14, 1, 1, 'F0001', '0000010', '5164.00', '5164.00', '2023-11-21 03:50:57'),
(15, 1, 1, 'F0001', '0000010', '5197.00', '5197.00', '2023-11-21 04:13:46'),
(16, 1, 1, 'F0001', '0016', '4814.00', '4814.00', '2023-11-21 04:20:04'),
(17, 1, 1, 'F0001', '00017', '5312.00', '5312.00', '2023-11-21 06:38:16'),
(18, 1, 1, 'F0001', '00018', '5352.00', '5352.00', '2023-11-21 06:40:44'),
(19, 1, 2, 'F0001', '00019', '4810.00', '4810.00', '2023-11-27 19:16:31'),
(20, 1, 1, 'F0001', '00020', '5164.00', '5164.00', '2023-11-27 19:28:19'),
(21, 3, 1, 'F0001', '00021', '4922.00', '4922.00', '2023-11-27 21:08:37'),
(22, 1, 1, 'F0001', '00022', '4896.00', '4896.00', '2024-01-17 17:47:24'),
(23, 1, 1, 'F0001', '00023', '557.00', '557.00', '2024-01-22 20:59:41');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unidad_medida`
--

CREATE TABLE `unidad_medida` (
  `id` int(11) NOT NULL,
  `unidad_medida` varchar(11) NOT NULL,
  `descripcion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `unidad_medida`
--

INSERT INTO `unidad_medida` (`id`, `unidad_medida`, `descripcion`) VALUES
(1, 'Kg', 'Kilogramos'),
(2, 'L', 'Litro'),
(3, 'U', 'Unidad');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `passwor` int(15) NOT NULL,
  `idrol` int(11) NOT NULL,
  `idpersona` int(11) NOT NULL,
  `estado` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `usuario`, `passwor`, `idrol`, `idpersona`, `estado`) VALUES
(1, 'jkcesar', 1234, 1, 1, 1),
(2, 'Pedro', 12345, 1, 2, 1),
(3, 'marin', 12345, 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_maquina`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_maquina` (
`id` int(11)
,`razonsocial` varchar(30)
,`fecha` varchar(15)
,`serie` varchar(11)
,`numero` varchar(11)
,`maquina` varchar(50)
,`horas` varchar(15)
,`dias` varchar(15)
,`precio_hora` decimal(11,2)
,`total` decimal(11,2)
,`fecha_inicio` varchar(11)
,`fecha_fin` varchar(11)
,`estado` int(11)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_material`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_material` (
`id` int(11)
,`razonsocial` varchar(30)
,`fecha_ingreso` varchar(11)
,`serie` varchar(11)
,`numero` varchar(11)
,`material` varchar(50)
,`cantidad` varchar(10)
,`stock_final` int(11)
,`unidad_medida` varchar(11)
,`precio` decimal(11,2)
,`total` decimal(11,2)
,`estado` int(2)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_ticket`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_ticket` (
`idT` int(11)
,`nombre` varchar(50)
,`razonsocial` varchar(50)
,`ruc` varchar(12)
,`direccion` varchar(100)
,`telefono` int(11)
,`serie` varchar(11)
,`numero` varchar(11)
,`subtotal` decimal(11,2)
,`total` decimal(11,2)
,`fecha` timestamp
,`descripcion` varchar(30)
,`dias` int(11)
,`horas` int(11)
,`cantidad` int(11)
,`precio` decimal(11,2)
,`total_de` decimal(11,2)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_usuario`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_usuario` (
`id` int(11)
,`nombre` varchar(50)
,`usuario` varchar(15)
,`passwor` int(15)
,`rol` varchar(11)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_maquina`
--
DROP TABLE IF EXISTS `vista_maquina`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_maquina`  AS SELECT `m`.`idMaquinaria` AS `id`, `p`.`razonsocial` AS `razonsocial`, `m`.`fecha` AS `fecha`, `m`.`serie` AS `serie`, `m`.`numero` AS `numero`, `ma`.`maquina` AS `maquina`, `m`.`horas` AS `horas`, `m`.`dias` AS `dias`, `m`.`precio_hora` AS `precio_hora`, `m`.`total` AS `total`, `m`.`fecha_inicio` AS `fecha_inicio`, `m`.`fecha_fin` AS `fecha_fin`, `m`.`estado` AS `estado` FROM ((`maquinaria` `m` join `proveedor` `p` on(`m`.`idprove` = `p`.`idprove`)) join `maquina` `ma` on(`ma`.`id` = `m`.`idmaquina`)) WHERE `m`.`estado` = 11  ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_material`
--
DROP TABLE IF EXISTS `vista_material`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_material`  AS SELECT `m`.`idMaterial` AS `id`, `p`.`razonsocial` AS `razonsocial`, `m`.`fecha_ingreso` AS `fecha_ingreso`, `m`.`serie` AS `serie`, `m`.`numero` AS `numero`, `pr`.`producto` AS `material`, `m`.`cantidad` AS `cantidad`, `m`.`stock_final` AS `stock_final`, `u`.`unidad_medida` AS `unidad_medida`, `m`.`precio` AS `precio`, `m`.`total` AS `total`, `m`.`estado` AS `estado` FROM (((`material` `m` join `proveedor` `p` on(`m`.`idprove` = `p`.`idprove`)) join `producto` `pr` on(`pr`.`id` = `m`.`idproducto`)) join `unidad_medida` `u` on(`u`.`id` = `m`.`idunidad`)) WHERE `m`.`estado` = 11  ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_ticket`
--
DROP TABLE IF EXISTS `vista_ticket`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_ticket`  AS SELECT `t`.`idT` AS `idT`, `p`.`nombre` AS `nombre`, `c`.`razonsocial` AS `razonsocial`, `c`.`ruc` AS `ruc`, `c`.`direccion` AS `direccion`, `c`.`telefono` AS `telefono`, `t`.`serie` AS `serie`, `t`.`numero` AS `numero`, `t`.`subtotal` AS `subtotal`, `t`.`total` AS `total`, `t`.`fecha` AS `fecha`, `d`.`descripcion` AS `descripcion`, `d`.`dias` AS `dias`, `d`.`horas` AS `horas`, `d`.`cantidad` AS `cantidad`, `d`.`precio` AS `precio`, `d`.`total` AS `total_de` FROM ((((`ticket` `t` join `usuario` `u` on(`t`.`idUsuario` = `u`.`id`)) join `persona` `p` on(`p`.`idpersona` = `u`.`idpersona`)) join `cliente` `c` on(`t`.`idCliente` = `c`.`id`)) join `detalle_ticket` `d` on(`d`.`idTicket` = `t`.`idT`))  ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_usuario`
--
DROP TABLE IF EXISTS `vista_usuario`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_usuario`  AS SELECT `u`.`id` AS `id`, `p`.`nombre` AS `nombre`, `u`.`usuario` AS `usuario`, `u`.`passwor` AS `passwor`, `r`.`rol` AS `rol` FROM ((`usuario` `u` join `persona` `p` on(`u`.`idpersona` = `p`.`idpersona`)) join `rol` `r` on(`u`.`idrol` = `r`.`id`)) WHERE `u`.`estado` = 11  ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `detalle_ticket`
--
ALTER TABLE `detalle_ticket`
  ADD PRIMARY KEY (`iddt`),
  ADD KEY `fk_ticket` (`idTicket`);

--
-- Indices de la tabla `maquina`
--
ALTER TABLE `maquina`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `maquinaria`
--
ALTER TABLE `maquinaria`
  ADD PRIMARY KEY (`idMaquinaria`),
  ADD KEY `fk_proveedor` (`idprove`),
  ADD KEY `fk_maqui` (`idmaquina`);

--
-- Indices de la tabla `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`idMaterial`),
  ADD KEY `fk_idprove` (`idprove`),
  ADD KEY `fk_unidad` (`idunidad`),
  ADD KEY `fk_produ` (`idproducto`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idpersona`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idprove`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`idT`),
  ADD KEY `fk_usuar` (`idUsuario`),
  ADD KEY `fk_cliente` (`idCliente`);

--
-- Indices de la tabla `unidad_medida`
--
ALTER TABLE `unidad_medida`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_rol` (`idrol`),
  ADD KEY `fkpersona` (`idpersona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `detalle_ticket`
--
ALTER TABLE `detalle_ticket`
  MODIFY `iddt` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT de la tabla `maquina`
--
ALTER TABLE `maquina`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `maquinaria`
--
ALTER TABLE `maquinaria`
  MODIFY `idMaquinaria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `material`
--
ALTER TABLE `material`
  MODIFY `idMaterial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idprove` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
  MODIFY `idT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `unidad_medida`
--
ALTER TABLE `unidad_medida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_ticket`
--
ALTER TABLE `detalle_ticket`
  ADD CONSTRAINT `detalle_ticket_ibfk_2` FOREIGN KEY (`idTicket`) REFERENCES `ticket` (`idT`);

--
-- Filtros para la tabla `maquinaria`
--
ALTER TABLE `maquinaria`
  ADD CONSTRAINT `maquinaria_ibfk_1` FOREIGN KEY (`idprove`) REFERENCES `proveedor` (`idprove`),
  ADD CONSTRAINT `maquinaria_ibfk_2` FOREIGN KEY (`idmaquina`) REFERENCES `maquina` (`id`);

--
-- Filtros para la tabla `material`
--
ALTER TABLE `material`
  ADD CONSTRAINT `material_ibfk_1` FOREIGN KEY (`idprove`) REFERENCES `proveedor` (`idprove`),
  ADD CONSTRAINT `material_ibfk_2` FOREIGN KEY (`idunidad`) REFERENCES `unidad_medida` (`id`),
  ADD CONSTRAINT `material_ibfk_3` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`id`);

--
-- Filtros para la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `ticket_ibfk_2` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`idrol`) REFERENCES `rol` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
