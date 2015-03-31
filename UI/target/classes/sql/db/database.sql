create database ams;

create table user (
	id int(10) NOT NULL AUTO_INCREMENT,
	LastName varchar(255),
	FirstName varchar(255),
	Address varchar(255),
	City varchar(255),
	PRIMARY KEY (id)
	) ENGINE=InnoDB;
