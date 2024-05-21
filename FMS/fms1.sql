create database new_fms_db;

use new_fms_db;

CREATE  TABLE `new_fms_db`.`air_credit_card_details` (

  `profile_id` VARCHAR(10) NOT NULL ,

  `card_number` BIGINT NULL ,

  `card_type` VARCHAR(45) NULL ,

  `expiration_month` INT NULL ,

  `expiration_year` INT NULL );


CREATE  TABLE `new_fms_db`.`air_passenger_profile` (

  `profile_id` VARCHAR(10) NOT NULL ,

  `password` VARCHAR(45) NULL ,

  `first_name` VARCHAR(45) NULL ,

  `last_name` VARCHAR(45) NULL ,

  `address` VARCHAR(45) NULL ,

  `mobile_number` BIGINT NULL ,

  `email_id` VARCHAR(45) NULL );

CREATE  TABLE `new_fms_db`.`air_ticket_info` (

  `ticket_id` VARCHAR(45) NOT NULL ,

  `profile_id` VARCHAR(10) NULL ,

  `flight_id` VARCHAR(45) NULL ,

  `flight_departure_date` DATE NULL ,

  `status` VARCHAR(45) NULL );


CREATE  TABLE `new_fms_db`.`air_flight_details` (

  `flight_id` VARCHAR(45) NOT NULL ,

  `flight_departure_date` DATE NULL ,

  `price` DECIMAL(10,2) NULL ,

  `available_seats` INT NULL );


CREATE  TABLE `new_fms_db`.`air_flight` (

  `flight_id` VARCHAR(45) NOT NULL ,

  `airline_id` VARCHAR(45) NULL ,

  `airline_name` VARCHAR(45) NULL ,

  `from_location` VARCHAR(45) NULL ,

  `to_location` VARCHAR(45) NULL ,

  `departure_time` TIME NULL ,

  `arrival_time` TIME NULL ,

  `duration` TIME NULL ,

  `total_seats` INT NULL );






