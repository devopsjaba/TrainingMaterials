-- 외래 키 제약조건 삭제
ALTER TABLE city DROP FOREIGN KEY fk_city_country;
ALTER TABLE address DROP FOREIGN KEY fk_address_city;
ALTER TABLE store DROP FOREIGN KEY fk_store_address;
ALTER TABLE staff DROP FOREIGN KEY fk_staff_address;
ALTER TABLE staff DROP FOREIGN KEY fk_staff_store;
ALTER TABLE customer DROP FOREIGN KEY fk_customer_store;
ALTER TABLE customer DROP FOREIGN KEY fk_customer_address;
ALTER TABLE film DROP FOREIGN KEY fk_film_language;
ALTER TABLE film DROP FOREIGN KEY fk_film_original_language;
ALTER TABLE film_actor DROP FOREIGN KEY fk_film_actor_actor;
ALTER TABLE film_actor DROP FOREIGN KEY fk_film_actor_film;
ALTER TABLE film_category DROP FOREIGN KEY fk_film_category_film;
ALTER TABLE film_category DROP FOREIGN KEY fk_film_category_category;
ALTER TABLE inventory DROP FOREIGN KEY fk_inventory_film;
ALTER TABLE inventory DROP FOREIGN KEY fk_inventory_store;
ALTER TABLE rental DROP FOREIGN KEY fk_rental_inventory;
ALTER TABLE rental DROP FOREIGN KEY fk_rental_customer;
ALTER TABLE rental DROP FOREIGN KEY fk_rental_staff;
ALTER TABLE payment DROP FOREIGN KEY fk_payment_customer;
ALTER TABLE payment DROP FOREIGN KEY fk_payment_staff;
ALTER TABLE payment DROP FOREIGN KEY fk_payment_rental;

-- 테이블 삭제
DROP TABLE IF EXISTS payment, rental, inventory, film_actor, film_category, customer, staff, store, film, actor, category, language, address, city, country;

-- 테이블 생성
CREATE TABLE country (
  country_id SMALLINT UNSIGNED AUTO_INCREMENT,
  country VARCHAR(50),
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (country_id)
);
CREATE TABLE city (
  city_id SMALLINT UNSIGNED AUTO_INCREMENT,
  city VARCHAR(50),
  country_id SMALLINT UNSIGNED,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (city_id)
);
CREATE TABLE address (
  address_id SMALLINT UNSIGNED AUTO_INCREMENT,
  address VARCHAR(50),
  district VARCHAR(20),
  city_id SMALLINT UNSIGNED,
  postal_code VARCHAR(10),
  phone VARCHAR(20),
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (address_id)
);
CREATE TABLE store (
  store_id TINYINT UNSIGNED AUTO_INCREMENT,
  manager_staff_id TINYINT UNSIGNED,
  address_id SMALLINT UNSIGNED,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (store_id),
  UNIQUE (manager_staff_id)
);
CREATE TABLE staff (
  staff_id TINYINT UNSIGNED AUTO_INCREMENT,
  first_name VARCHAR(45),
  last_name VARCHAR(45),
  address_id SMALLINT UNSIGNED,
  email VARCHAR(50),
  store_id TINYINT UNSIGNED,
  active BOOLEAN,
  username VARCHAR(16),
  password VARCHAR(40),
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (staff_id)
);
CREATE TABLE customer (
  customer_id SMALLINT UNSIGNED AUTO_INCREMENT,
  store_id TINYINT UNSIGNED,
  first_name VARCHAR(45),
  last_name VARCHAR(45),
  email VARCHAR(50),
  address_id SMALLINT UNSIGNED,
  active BOOLEAN,
  create_date DATETIME,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (customer_id)
);
CREATE TABLE language (
  language_id TINYINT UNSIGNED AUTO_INCREMENT,
  name CHAR(20),
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (language_id)
);
CREATE TABLE actor (
  actor_id SMALLINT UNSIGNED AUTO_INCREMENT,
  first_name VARCHAR(45),
  last_name VARCHAR(45),
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (actor_id)
);
CREATE TABLE category (
  category_id TINYINT UNSIGNED AUTO_INCREMENT,
  name VARCHAR(25),
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (category_id)
);
CREATE TABLE film (
  film_id SMALLINT UNSIGNED AUTO_INCREMENT,
  title VARCHAR(255),
  description TEXT,
  release_year YEAR(4),
  language_id TINYINT UNSIGNED,
  original_language_id TINYINT UNSIGNED,
  rental_duration TINYINT UNSIGNED DEFAULT 3,
  rental_rate DECIMAL(4,2) DEFAULT 4.99,
  length SMALLINT UNSIGNED,
  replacement_cost DECIMAL(5,2) DEFAULT 19.99,
  rating ENUM('G','PG','PG-13','R','NC-17') DEFAULT 'G',
  special_features SET('Trailers','Commentaries','Deleted Scenes','Behind the Scenes'),
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (film_id)
);
CREATE TABLE film_actor (
  actor_id SMALLINT UNSIGNED,
  film_id SMALLINT UNSIGNED,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (actor_id, film_id)
);
CREATE TABLE film_category (
  film_id SMALLINT UNSIGNED,
  category_id TINYINT UNSIGNED,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (film_id, category_id)
);
CREATE TABLE inventory (
  inventory_id MEDIUMINT UNSIGNED AUTO_INCREMENT,
  film_id SMALLINT UNSIGNED,
  store_id TINYINT UNSIGNED,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (inventory_id)
);
CREATE TABLE rental (
  rental_id INT UNSIGNED AUTO_INCREMENT,
  rental_date DATETIME,
  inventory_id MEDIUMINT UNSIGNED,
  customer_id SMALLINT UNSIGNED,
  return_date DATETIME,
  staff_id TINYINT UNSIGNED,
  last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (rental_id)
);
CREATE TABLE payment (
  payment_id SMALLINT UNSIGNED AUTO_INCREMENT,
  customer_id SMALLINT UNSIGNED,
  staff_id TINYINT UNSIGNED,
  rental_id INT UNSIGNED,
  amount DECIMAL(5,2),
  payment_date TIMESTAMP,
  PRIMARY KEY (payment_id)
);

-- 외래 키 제약조건 추가
ALTER TABLE city ADD CONSTRAINT fk_city_country FOREIGN KEY (country_id) REFERENCES country(country_id);
ALTER TABLE address ADD CONSTRAINT fk_address_city FOREIGN KEY (city_id) REFERENCES city(city_id);
ALTER TABLE store ADD CONSTRAINT fk_store_address FOREIGN KEY (address_id) REFERENCES address(address_id);
ALTER TABLE staff ADD CONSTRAINT fk_staff_address FOREIGN KEY (address_id) REFERENCES address(address_id);
ALTER TABLE staff ADD CONSTRAINT fk_staff_store FOREIGN KEY (store_id) REFERENCES store(store_id);
ALTER TABLE customer ADD CONSTRAINT fk_customer_store FOREIGN KEY (store_id) REFERENCES store(store_id);
ALTER TABLE customer ADD CONSTRAINT fk_customer_address FOREIGN KEY (address_id) REFERENCES address(address_id);
ALTER TABLE film ADD CONSTRAINT fk_film_language FOREIGN KEY (language_id) REFERENCES language(language_id);
ALTER TABLE film ADD CONSTRAINT fk_film_original_language FOREIGN KEY (original_language_id) REFERENCES language(language_id);
ALTER TABLE film_actor ADD CONSTRAINT fk_film_actor_actor FOREIGN KEY (actor_id) REFERENCES actor(actor_id);
ALTER TABLE film_actor ADD CONSTRAINT fk_film_actor_film FOREIGN KEY (film_id) REFERENCES film(film_id);
ALTER TABLE film_category ADD CONSTRAINT fk_film_category_film FOREIGN KEY (film_id) REFERENCES film(film_id);
ALTER TABLE film_category ADD CONSTRAINT fk_film_category_category FOREIGN KEY (category_id) REFERENCES category(category_id);
ALTER TABLE inventory ADD CONSTRAINT fk_inventory_film FOREIGN KEY (film_id) REFERENCES film(film_id);
ALTER TABLE inventory ADD CONSTRAINT fk_inventory_store FOREIGN KEY (store_id) REFERENCES store(store_id);
ALTER TABLE rental ADD CONSTRAINT fk_rental_inventory FOREIGN KEY (inventory_id) REFERENCES inventory(inventory_id);
ALTER TABLE rental ADD CONSTRAINT fk_rental_customer FOREIGN KEY (customer_id) REFERENCES customer(customer_id);
ALTER TABLE rental ADD CONSTRAINT fk_rental_staff FOREIGN KEY (staff_id) REFERENCES staff(staff_id);
ALTER TABLE payment ADD CONSTRAINT fk_payment_customer FOREIGN KEY (customer_id) REFERENCES customer(customer_id);
ALTER TABLE payment ADD CONSTRAINT fk_payment_staff FOREIGN KEY (staff_id) REFERENCES staff(staff_id);
ALTER TABLE payment ADD CONSTRAINT fk_payment_rental FOREIGN KEY (rental_id) REFERENCES rental(rental_id);

-- 데이터 삽입 (예시)
INSERT INTO country (country) VALUES ('South Korea'), ('United States'), ('Canada');
INSERT INTO city (city, country_id) VALUES ('Seoul', 1), ('New York', 2), ('Toronto', 3);
-- 나머지 테이블도 비슷하게 데이터를 삽입.
