-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: controle_estoque
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `cnpjCpf` varchar(18) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `endereco` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (1,'Tech Industrial LTDA','12.345.678/0001-90','(11) 91234-5678','contato@techindustrial.com','Rua das Indústrias, 150 - São Paulo/SP'),(2,'Metalúrgica Borges','98.765.432/0001-55','(19) 99845-2231','vendas@metalborges.com.br','Av. Brasil, 900 - Campinas/SP'),(3,'Distribuidora Elétrica Nova Era','23.456.789/0001-12','(21) 98822-4411','suporte@novaeraeletrica.com','Rua Conselheiro Paulino, 22 - Rio de Janeiro/RJ'),(4,'Componentes Alfa','45.987.321/0001-33','(31) 99788-1100','alfa@componentes.com','Rua Alfa Beta, 300 - Belo Horizonte/MG'),(5,'EletroParts Solutions','54.876.123/0001-66','(41) 99545-7788','contato@eletroparts.com','Rua Sol Nascente, 44 - Curitiba/PR'),(8,'Comercial Alfa LTDA','12.345.678/0001-90','(11) 4002-8922','contato@alfa.com','Rua das Indústrias, 150 - São Paulo'),(9,'Metalúrgica Orion','98.765.432/0001-21','(11) 99888-5544','vendas@orionmetal.com','Avenida Forte, 820 - Santo André'),(10,'TechPower Componentes','45.789.123/0001-33','(21) 3222-1100','suporte@techpower.com','Rua Tecnológica, 451 - Rio de Janeiro'),(11,'Distribuidora Delta','22.555.777/0001-66','(31) 98844-2211','comercial@deltadistribuidora.com','Av. Minas Gerais, 1002 - Belo Horizonte'),(12,'EletroVale Peças','67.123.456/0001-10','(47) 3344-9988','contato@eletrovale.com','Rua das Máquinas, 87 - Joinville'),(13,'MasterTec Industrial','32.999.888/0001-55','(51) 98080-2525','vendas@mastertec.com','Avenida Industrial, 2220 - Porto Alegre'),(14,'Eletrônica Nova Era','11.888.444/0001-99','(85) 3333-4444','atendimento@novaeraeletronica.com','Rua Alvorada, 56 - Fortaleza'),(15,'HidroLuz Soluções','55.666.777/0001-12','(41) 99912-8877','contato@hidroluz.com','Av. Curitiba, 190 - Curitiba'),(16,'Sony','234939453254.','(11) 845345245','playstation@mgail.com','AV. ASADSAD');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-07 18:05:31
