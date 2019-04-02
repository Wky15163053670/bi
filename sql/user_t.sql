/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : web

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 02/04/2019 20:45:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_t
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t`  (
  `id` int(10) NOT NULL,
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `mobile` varchar(12) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `age` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_t
-- ----------------------------
INSERT INTO `user_t` VALUES (1001, '王开宇', '1234', 15);
INSERT INTO `user_t` VALUES (1002, '张三', '2552', 22);
INSERT INTO `user_t` VALUES (1003, '李四', '5852', 36);
INSERT INTO `user_t` VALUES (1004, '王五', '2263', 43);
INSERT INTO `user_t` VALUES (1005, '张伟', '5253', 22);
INSERT INTO `user_t` VALUES (1006, '张青', '4745', 15);
INSERT INTO `user_t` VALUES (1007, '李德华', '4453', 44);
INSERT INTO `user_t` VALUES (1008, '李极大', '8554', 25);
INSERT INTO `user_t` VALUES (1009, '王大声', '1553', 25);
INSERT INTO `user_t` VALUES (1010, '白一', '1525', 12);
INSERT INTO `user_t` VALUES (1011, '白二', '2552', 14);
INSERT INTO `user_t` VALUES (1012, '白三', '2585', 36);
INSERT INTO `user_t` VALUES (1013, '白四', '1155', 23);
INSERT INTO `user_t` VALUES (1014, '白五', '5775', 56);
INSERT INTO `user_t` VALUES (1015, '大白', '2526', 36);
INSERT INTO `user_t` VALUES (1016, '穆华天', '2852', 25);
INSERT INTO `user_t` VALUES (1017, '安抚', '2876', 19);
INSERT INTO `user_t` VALUES (1018, '玛顿', '2878', 15);
INSERT INTO `user_t` VALUES (1019, '苏珊', '4687', 25);
INSERT INTO `user_t` VALUES (1020, '牛顿', '2541', 78);
INSERT INTO `user_t` VALUES (1021, '拉米提', '8541', 12);
INSERT INTO `user_t` VALUES (1022, '阿达', '1434', 78);
INSERT INTO `user_t` VALUES (1023, '杨过', '4665', 65);
INSERT INTO `user_t` VALUES (1024, '苏乞儿', '2457', 57);
INSERT INTO `user_t` VALUES (1025, '亚里士多德', '0265', 85);
INSERT INTO `user_t` VALUES (1026, '奥德吉', '3635', 67);
INSERT INTO `user_t` VALUES (1027, '本拉登', '3935', 45);
INSERT INTO `user_t` VALUES (1028, '夏娃', '3855', 25);
INSERT INTO `user_t` VALUES (1029, '夏娃1', '3855', 25);

SET FOREIGN_KEY_CHECKS = 1;
