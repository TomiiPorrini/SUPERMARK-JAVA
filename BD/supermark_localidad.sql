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
-- Table structure for table `localidad`
--

DROP TABLE IF EXISTS `localidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `localidad` (
  `id` int NOT NULL AUTO_INCREMENT,
  `provincia` varchar(20) DEFAULT NULL,
  `departamento` varchar(40) DEFAULT NULL,
  `ciudad` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `localidad`
--

LOCK TABLES `localidad` WRITE;
/*!40000 ALTER TABLE `localidad` DISABLE KEYS */;
INSERT INTO `localidad` VALUES (1,'Salta','San Martín','Aguaray'),(2,'Salta','San Martín','Embarcación'),(3,'Salta','San Martín','Ballivian'),(4,'Salta','San Martín','Mosconi'),(5,'Salta','San Martín','Salvador Mazza'),(6,'Salta','San Martín','Tartagal'),(7,'Salta','Rivadavia','Rivadavia Banda Norte'),(8,'Salta','Rivadavia','Rivadavia Banda Sur'),(9,'Salta','Rivadavia','Santa Victoria Este'),(10,'Salta','Salta','Salta'),(11,'Salta','Salta','San Lorenzo'),(12,'Salta','Oran','Aguas Blancas'),(13,'Salta','Oran','Colonia Santa Rosa'),(14,'Salta','Oran','Hipólito Yrigoyen'),(15,'Salta','Oran','San Ramón de la Nueva Orán'),(16,'Salta','Oran','Pichanal'),(17,'Salta','Oran','Urundel'),(18,'Salta','La Viña','La Viña'),(19,'Salta','La Viña','Coronel Moldes'),(20,'Salta','Metan','Ríos Piedras'),(21,'Salta','Metan','Metán'),(22,'Salta','Metan','El Galpón'),(23,'Salta','La Candelaria','El Jardín'),(24,'Salta','La Candelaria','La Candelaria'),(25,'Salta','La Candelaria','El Tala'),(26,'Salta','Iruya','Iruya'),(27,'Salta','Iruya','Isla de Cañas'),(28,'Salta','Santa Victoria','Nazareno'),(29,'Salta','Santa Victoria','Los Toldos'),(30,'Salta','Santa Victoria','Santa Victoria Oeste'),(31,'Salta','La Poma','La Poma'),(32,'Salta','Rosario de la Frontera','El Potrero'),(33,'Salta','Rosario de la Frontera','Rosario de la Frontera'),(34,'Salta','Molinos','Seclantás'),(35,'Salta','Molinos','Molinos'),(36,'Salta','La Caldera','La Caldera'),(37,'Salta','La Caldera','Vaqueros'),(38,'Salta','Los Andes','Tolar Grande'),(39,'Salta','Los Andes','San Antonio de Los Cobres'),(40,'Salta','San Carlos','Angastaco'),(41,'Salta','San Carlos','Animaná'),(42,'Salta','San Carlos','San Carlos'),(43,'Salta','Anta','Apolinario Saravia'),(44,'Salta','Anta','El Quebrachal'),(45,'Salta','Anta','Gral. Pizarro'),(46,'Salta','Anta','J.V. Gonzalez'),(47,'Salta','Anta','Las Lajitas'),(48,'Salta','Guachipas','Guachipas'),(49,'Salta','Cafayate','Cafayate'),(50,'Salta','Cachi','Payogasta'),(51,'Salta','Cachi','Cachi'),(52,'Salta','Rosario de Lerma','Rosario de Lerma'),(53,'Salta','Rosario de Lerma','Campo Quijano'),(54,'Salta','General Güemes','Campo Santo'),(55,'Salta','General Güemes','El Bordo'),(56,'Salta','General Güemes','General Güemes'),(57,'Salta','Cerrillos','La Merced'),(58,'Salta','Cerrillos',' El Carril'),(59,'Salta','Chicoana',' Cerrillos'),(60,'Salta','Chicoana',' Chicoana');
/*!40000 ALTER TABLE `localidad` ENABLE KEYS */;
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
