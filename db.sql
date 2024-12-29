/*
SQLyog Ultimate v8.4 
MySQL - 5.1.47-community : Database - gaosumng
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gaosumng` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gaosumng`;

/*Table structure for table `cheliang` */

DROP TABLE IF EXISTS `cheliang`;

CREATE TABLE `cheliang` (
  `cid` varchar(50) NOT NULL,
  `cname` varchar(50) DEFAULT NULL,
  `jid` varchar(50) DEFAULT NULL,
  `cpic` varchar(100) DEFAULT NULL,
  `cbackup` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cheliang` */

insert  into `cheliang`(`cid`,`cname`,`jid`,`cpic`,`cbackup`) values ('LA','奔驰','j1',NULL,''),('LB','奥迪','j1',NULL,NULL),('LC','宝马','j2',NULL,NULL),('S001','奔驰','j3',NULL,''),('辽A8989','宝马','j999',NULL,NULL),('辽B3399','法拉利','j109',NULL,NULL);

/*Table structure for table `jiashiyuan` */

DROP TABLE IF EXISTS `jiashiyuan`;

CREATE TABLE `jiashiyuan` (
  `jid` varchar(50) NOT NULL,
  `jname` varchar(50) DEFAULT NULL,
  `jcode` varchar(50) DEFAULT NULL,
  `jsex` int(11) DEFAULT NULL,
  `jtotal` int(11) DEFAULT NULL,
  `jtel` varchar(50) DEFAULT NULL,
  `jmoney` int(11) DEFAULT NULL,
  `jbackup` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jiashiyuan` */

insert  into `jiashiyuan`(`jid`,`jname`,`jcode`,`jsex`,`jtotal`,`jtel`,`jmoney`,`jbackup`) values ('105','张三丰','',1,12,'',0,''),('j1','铁拐李','123',1,0,NULL,148,NULL),('j109','小李飞刀',NULL,NULL,6,NULL,500,NULL),('j2','西门吹雪','456',0,9,NULL,183,NULL),('j3','黄老邪','678',1,12,NULL,634,NULL),('j999','楚留香','64353',0,12,'456',0,NULL);

/*Table structure for table `mrecord` */

DROP TABLE IF EXISTS `mrecord`;

CREATE TABLE `mrecord` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` varchar(50) DEFAULT NULL,
  `beginid` int(11) DEFAULT NULL,
  `bdate` varchar(50) DEFAULT NULL,
  `endid` int(11) DEFAULT NULL,
  `edate` varchar(50) DEFAULT NULL,
  `mprice` int(11) DEFAULT '0',
  `mstate` int(11) DEFAULT NULL,
  `mbackup` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8;

/*Data for the table `mrecord` */

insert  into `mrecord`(`mid`,`cid`,`beginid`,`bdate`,`endid`,`edate`,`mprice`,`mstate`,`mbackup`) values (29,'LA',1,'2024-05-23 14:45:04',7,'2024-05-23 15:39:48',300,0,''),(81,'LB',3,'2024-07-31 16:31:39',4,'2024-07-31 16:34:41',50,0,NULL),(82,'S001',1,'2024-02-20 16:42:25',6,'2024-02-20 16:43:17',366,0,NULL),(83,'S001',1,'2024-08-31 16:44:20',NULL,NULL,0,1,NULL),(84,'LC',4,'2024-07-31 17:04:22',8,'2024-07-31 15:25:09',317,0,NULL),(85,'LA',1,'2024-06-30 17:04:48',3,'2024-06-30 15:33:33',300,0,NULL),(86,'辽B3399',6,'2024-09-01 09:39:56',NULL,NULL,0,1,NULL),(87,'LA',1,'2024-09-06 08:43:10',NULL,NULL,0,1,NULL),(88,'LA',1,'2024-05-23 14:45:04',4,'2024-05-23 15:39:48',300,0,NULL),(89,'LB',3,'2024-06-15 16:31:39',2,'2024-06-15 16:34:41',50,0,NULL),(90,'S001',1,'2024-05-31 16:42:25',7,'2024-05-31 16:43:17',366,0,NULL),(91,'LC',4,'2024-05-31 17:04:22',8,'2024-05-31 15:25:09',317,0,NULL),(92,'LA',1,'2024-04-30 17:04:48',3,'2024-04-30 15:33:33',300,0,NULL),(95,'LA',1,'2024-09-23 14:45:04',2,'2024-09-23 15:39:48',300,0,NULL),(96,'LB',3,'2024-04-30 16:31:39',1,'2024-04-30 16:34:41',50,0,NULL),(97,'S001',1,'2024-08-31 16:42:25',2,'2024-08-31 16:43:17',366,0,NULL),(98,'LC',4,'2024-07-31 17:04:22',1,'2024-07-31 15:25:09',317,0,NULL),(99,'LA',1,'2024-03-31 17:04:48',7,'2024-03-31 15:33:33',300,0,NULL),(100,'LA',1,'2024-05-23 14:45:04',5,'2024-05-23 15:39:48',300,0,NULL),(101,'LB',3,'2024-10-31 16:31:39',4,'2024-10-31 16:34:41',50,0,NULL),(102,'S001',1,'2024-02-20 16:42:25',6,'2024-02-20 16:43:17',366,0,NULL),(103,'LC',4,'2024-08-31 17:04:22',8,'2024-08-31 15:25:09',317,0,NULL),(104,'LA',1,'2024-11-11 17:04:48',4,'2024-11-11 15:33:33',300,0,NULL),(110,'LA',1,'2024-09-23 14:45:04',5,'2024-09-23 15:39:48',300,0,NULL),(111,'LB',3,'2024-01-31 16:31:39',4,'2024-01-31 16:34:41',50,0,NULL),(112,'S001',1,'2024-10-31 16:42:25',6,'2024-10-31 16:43:17',366,0,NULL),(113,'LC',4,'2024-10-31 17:04:22',8,'2024-10-31 15:25:09',317,0,NULL),(114,'LA',1,'2024-08-31 17:04:48',7,'2024-08-31 15:33:33',300,0,NULL),(115,'LA',1,'2024-09-23 14:45:04',5,'2024-09-23 15:39:48',300,0,NULL),(116,'LB',3,'2024-11-30 16:31:39',1,'2024-11-30 16:34:41',50,0,NULL),(117,'S001',1,'2024-10-31 16:42:25',6,'2024-10-31 16:43:17',366,0,NULL),(118,'LC',4,'2024-11-11 17:04:22',8,'2024-11-11 15:25:09',317,0,NULL),(119,'LA',1,'2024-08-31 17:04:48',5,'2024-08-31 15:33:33',300,0,NULL),(120,'LA',1,'2024-05-23 14:45:04',4,'2024-05-23 15:39:48',300,0,NULL),(121,'LB',3,'2024-08-31 16:31:39',4,'2024-08-31 16:34:41',50,0,NULL),(122,'S001',1,'2024-10-31 16:42:25',6,'2024-10-31 16:43:17',366,0,NULL),(123,'LC',4,'2024-12-31 17:04:22',8,'2024-12-31 15:25:09',317,0,NULL),(124,'LA',1,'2024-08-31 17:04:48',5,'2024-08-31 15:33:33',300,0,NULL),(125,'LA',1,'2024-09-23 14:45:04',5,'2024-09-23 15:39:48',300,0,NULL),(126,'LB',3,'2024-11-30 16:31:39',4,'2024-11-30 16:34:41',50,0,NULL),(127,'S001',1,'2024-08-31 16:42:25',6,'2024-08-31 16:43:17',366,0,NULL),(128,'LC',4,'2024-05-31 17:04:22',8,'2024-05-31 15:25:09',317,0,NULL),(129,'LA',1,'2024-08-31 17:04:48',5,'2024-08-31 15:33:33',300,0,NULL);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `usid` varchar(50) NOT NULL,
  `uname` varchar(50) DEFAULT NULL,
  `upwd` varchar(50) DEFAULT NULL,
  `uface` varchar(500) DEFAULT NULL,
  `zid` int(11) DEFAULT NULL,
  `ubackup` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`usid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`usid`,`uname`,`upwd`,`uface`,`zid`,`ubackup`) values ('1','1','1','65da1c59-2de7-43e0-b950-07b3c1de2158.jpg',4,''),('12','5785','78585',NULL,1,''),('121','jojo','jojo','0eed8059-65db-4bb3-b108-5d98dd5c4c2a.JPG',2,''),('13','jojo','jojo','',1,''),('131','qq','qq','d707cd14-a162-4fac-8480-d32e4d7761ec.JPG',3,'');

/*Table structure for table `vrecord` */

DROP TABLE IF EXISTS `vrecord`;

CREATE TABLE `vrecord` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `cid` varchar(50) NOT NULL,
  `wid` varchar(50) NOT NULL,
  `vtime` varchar(50) DEFAULT NULL,
  `vaddr` varchar(100) DEFAULT NULL,
  `vstate` int(11) DEFAULT NULL,
  `vbackup` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `vrecord` */

insert  into `vrecord`(`vid`,`cid`,`wid`,`vtime`,`vaddr`,`vstate`,`vbackup`) values (1,'LA','101','2024-06-09',NULL,1,NULL),(2,'LA','102','2024-07-09',NULL,1,'3'),(3,'LB','102','2024-08-09',NULL,1,NULL),(4,'辽B3399','102','2024-09-09','12',1,'13'),(5,'LC','102','2024-09-09','',1,''),(6,'辽B3399','105','2024-09-09','',1,''),(7,'LC','103','2024-09-01 10:44:55',NULL,1,NULL),(8,'辽A8989','105','2024-09-01 14:17:22',NULL,0,NULL),(9,'LB','103','2024-09-01 15:26:16',NULL,0,NULL);

/*Table structure for table `wzitem` */

DROP TABLE IF EXISTS `wzitem`;

CREATE TABLE `wzitem` (
  `wid` varchar(50) NOT NULL,
  `wcontent` varchar(200) DEFAULT NULL,
  `wmoney` int(11) DEFAULT NULL,
  `wscore` int(11) DEFAULT NULL,
  `wbackup` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wzitem` */

insert  into `wzitem`(`wid`,`wcontent`,`wmoney`,`wscore`,`wbackup`) values ('101','闯红灯',200,3,''),('102','违停',100,0,''),('103','逆行',1000,3,NULL),('104','超速',300,3,NULL),('105','酒驾',5000,6,NULL);

/*Table structure for table `zhandian` */

DROP TABLE IF EXISTS `zhandian`;

CREATE TABLE `zhandian` (
  `zid` int(11) NOT NULL,
  `zname` varchar(50) DEFAULT NULL,
  `zprice` int(11) DEFAULT NULL,
  `zbackup` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`zid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zhandian` */

insert  into `zhandian`(`zid`,`zname`,`zprice`,`zbackup`) values (1,'哈尔滨',0,''),(2,'长春',120,'哈尔滨到长春的价格'),(3,'四平',75,'长春到四平的价格'),(4,'铁岭',50,'铁岭到四平的价额'),(5,'沈阳',55,''),(6,'鞍山',66,''),(7,'秦皇岛',86,''),(8,'北京',110,'');

/*Table structure for table `wzinfo` */

DROP TABLE IF EXISTS `wzinfo`;

/*!50001 DROP VIEW IF EXISTS `wzinfo` */;
/*!50001 DROP TABLE IF EXISTS `wzinfo` */;

/*!50001 CREATE TABLE  `wzinfo`(
 `jname` varchar(50) ,
 `cid` varchar(50) ,
 `cname` varchar(50) ,
 `jid` varchar(50) ,
 `cpic` varchar(100) ,
 `cbackup` varchar(200) ,
 `wid` varchar(50) ,
 `wcontent` varchar(200) ,
 `wmoney` int(11) ,
 `wscore` int(11) ,
 `wbackup` varchar(200) ,
 `vid` int(11) ,
 `vtime` varchar(50) ,
 `vaddr` varchar(100) ,
 `vstate` int(11) 
)*/;

/*View structure for view wzinfo */

/*!50001 DROP TABLE IF EXISTS `wzinfo` */;
/*!50001 DROP VIEW IF EXISTS `wzinfo` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `wzinfo` AS (select `j`.`jname` AS `jname`,`c`.`cid` AS `cid`,`c`.`cname` AS `cname`,`c`.`jid` AS `jid`,`c`.`cpic` AS `cpic`,`c`.`cbackup` AS `cbackup`,`w`.`wid` AS `wid`,`w`.`wcontent` AS `wcontent`,`w`.`wmoney` AS `wmoney`,`w`.`wscore` AS `wscore`,`w`.`wbackup` AS `wbackup`,`v`.`vid` AS `vid`,`v`.`vtime` AS `vtime`,`v`.`vaddr` AS `vaddr`,`v`.`vstate` AS `vstate` from (((`jiashiyuan` `j` join `cheliang` `c`) join `wzitem` `w`) join `vrecord` `v`) where ((`j`.`jid` = `c`.`jid`) and (`w`.`wid` = `v`.`wid`) and (`c`.`cid` = `v`.`cid`))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
