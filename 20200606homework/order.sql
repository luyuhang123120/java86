/*
Navicat MySQL Data Transfer

Source Server         : connData
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : data86

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-06-06 22:15:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL,
  `user` varchar(255) NOT NULL,
  `orderDate` datetime NOT NULL,
  `vip` varchar(255) DEFAULT NULL COMMENT '是否会员',
  `roomtype` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL COMMENT '订房数量',
  `cost` int(11) DEFAULT NULL COMMENT '花费',
  PRIMARY KEY (`user`),
  KEY `roomtype` (`roomtype`),
  KEY `vip` (`vip`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`vip`) REFERENCES `vip` (`name`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`roomtype`) REFERENCES `room` (`roomType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '张三', '2020-06-06 19:44:59', '张三', '双床房', '2', '900');
