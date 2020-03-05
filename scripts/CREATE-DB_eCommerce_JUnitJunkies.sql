DROP SCHEMA IF EXISTS eCommerce_JUnitJunkies;
CREATE SCHEMA eCommerce_JUnitJunkies;

USE eCommerce_JUnitJunkies;

DROP TABLE IF EXISTS Customers;
CREATE TABLE Customers
	(
			CustomerID		INTEGER			NOT NULL	PRIMARY KEY		AUTO_INCREMENT
        ,	Name			VARCHAR(25) 	NOT NULL
        ,	AddressLine1	VARCHAR(30) 	NOT NULL
        ,	AddressLine2	VARCHAR(30)		NULL
        ,	City			VARCHAR(30)		NOT NULL
        ,	State			VARCHAR(30)		NOT NULL
        ,	ZipCode			VARCHAR(10)		NOT NULL
        ,	Email			VARCHAR(320)	NOT NULL -- Standard length for emails in DBs
        ,	Phone			VARCHAR(15)		NOT NULL
        ,	BillingInfo		VARCHAR(20)		NOT NULL -- Credit card number
    );