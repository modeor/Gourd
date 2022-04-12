/*
Navicat MySQL Data Transfer

Source Server         : mysql8
Source Server Version : 80021
Source Host           : localhost:3306
Source Database       : gourd-base

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2022-04-12 16:46:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户表ID',
  `user_no` int DEFAULT NULL COMMENT '用户编号',
  `user_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `user_sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `user_age` int DEFAULT '0' COMMENT '年龄',
  `user_phone` varchar(13) DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '8888', 'admin', '8888', '男', '0', '1234567890123');
