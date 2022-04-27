-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_libros
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `ID_Libro` bigint NOT NULL,
  `ISBN` bigint DEFAULT NULL,
  `Titulo` varchar(45) DEFAULT NULL,
  `Descripción` varchar(500) DEFAULT NULL,
  `Año_Public` int DEFAULT NULL,
  `ID_Autor` bigint NOT NULL,
  `ID_Genero` bigint NOT NULL,
  PRIMARY KEY (`ID_Libro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (38643,9788408245872,'Cuando no queden más estrellas que contar','¿Cómo se ignora lo que late en tu interior? ¿Cómo se recupera el rumbo de una vida trazada por una mentira? El único mundo que Maya conoce se ha derrumbado. Un viaje inesperado, una chica incompleta y una verdad escondida en una caja de música. A veces, dejar que suceda es todo lo que necesitas. ',2021,65483,1204),(39473,9786070732720,'Orgullo y prejuicio','Adversarios al principio en las interminables rondas de bailes, fiestas y reuniones sociales, la altiva Elizabeth Bennet y el elegante pero distante Fitzwilliam Darcy pronto desarrollan un respeto a regañadientes el uno por el otro que florece en romance cuando cada uno llega a apreciar los tiernos sentimientos que se esconden bajo el barniz de su propiedad y reserva.',2016,10138,1201),(46873,9781250183507,'Vicious','En Vicious, V. E. Schwab da vida a un mundo despiadado al estilo de los cómics con una prosa vívida: un mundo en el que adquirir superpoderes no conduce automáticamente al heroísmo, y una época en la que se cuestionan las lealtades.',2018,40394,1205),(48584,9780765387561,'The Invisible Life of Addie LaRue','Francia, 1714: en un momento de desesperación, una joven hace un trato fáustico para vivir para siempre, y recibe la maldición de ser olvidada por todos los que conoce. ',2020,40394,1202),(65438,9780312577223,'The Nightingale','El Ruiseñor es una historia de amor y pérdida, ambientada en la Segunda Guerra Mundial.',2015,86548,1203);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-24  9:55:21
