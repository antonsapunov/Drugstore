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
-- Table structure for table `drugstores`
--

DROP TABLE IF EXISTS `drugstores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drugstores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `drugstore` varchar(128) NOT NULL,
  `address` varchar(300) NOT NULL,
  `phone_number` char(50) NOT NULL,
  `working_hours` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone_number_UNIQUE` (`phone_number`),
  UNIQUE KEY `address_UNIQUE` (`address`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drugstores`
--

LOCK TABLES `drugstores` WRITE;
/*!40000 ALTER TABLE `drugstores` DISABLE KEYS */;
INSERT INTO `drugstores` VALUES (1,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №1','г. Минск, ул. Рафиева, д. 93/4','+375 (17) 2017071','Круглосуточная'),(2,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №2','г. Минск, ул. Куйбышева, д. 40 (ТЦ «Паркинг»)','+375 (17) 2373267; +375 (44) 5033017','9.00 - 21.00 Пн - Вс'),(3,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №10','г. Минск, м. Партизанская (выход к ул. Долгобродская)','+375 (17) 2961012; +375 (44) 5033023','8.00 - 21.00 Пн - Пт 10.00 - 18.00 Сб - Вс'),(4,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №12','г. Минск, ул. Сурганова, д. 47/б (МЦ «Нордин»)','+375 (17) 2925492; +375 (44) 5033025','8.00 - 21.00 Пн - Пт 8.00 - 16.00 Сб 9.00 - 16.00 Вс'),(5,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №13','г. Минск, м. Каменная Горка (выход к ул. Лобанка)','+375 (17) 2543329; +375 (44) 5033026','7.00 - 22.00 Пн - Пт 8.00 - 22.00 Сб - Вс'),(6,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №15','г. Минск, м. Кунцевщина (тер. Подземные переходы, 10, пом. 13)','+375 (17) 2542883; +375 (44) 5033028','8.00 - 22.00 Пн - Пт 9.00 - 19.00 Сб - Вс '),(7,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №17','г. Минск, ул. Матусевича, д. 90, пом. 5Н','+375 (17) 2549472; +375 (44) 5033031','8.00 - 22.00 Пн - Пт 10.00 - 19.00 Сб - Вс'),(8,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №18','г. Минск, ул. Мясникова, д. 35','+375 (17) 2001618; +375 (44) 5033032','8.00 - 21.00 Пн - Пт 10.00 - 18.00 Сб'),(9,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №19','г. Минск, пр-т Независимости, д. 104','+375 (17) 2688155; +375 (44) 5033034','9.00 - 21.00 Пн - Пт 9.00 - 19.00 Сб 10.00 - 18.00 Вс'),(10,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №20','г. Минск, пр-т Независимости, д. 186','+375 (17) 2686130; +375 (44) 5033035','10.00 - 20.00 Пн - Сб'),(11,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №21','г. Минск, ул. Восточная, д. 129','+375 (44) 5033036','9.00 - 21.00 Пн - Вс'),(12,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №22','г. Минск, ул. Мирошниченко, д. 3','+375 (17) 2884888; +375 (44) 5033037','8.00 - 21.00 Пн - Пт 9.00 - 21.00 Сб - Вс'),(13,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №25','г. Минск, ул. Брыля, д. 30','+375 (17) 3769965; +375 (44) 5033038','8.00 - 20.00 Пн - Пт 10.00 - 19.00 Сб - Вс'),(14,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №26','г. Минск, пр-т Независимости, д. 70','+375 (17) 3321518; +375 (29) 1092586','8.00 - 20.00 Пн - Пт 10.00 - 18.00 Сб'),(15,'Аптека ADEL Фарммаркет-Плюс ООО Аптека №27','г. Минск, ул. Академическая, д. 1','+375 (17) 2949426; +375 (44) 5033043','9.00 - 18.00 Пн - Пт');
/*!40000 ALTER TABLE `drugstores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-03 16:06:22
