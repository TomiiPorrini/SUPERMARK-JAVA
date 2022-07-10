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
-- Table structure for table `domicilio`
--

DROP TABLE IF EXISTS `domicilio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `domicilio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `calle1` varchar(30) DEFAULT NULL,
  `calle2` varchar(30) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `ruta` varchar(30) DEFAULT NULL,
  `km` int DEFAULT NULL,
  `depNumero` int DEFAULT NULL,
  `piso` int DEFAULT NULL,
  `id_localidad` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `localidad_fk` (`id_localidad`),
  CONSTRAINT `localidad_fk` FOREIGN KEY (`id_localidad`) REFERENCES `localidad` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domicilio`
--

LOCK TABLES `domicilio` WRITE;
/*!40000 ALTER TABLE `domicilio` DISABLE KEYS */;
INSERT INTO `domicilio` VALUES (1,'San Luis',NULL,20,NULL,NULL,4,7,1),(2,'Ceibos',NULL,320,NULL,NULL,NULL,NULL,2),(3,'Solis Pizarro','Las Garzas',767,NULL,NULL,NULL,NULL,3),(4,'Mitre',NULL,5678,NULL,NULL,NULL,NULL,4),(5,'Ruta 60',NULL,60,'61',NULL,NULL,NULL,5),(6,'Departament','Arenales',NULL,NULL,NULL,2,1,6),(7,'San Jose','Calazans',325,NULL,NULL,NULL,NULL,7),(8,'Facundo de Zuviria',NULL,40,NULL,NULL,NULL,NULL,8),(9,'Alta Tension',NULL,199,NULL,NULL,NULL,NULL,9),(10,'Tres Cerritos','siempre viva',1996,NULL,NULL,NULL,NULL,10);
/*!40000 ALTER TABLE `domicilio` ENABLE KEYS */;
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
