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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `dni` int unsigned NOT NULL,
  `contrasenia` varchar(16) DEFAULT NULL,
  `isAdmin` bit(1) NOT NULL DEFAULT b'0',
  `id_domicilio` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `domicilio_fk` (`id_domicilio`),
  CONSTRAINT `domicilio_fk` FOREIGN KEY (`id_domicilio`) REFERENCES `domicilio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Matias Dante','Martinez','admin@admin.com',39402380,'12345678',_binary '',1),(2,'Silvia Susana','Otero','SilviaSusana@hotmail.com',15638665,'A1234567',_binary '\0',2),(3,'Anthony','Shepard','libero.at@hotmail.ca',52356126,'RWJ97YYG5CS',_binary '\0',3),(4,'Rashad','Clemons','vel.vulputate@yahoo.com',23512365,'EYB72FOM7NO',_binary '\0',4),(5,'Tashya','Munoz','malesuada.id@icloud.org',43596325,'ZYE23WDM2NZ.',_binary '\0',5),(6,'Adrian','Rowland','at@icloud.couk',35126354,'PNQ48AGJ8HP',_binary '\0',6),(7,'Jeanette','Richards','cum.sociis@aol.net',28354156,'VBU35KPC5N.',_binary '\0',7),(8,'Boris','Conway','aliquamnunc@google.org',52398501,'KSF96SHQ5SI.',_binary '\0',8),(9,'Davis','Gaines','non@yahoo.or',20564805,'QNY99QVJ1R.',_binary '\0',9),(10,'Christopher','Black','augue.ac.ipsum@hotmail.org',19956050,'QNY99QVJ1RC.',_binary '\0',10);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-07 16:25:45
