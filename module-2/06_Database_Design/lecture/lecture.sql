DROP TABLE IF EXISTS customer, sale;

CREATE TABLE customer(
	customer_id serial PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	phone_number VARCHAR(10) NOT NULL,
	CONSTRAINT UQ_customer_phone_number UNIQUE(phone_number)
	
);

CREATE TABLE sale(
	sale_id serial,
	customer_id int NOT NULL --FOREIGN KEY(customer_id) REFERENCES customer(customer_id) <<--can also make this a FK here
);

ALTER TABLE sale ADD CONSTRAINT FK_sale_customer_id
	FOREIGN KEY(customer_id) REFERENCES customer(customer_id);