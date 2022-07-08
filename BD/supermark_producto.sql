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
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `fecha_venc` date DEFAULT NULL,
  `precio` float NOT NULL,
  `stock` int DEFAULT NULL,
  `id_tipo` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tipo_fk` (`id_tipo`),
  CONSTRAINT `tipo_fk` FOREIGN KEY (`id_tipo`) REFERENCES `tipo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Aceite de Girasol 900 Ml.','DIA','2023-07-02',156.45,10,1),(3,'Arvejas secas remojadas DIA 300 Gr.','Dia','2023-07-02',69.99,10,1),(4,'Caldo Verduras Deshidratado 12 cubos','Knorr','2023-07-02',227.99,10,1),(5,'Turrón con Maní 25 Gr.','Arcor','2023-07-02',37,10,1),(6,'Harina Leudante 1 Kg.','DIA','2023-07-02',115,10,1),(7,'Maní Pelado Pehuamar 110 Gr.','Pemahuar','2023-07-02',136.39,10,1),(8,'Galletitas 354 Gr.','Oreo','2023-07-02',349,10,2),(9,'Azúcar Plus Común tipo A 1 Kg.','DIA','2023-07-02',135,10,2),(10,'Dulce de Leche Clásico con calcio 400 Gr.','La Serenísima','2023-07-02',84.61,10,2),(11,'Pan Rallado Molino 500 Gr.','Cañuelas','2023-07-02',84.61,10,2),(12,'Bidón de agua 6,5 Lts.','Dia','2023-07-02',190,10,3),(13,'Gaseosa Sabor Original 1,5 Lts.','Coca-Cola ','2023-07-02',135.17,10,3),(14,'Jugo en Polvo Naranja Dulce 7,5 Gr.','Clight','2023-07-02',39.39,10,3),(15,'Aperitivo Fernet 750 ml.','Branca','2023-07-02',1189,10,3),(16,'Vino Tinto Malbec 750 ml.','Elementos','2023-07-02',469,10,3),(17,'Cerveza Rubia 500 ml.','St. Wendeler','2023-07-02',140,10,3),(18,'Vodka en lata 473 ml.','Dr. Lemon','2023-07-02',217,10,3),(19,'Manteca Calidad Extra 200 Gr.','DIA','2023-07-02',228,10,4),(20,'Leche Semi Descremada Larga Vida 1L','DIA','2023-07-02',123.5,10,4),(21,'Banana x 1 Kg.','DIA','2023-07-02',189,10,4),(22,'Pollo Fresco x 1 Kg.','AVILIGHT','2023-07-02',299,10,4),(23,'Queso Untable La Serenísima Light 290 Gr.','LA SERENISIMA','2023-07-02',213.5,10,4),(24,'Ravioles DIA 4 Quesos 520 Gr.','DIA','2023-07-02',222,10,4),(25,'Palta x 1 Un.','SIN MARCA','2023-07-02',79,10,5),(26,'Medallones de Pollo DIA 160 Gr.','DIA','2023-07-02',139,10,6),(27,'Frambuesas Bañadas Delicious en Chocolate 130 Gr.','DIA','2023-07-02',399,10,6),(28,'Langostinos DIA congelados 250 Gr.','DIA','2023-07-02',699,10,6),(29,'Paty de Carne Clásicas 4 Un. 320 Gr.','PATY','2023-07-02',567,10,6),(30,'Crema Dental Triple Accion Xtra Whitening 70 Gr','Colgate','2023-07-02',213.6,10,7),(31,'Desodorante Antitranspirante 250 Ml.','Dove','2023-07-02',276.25,10,7),(32,'Shampoo Reconstrucción 400 Ml.','Dove','2023-07-02',376.44,10,7),(33,'Jabón de Tocador Original individual 90 Gr.','Dove','2023-07-02',164.49,10,7),(34,'Toallitas Femeninas Protección Dual Suave 9 Un.','Always','2023-07-02',105.5,10,7),(35,'Máquinas Desechables Para Depilar Suave 2 Un.','Gillette','2023-07-02',220,10,7),(36,'Hisopos 100 Un.','Bonté','2023-07-02',159.99,10,7),(37,'Rollo de Cocina 50 Paños 3 Ud.','DIA','2023-07-02',223,10,8),(38,'Limpiador Desinfectante Lavanda 1,8 Lts.','Poett','2023-07-02',219,10,8),(39,'Shampoo Reconstrucción Completa 400 Ml.','Dove','2023-07-02',376.44,10,8),(40,'Esponja Antibacterial 1 Un.','Mortimer','2023-07-02',44.44,10,8),(41,'Jabón Líquido para Diluir Bio-Enzimas 500 Ml.','Skip','2023-07-02',622.8,10,8),(42,'Desinfectante de Ambientes en Aerosol 360 Ml.','Lysoform','2023-07-02',219,10,8),(43,'MATA MOSCAS Y MOSQUITOS AEROSOL 360ML','FUYI','2023-07-02',175,10,8),(44,'Fósforos Ecológicos 220 Ud.','Buenos Días','2023-07-02',149.99,10,8),(45,'Toallitas Húmedas Triple Protección 80 Un.','Huggies','2023-07-02',305,10,9),(46,'Óleo Calcareo 500 Ml.','Baby Smile','2023-07-02',335,10,9),(47,'Leche Bebé Etapa 1 Modificada 500 Ml.','Sancor','2023-07-02',274,10,9),(48,'Alimento Seco para Gatos Salmón y Pollo 3 Kg.','Gati','2023-07-02',993.32,10,10),(49,'Alimento Perro Carne/Pollo/Cereales/Vegetales 3 Kg','Dogui','2023-07-02',705.35,10,10),(50,'Mano Recolectora 396 Gr.','Arcor','2023-07-02',229,10,11),(51,'Pegamento Instantáneo 2 Ml.','La Gotita','2023-07-02',210,10,12),(52,'Carrito de Compras Grande 38 Lts.','SIN MARCA','2023-07-02',999.99,10,12),(53,'Pila Alcalina AAA 2 Un.','Energizer','2023-07-02',415,10,12),(54,'Molde Plástico de galletitas 4 Un.','Carol','2023-07-02',199,10,12),(55,'Turboconvector de PTC PVE60 2 Potencias','Electrolux','2023-07-02',27999,10,13),(56,'Vaporizador de Pisos PowerMop+ MOP11','Electrolux','2023-07-02',19999,10,13),(57,'Horno Empotrable Eléctrico EOCH50 50 Lts','Electrolux','2023-07-02',89999,10,13),(58,'Secarropas Eseb6 6kg','Electrolux','2023-07-02',78999,10,13),(59,'Heladera con freezer HGF357AFP Plata 282 lts','GAFA','2023-07-02',84999,10,13),(60,'Campana Extractora 90 CM','Whirlpool','2023-07-02',110099,10,13);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-07 16:25:44
