CREATE TABLE Cake (
	id serial primary key,
	type VARCHAR[30], 
	Price INT not null, 
	icing Varchar[30]
);

CREATE TABLE Donut (
	id serial primary key,
	type VARCHAR[30], 
	Price INT not null, 
	size Varchar[30]
);

CREATE TABLE "Order" (
	id serial primary key,
	customerId int, 
	date DATE
);

CREATE TABLE products (
	id serial primary key,
	cakeid int, 
	donutid int
);

CREATE TABLE orderProduct (
	orderID int references "Order"(id), 
	productID int references "products"(id), 
	Quantity int,
	PRIMARY KEY(orderID, productID)
);

CREATE TABLE customer (
	id serial primary key,
	firstname VARCHAR(30) NOT NULL,
	lastname VARCHAR(30) NOT NULL,
	phoneNum int unique
);


ALTER TABLE "Order" ADD CONSTRAINT fk_order FOREIGN KEY(id) REFERENCES customer(id);

ALTER TABLE "products" ADD CONSTRAINT fk_Cakeid FOREIGN KEY(cakeid) REFERENCES Cake(id);
ALTER TABLE "products" ADD CONSTRAINT fk_Donutid FOREIGN KEY(donutid) REFERENCES Donut(id);



