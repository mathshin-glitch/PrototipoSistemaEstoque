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
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `quantidade` int DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (18,'Contator 9A','Contator elétrico industrial modelo 9A',55),(19,'Contator 12A','Contator para comandos elétricos 12A',38),(20,'Relé Térmico 1-1.6A','Relé de proteção para motores',22),(21,'Relé Térmico 4-6A','Relé para sobrecarga de motores',18),(22,'Disjuntor 10A','Disjuntor monopolar curva C',75),(23,'Disjuntor 16A','Disjuntor monopolar curva C',60),(24,'Disjuntor 20A','Disjuntor bipolar para proteção geral',40),(25,'Chave Seccionadora 32A','Chave seccionadora para painéis elétricos',12),(26,'Chave Seccionadora 63A','Seccionadora industrial reforçada',8),(27,'Fusível NH 63A','Fusível de proteção tipo NH',95),(28,'Fusível NH 100A','Fusível NH para proteção de circuitos',67),(29,'Cabo PP 2x1.5mm','Cabo flexível para instalações elétricas',200),(30,'Cabo PP 4x2.5mm','Cabo flexível industrial de 4 vias',150),(31,'Sensor Indutivo PNP','Sensor indutivo de proximidade modelo PNP',32),(32,'Sensor Indutivo NPN','Sensor indutivo industrial NPN',29),(33,'Fonte 24V 5A','Fonte chaveada de 24V 5A para painéis',14),(34,'Fonte 24V 10A','Fonte industrial 24V 10A',9),(35,'Botão de Emergência','Botão de parada de emergência com trava',45),(36,'Botão Verde Liga','Botão pulsador verde para comando',70),(37,'Botão Vermelho Desliga','Botão pulsador vermelho',68),(38,'Mini Disjuntor 6A','Disjuntor monofásico curva C',40),(39,'Mini Disjuntor 32A','Disjuntor industrial curva C',22),(40,'Contato Auxiliar','Contato auxiliar para contator',80),(41,'Tomada Industrial 32A','Tomada macho industrial 32A',18),(42,'Tomada Industrial 16A','Tomada fêmea industrial 16A',28),(43,'Borne Para Trilho','Borne elétrico para trilho DIN',150),(44,'Trilho DIN','Trilho DIN para montagem de painéis',75),(45,'Etiqueta de Painel','Etiquetas para identificação de componentes',500),(46,'Módulo Relé 8 Canais','Módulo relé para automação 24V',12),(47,'Módulo Relé 4 Canais','Relé industrial para automação',20),(48,'CLP Compacto','Controlador lógico programável padrão industrial',6),(49,'CLP Modular','CLP modular expansível para painéis',4),(50,'Moto Bomba','Diesel Eletrico',11);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-07 18:05:30
