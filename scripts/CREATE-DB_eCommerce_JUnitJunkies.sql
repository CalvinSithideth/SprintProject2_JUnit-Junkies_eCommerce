DROP SCHEMA IF EXISTS eCommerce_JUnitJunkies;
CREATE SCHEMA eCommerce_JUnitJunkies;


USE eCommerce_JUnitJunkies;
CREATE USER IF NOT EXISTS 'default'@'localhost' IDENTIFIED BY 'COVA';
GRANT ALL PRIVILEGES ON * . * TO 'default'@'localhost';

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
    
DROP TABLE IF EXISTS Suppliers;
CREATE TABLE Suppliers
	(
			SupplierID		INTEGER			NOT NULL	PRIMARY KEY		AUTO_INCREMENT
		,	SupplierName	VARCHAR(30)		NOT NULL	
		,	ContactFName	VARCHAR(25)		NOT NULL	
        ,	ContactLName	VARCHAR(25)		NOT NULL
        ,	ContactTitle	VARCHAR(25)		NOT NULL
        ,	AddressLine1	VARCHAR(30)		NOT NULL
        ,	AddressLine2	VARCHAR(30)		NULL
        ,	City			VARCHAR(30)		NOT NULL
        ,	State			VARCHAR(30)		NOT NULL
        ,	ZipCode			VARCHAR(10)		NOT NULL
        ,	Phone			VARCHAR(15)		NOT NULL
        ,	Email			VARCHAR(320)	NOT NULL -- Standard length for emails in DBs
	);
    
DROP TABLE IF EXISTS Shippers;
CREATE TABLE Shippers
	(
			ShipperID		INTEGER			NOT NULL	PRIMARY KEY		AUTO_INCREMENT
 		,	ShipperName 	VARCHAR(30)		NOT NULL
		,	ContactFName	VARCHAR(25)		NOT NULL	
        ,	ContactLName	VARCHAR(25)		NOT NULL
        ,	ContactTitle	VARCHAR(25)		NOT NULL
        ,	Phone			VARCHAR(15)		NOT NULL
        ,	Email			VARCHAR(320)	NOT NULL -- Standard length for emails in DBs
	);
    
        DROP TABLE IF EXISTS Orders;
CREATE TABLE Orders
	(
			OrderNumber			INTEGER			NOT NULL	PRIMARY KEY		AUTO_INCREMENT
        ,	CustomerID			INTEGER			NOT NULL	-- foreign key
        ,	ShipperID			INTEGER			NOT NULL	-- foreign key
        ,	OrderDate			DATE			NOT NULL
        ,	PaymentInfo			VARCHAR(30)		NOT NULL
        ,	ShipDate			DATE			NOT NULL
        ,	OrderStatus			BOOLEAN			NOT NULL
		,	FOREIGN KEY 		(CustomerID)	REFERENCES 	Customers(CustomerID)
        ,	FOREIGN KEY 		(ShipperID)		REFERENCES	Shippers(ShipperID)
    );

DROP TABLE IF EXISTS Categories;
CREATE TABLE Categories
	(
			CategoryID		INTEGER			NOT NULL	PRIMARY KEY 	AUTO_INCREMENT
		,	CategoryName	VARCHAR(35)		NOT NULL
        ,	CatDescription	VARCHAR(300)	NOT NULL
        ,	ParentID		VARCHAR(300)	NOT NULL
	);
    
DROP TABLE IF EXISTS Products;
CREATE TABLE Products
	(
			SKU					INTEGER			NOT NULL	PRIMARY KEY		AUTO_INCREMENT
        ,	CategoryID			INTEGER			NOT NULL	-- foreign key
        ,	SupplierID			INTEGER			NOT NULL	-- foreign key
        ,	ProdName			VARCHAR(30)		NOT NULL
        ,	ProdDescription		VARCHAR(30)		NOT NULL
        ,	UnitPrice			DECIMAL			NOT NULL
        ,	UnitWeight			INTEGER			NOT NULL
        ,	UnitsInStock		INTEGER			NOT NULL  
        ,	UnitsOnOrder		INTEGER			NOT NULL
        ,	ReOrderLevel		INTEGER			NOT NULL  
        ,	FOREIGN KEY 		(CategoryID)	REFERENCES 	Categories(CategoryID)
        ,	FOREIGN KEY 		(SupplierID)	REFERENCES	Suppliers(SupplierID)
    );
 /*   
DROP TABLE IF EXISTS OrderDetails;
CREATE TABLE OrderDetails
	(
			OrderNumber			INTEGER			NOT NULL	PRIMARY KEY		AUTO_INCREMENT
        ,	CustomerID			INTEGER			NOT NULL	-- foreign key
        ,	ShipperID			INTEGER			NOT NULL	-- foreign key
        ,	OrderDate			DATE			NOT NULL
        ,	PaymentInfo			VARCHAR(30)		NOT NULL
        ,	ShipDate			DATE			NOT NULL
        ,	Shipper				VARCHAR(30)		NOT NULL 
        ,	OrderStatus			VARCHAR(30)		NOT NULL
		,	FOREIGN KEY 		(CustomerID)	REFERENCES 	Customers(CustomerID)
        ,	FOREIGN KEY 		(ShipperID)		REFERENCES	Shippers(ShipperID)
    );
   */
DROP TABLE IF EXISTS OrderDetails;
CREATE TABLE OrderDetails
	(
			OrderNumber		INTEGER			NOT NULL		-- FOREIGN KEY
        ,	SKU				INTEGER			NOT NULL		-- FOREIGN KEY
        ,	Quantity		INTEGER			NOT NULL
        ,	SalePrice		DECIMAL			NOT NULL
        ,	Discount		DECIMAL			NOT NULL
        ,	FOREIGN KEY 		(OrderNumber)	REFERENCES 	Orders(OrderNumber)
        ,	FOREIGN KEY 		(SKU)	REFERENCES	Products(SKU)
        ,	PRIMARY KEY (OrderNumber, SKU)
	);


/*******************************************************************
	INSERT DUMMY DATA
*******************************************************************/

INSERT INTO Customers
		(Name, AddressLine1, AddressLine2, City, State, ZipCode, Email, Phone, BillingInfo)
VALUES	('Chad Smith', '1123 Wilson Way', NULL, 'Issaquah', 'Washington', '98027', 'Chad@TravelWithChad.com', '253-555-1234', 'ABCD12345')
	,	('Brad Lawson', '1234 Brad Ave', NULL, 'Tacoma', 'Washington', '98404', 'Brad@TravelWithBrad.com', '253-555-4321', 'ABCD54321')
    ,	('Dad Heny', '4321 Heny St', NULL, 'Factoria', 'Washington', '98888', 'Heny@Korea.kr', '206-333-3456', 'AASF96584')
    ,	('Sad Heny', '7293 Denny Blvd', '1N', 'Bellevue', 'Washington', '98006', 'Jenny@Korea.kr', '234-456-6789', 'OUER92874')
    ,	('Bad Heny', '5555 Benny Creek', NULL, 'Compton', 'California', '45673', 'Wenny@Cali.com', '838-837-8939', '!@#D03830')
    ;

INSERT INTO Categories
		(CategoryName, CatDescription, ParentID)
VALUES	('Pets', 'Basically slaves', 0)
	, 	('Cats', 'Furry, feline compantions', 1)
	,	('Dogs', 'The Mutts', 1)
    ;

INSERT INTO Suppliers
		(SupplierName, ContactFName, ContactLName, ContactTitle, AddressLine1, AddressLine2, City, State, ZipCode, Phone, Email)
VALUES ('Costco', 'Cost', 'Co', '12345 COstcoHeadqarters', 'Yeayea building', 'Warehouse', 'Here', 'State', '12345', '123-456-7890', 'Costco.com.Costco')
	;
INSERT INTO Products
		(CategoryID, SupplierID, ProdName , ProdDescription, UnitPrice, UnitWeight, UnitsInStock,	UnitsOnOrder, ReOrderLevel)
VALUES	(2,1,'MeowCats','Omg, they cute', 50, 44.00, 5,3,1)
	,	(3,1,'RuffDoggies', 'omg, they bark', 100, 33.00, 3,2,1)
	;
INSERT INTO Shippers
		(ShipperName, ContactFName, ContactLName, ContactTitle, Phone, Email)
VALUES	('Amazon', 'Ama', 'Zon', 'Amazing', '233-232-2323', 'TakemyMoney@Amazon.az')
	;

INSERT INTO Orders
		(CustomerID, ShipperID, OrderDate, PaymentInfo, ShipDate, OrderStatus)
VALUES 	(2,1,'2019-03-04','I\'m not sure what this is','2019-05-06',TRUE)
	,	(3,1,'2020-03-04', 'PAyment stuff', '2020-03-09', FALSE)
    ;

INSERT INTO OrderDetails
		(OrderNumber, SKU, Quantity, SalePrice, Discount)
VALUES	(1,1,1,33.33,0.1)
	,	(1,2,1,33.22,0.1) -- hehe
    ;
    
-- DELETE FROM OrderDetails WHERE OrderNumber = 2;
-- DELETE FROM Orders WHERE OrderNumber = 2;