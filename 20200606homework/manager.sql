/*
Navicat MySQL Data Transfer

Source Server         : connData
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : data86

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-06-06 22:16:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` int(11) NOT NULL,
  `hotelId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hotelId` (`hotelId`),
  CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`hotelId`) REFERENCES `hotel` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1103 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1003', '4567', '102');
INSERT INTO `manager` VALUES ('1102', '1234', '101');
