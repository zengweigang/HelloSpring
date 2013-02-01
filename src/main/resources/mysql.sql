/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : jfinal_dev

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2013-01-28 18:10:45
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `blog`
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `content` mediumtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO blog VALUES ('1', 'JFinal Demo Title here12', 'JFinal Demo Content here12');
INSERT INTO blog VALUES ('2', 'test 1', 'test 1');
INSERT INTO blog VALUES ('3', 'test 2', 'test 2');
INSERT INTO blog VALUES ('4', 'test 3', 'test 3');
INSERT INTO blog VALUES ('5', 'test 4', 'test 4');

CREATE TABLE `t_article` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
