/*
Navicat MySQL Data Transfer
Source Server         : test
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : test
Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001
Date: 2015-10-13 09:54:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `age` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Bob', '34');
INSERT INTO `user` VALUES ('2', 'Arsnal', '20');
INSERT INTO `user` VALUES ('3', 'Real Madrid', '50');