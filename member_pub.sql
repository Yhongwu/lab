/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.53 : Database - sys02
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `m_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '成员id',
  `position` int(10) DEFAULT '1' COMMENT '职位1教室2博士后3博士生4研究生',
  `name` varchar(128) DEFAULT NULL COMMENT '姓名',
  `img_url` varchar(200) DEFAULT NULL COMMENT '图片地址',
  `info` text COMMENT '更多详细信息',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `fax` varchar(100) DEFAULT NULL COMMENT '传真',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Table structure for table `publication` */

DROP TABLE IF EXISTS `publication`;

CREATE TABLE `publication` (
  `p_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '发布id',
  `p_year` varchar(100) DEFAULT NULL COMMENT '发布年份',
  `p_time` varchar(128) DEFAULT NULL COMMENT '发布时间',
  `u_time` varchar(128) DEFAULT NULL COMMENT '更新时间',
  `p_content` varchar(2000) DEFAULT NULL COMMENT '发布内容',
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
