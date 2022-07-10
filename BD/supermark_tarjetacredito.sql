-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: supermark
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `tarjetacredito`
--

DROP TABLE IF EXISTS `tarjetacredito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjetacredito` (
  `numero` bigint unsigned NOT NULL,
  `banco` varchar(20) DEFAULT NULL,
  `titular` varchar(60) DEFAULT NULL,
  `fecha_caducidad` date DEFAULT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`numero`),
  KEY `usuario_tc_fk` (`id_usuario`),
  CONSTRAINT `usuario_tc_fk` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjetacredito`
--

LOCK TABLES `tarjetacredito` WRITE;
/*!40000 ALTER TABLE `tarjetacredito` DISABLE KEYS */;
INSERT INTO `tarjetacredito` VALUES (1238818095333344,'agencar','Christopher Black','2025-04-01',10),(1482992646799444,'american express','Anthony Shepard','2025-04-01',3),(3066729612926036,'cencosud','Boris Conway','2025-04-01',8),(3534741295468490,'falabella','Davis Gaines','2025-04-01',9),(3721739806996429,'cabal','Tashya Munoz','2025-04-01',5),(4127763888169679,'naranja','Rashad Clemons','2025-04-01',4),(4492935287155530,'cordobesa','Adrian Rowland','2025-04-01',6),(4567564566047805,'tarjeta shopping','Jeanette Richards','2025-04-01',7),(5218294728031761,'visa','Silvia Susana Otero','2025-04-01',2),(5547305637843746,'mastercard','MATIAS D MARTINEZ','2025-04-01',1);
/*!40000 ALTER TABLE `tarjetacredito` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-09 23:57:53
