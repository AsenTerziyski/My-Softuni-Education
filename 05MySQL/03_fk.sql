CREATE TABLE `gamebar`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `category_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `category_id_idx` (`category_id` ASC) VISIBLE,
  CONSTRAINT `category_id`
    FOREIGN KEY (`category_id`)
    REFERENCES `gamebar`.`category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);