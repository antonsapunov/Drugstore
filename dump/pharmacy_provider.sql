-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: pharmacy
-- ------------------------------------------------------
-- Server version	5.7.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `provider`
--

DROP TABLE IF EXISTS `provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(128) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=146 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provider`
--

LOCK TABLES `provider` WRITE;
/*!40000 ALTER TABLE `provider` DISABLE KEYS */;
INSERT INTO `provider` VALUES (1,'Abbott Laboratories'),(2,'Actavis Group hf.'),(3,'Alcon'),(4,'Alkaloid AD'),(5,'Astellas Pharma Europe B.V.'),(6,'Aurobindo Pharma'),(7,'Bausch & Lomb'),(8,'Baxter'),(9,'Bayer AG, Division Consumer Health'),(10,'BELUPO d.d.'),(11,'Berlin-Chemie AG/Menarini Group'),(12,'Boehringer Ingelheim International'),(13,'Boehringer Ingelheim Pharma'),(14,'Bristol-Myers Squibb'),(15,'Byk Gulden'),(16,'Cadila Pharmaceuticals'),(17,'Chiesi Farmaceutici'),(18,'CTS Chemical Industries'),(19,'Dr. Reddy_s Laboratories Ltd.'),(20,'Dr. Theiss Naturwaren GmbH'),(21,'EGIS Pharmaceuticals PLC'),(22,'Faran Laboratories'),(23,'Four Ventures Enterprises'),(24,'Galenika a.d.'),(25,'Gedeon Richter'),(26,'GlaxoSmithKline'),(27,'Glenmark Pharmaceuticals Ltd.'),(28,'Grodzisk Pharmaceutical Works Polfa Co.'),(29,'Hemofarm'),(30,'Hexal AG'),(31,'HiGlance Laboratories Pvt. Ltd.'),(32,'Italfarmaco'),(33,'IVAX Pharmaceuticals s.r.o.'),(34,'Jadran Galenski Laboratorij'),(35,'Janssen Pharmaceutical Companies by Johnson & Johnson'),(36,'Johnson & Johnson Consumer Products'),(37,'KRKA'),(38,'Lannacher Heilmittel'),(39,'Lek'),(40,'Lilly'),(41,'Merck Sharp & Dohme'),(42,'Novartis Pharma'),(43,'Novartis Pharma Services'),(44,'Nycomed'),(45,'Pabianice Pharmaceutical Works Polfa'),(46,'Pfizer'),(47,'Pfizer H.C.P. Corporation'),(48,'Pliva Hrvatska d.o.o.'),(49,'Polpharma'),(50,'Prespharm'),(51,'PRO.MED.CS Praha a.s.'),(52,'Promed Exports'),(53,'Ranbaxy'),(54,'Ratiopharm GmbH'),(55,'S.I.F.I.'),(56,'Sanavita Gesundheitsmittel'),(57,'Santen OY'),(58,'Schering-Plough'),(59,'Schwarz Pharma'),(60,'SEDICO'),(61,'Shreya Life Sciences'),(62,'Solvay Pharma'),(63,'Sopharma AD'),(64,'STADA CIS'),(65,'Sun Pharmaceutical Industries Ltd.'),(66,'Takeda Pharmaceuticals Limited Liability Company'),(67,'Teva'),(68,'Torrent Pharmaceuticals'),(69,'Ursapharm Arzneimittel GmbH'),(70,'Valeant Pharmaceuticals Switzerland GmbH'),(71,'Warsaw Pharmaceutical Works Polfa'),(72,'Worwag Pharma GmbH & Co. KG'),(73,'Zentiva k.s'),(74,'Акрихин'),(75,'АстраЗенека Фармасьютикалз ООО'),(76,'Белмедпрепараты РУП'),(77,'Биореактор'),(78,'Биосинтез ОАО'),(79,'Брынцалов-А'),(80,'Валента Фармацевтика'),(81,'Верофарм ОАО'),(82,'ВИФИТЕХ'),(83,'Гриндекс'),(84,'Дарница'),(85,'Здоровье — фармацевтическая компания'),(86,'Ирбитский химфармзавод'),(87,'Канонфарма продакшн ЗАО'),(88,'КОНПО'),(89,'Корал-Мед'),(90,'Космофарм'),(91,'Краснодарская фармфабрика'),(92,'ЛЕКС'),(93,'Мастерлек'),(94,'Мединторг АО'),(95,'Медисорб'),(96,'Микроген НПО ФГУП МЗ РФ'),(97,'Московский эндокринный завод'),(98,'Мосхимфармпрепараты им. Н.А.Семашко'),(99,'Натива ООО'),(100,'НИЖФАРМ'),(101,'НИОПИК ГНЦ'),(102,'Новартис Консьюмер Хелс ООО'),(103,'Олайнфарм'),(104,'Органика'),(105,'ПИК-ФАРМА'),(106,'Представительство Акционерного общества «Санофи-авентис груп»'),(107,'Представительство АО «Босналек»'),(108,'Пульмомед'),(109,'Ростовская фармфабрика ЗАО'),(110,'Русичи-Фарма'),(111,'Сандоз ЗАО'),(112,'Северная звезда'),(113,'Синтез ОАО'),(114,'Сотекс ФармФирма'),(115,'Сперко Украина СП'),(116,'Таллиннский фармацевтический завод'),(117,'Ф. Хоффманн-Ля Рош Лтд.'),(118,'Фарм-Синтез ЗАО'),(119,'Фармавит'),(120,'Фармак ПАО'),(121,'Фармакон'),(122,'Фармасинтез'),(123,'Фармцентр ВИЛАР'),(124,'Фирн М'),(125,'Фрезениус Каби ООО'),(126,'ЭКОлаб'),(127,'Эльфа Научно-производственный центр АО'),(138,'Anton'),(139,'Инбог'),(140,'Аааа'),(141,'A'),(142,'Фд'),(143,'Ф'),(144,','),(145,'D');
/*!40000 ALTER TABLE `provider` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-03 16:06:23
