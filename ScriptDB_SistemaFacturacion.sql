CREATE DATABASE FACTURATION_SYSTEM;
USE FACTURATION_SYSTEM;

CREATE TABLE customers (
id int not null auto_increment,
name varchar(60) not null,
last_name varchar(60) not null,
phone varchar(20),
PRIMARY KEY (id));

CREATE TABLE invoice(
id int not null auto_increment,
date varchar(20) not null,
total float not null default 0,
id_customer int not null,
PRIMARY KEY (id),
FOREIGN KEY (id_customer) REFERENCES customers(id));

CREATE TABLE products(
id int not null auto_increment,
name varchar(100) not null,
price float not null,
quantity int not null default 1,
PRIMARY KEY (id));

CREATE TABLE invoice_products(
id int not null auto_increment,
id_invoice int not null,
id_products int not null,
PRIMARY KEY (id),
FOREIGN KEY (id_invoice) REFERENCES invoice (id),
FOREIGN KEY (id_products) REFERENCES products(id));

SELECT * FROM customers;
