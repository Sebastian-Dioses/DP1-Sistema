-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema dp1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dp1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dp1` DEFAULT CHARACTER SET utf8 ;
USE `dp1` ;

-- -----------------------------------------------------
-- Table `dp1`.`ciudades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dp1`.`ciudades` (
  `cod_ciudad` VARCHAR(4) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  `abreviado` VARCHAR(45) NOT NULL,
  `capacidad_almacen` INT(11) NOT NULL,
  PRIMARY KEY (`cod_ciudad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dp1`.`hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dp1`.`hibernate_sequence` (
  `next_val` BIGINT(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dp1`.`personas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dp1`.`personas` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `dni` CHAR(8) NOT NULL,
  `correo` VARCHAR(45) NULL DEFAULT NULL,
  `tipo_persona` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dp1`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dp1`.`pedidos` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `ciudad_origen` VARCHAR(4) NOT NULL,
  `ciudad_destino` VARCHAR(4) NOT NULL,
  `fecha_registro` DATETIME NULL DEFAULT NULL,
  `personas_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `personas_id`),
  INDEX `fk_pedido_persona1_idx` (`personas_id` ASC),
  INDEX `fk_pedido_ciudad1_idx` (`ciudad_origen` ASC),
  INDEX `fk_pedido_ciudad2_idx` (`ciudad_destino` ASC),
  CONSTRAINT `fk_pedido_ciudad1`
    FOREIGN KEY (`ciudad_origen`)
    REFERENCES `dp1`.`ciudades` (`cod_ciudad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_ciudad2`
    FOREIGN KEY (`ciudad_destino`)
    REFERENCES `dp1`.`ciudades` (`cod_ciudad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_persona1`
    FOREIGN KEY (`personas_id`)
    REFERENCES `dp1`.`personas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dp1`.`vuelos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dp1`.`vuelos` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `ciudad_origen` VARCHAR(4) NOT NULL,
  `ciudad_destino` VARCHAR(4) NOT NULL,
  `hora_salida` TIME NOT NULL,
  `hora_llegada` TIME NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_vuelos_ciudad1_idx` (`ciudad_destino` ASC),
  INDEX `fk_vuelos_ciudad2_idx` (`ciudad_origen` ASC),
  CONSTRAINT `fk_vuelos_ciudad1`
    FOREIGN KEY (`ciudad_destino`)
    REFERENCES `dp1`.`ciudades` (`cod_ciudad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vuelos_ciudad2`
    FOREIGN KEY (`ciudad_origen`)
    REFERENCES `dp1`.`ciudades` (`cod_ciudad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1001
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dp1`.`pedidos_x_vuelos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dp1`.`pedidos_x_vuelos` (
  `pedidos_id` INT(11) NOT NULL,
  `pedidos_personas_id` INT(11) NOT NULL,
  `vuelos_id` INT(11) NOT NULL,
  `fecha_salida` DATE NULL DEFAULT NULL,
  `fecha_llegada` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`pedidos_id`, `pedidos_personas_id`, `vuelos_id`),
  INDEX `fk_pedido_has_plan_de_vuelo_plan_de_vuelo1_idx` (`vuelos_id` ASC),
  INDEX `fk_pedido_has_plan_de_vuelo_pedido1_idx` (`pedidos_id` ASC, `pedidos_personas_id` ASC),
  CONSTRAINT `fk_pedido_has_plan_de_vuelo_pedido1`
    FOREIGN KEY (`pedidos_id` , `pedidos_personas_id`)
    REFERENCES `dp1`.`pedidos` (`id` , `personas_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_has_plan_de_vuelo_plan_de_vuelo1`
    FOREIGN KEY (`vuelos_id`)
    REFERENCES `dp1`.`vuelos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `dp1`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dp1`.`usuarios` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  `personas_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `personas_id`),
  INDEX `fk_usuario_persona_idx` (`personas_id` ASC),
  CONSTRAINT `fk_usuario_persona`
    FOREIGN KEY (`personas_id`)
    REFERENCES `dp1`.`personas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
