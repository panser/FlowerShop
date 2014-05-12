CREATE DATABASE IF NOT EXISTS `flowershop`
  DEFAULT CHARACTER SET utf8;
USE `flowershop`;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `flowers`;
DROP TABLE IF EXISTS `flowerbanks`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE IF NOT EXISTS `flowers` (
  `ID`        INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name`     VARCHAR(50) DEFAULT NULL,
#   `flowerBank`  INT(11)    NOT NULL,
  `price`     INT(11) DEFAULT NULL
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

CREATE TABLE IF NOT EXISTS `flowerbanks` (
  `ID`        INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
#   `flower`  INT(11),
  `count`     INT(11) DEFAULT NULL
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;


ALTER TABLE `flowerbanks` ADD CONSTRAINT `fk_flowerbank_flower` FOREIGN KEY (`id`) REFERENCES `flowers` (`id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
