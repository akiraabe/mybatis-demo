DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS order_details;

CREATE TABLE products (
    id INT AUTO_INCREMENT
    ,name VARCHAR(255) NOT NULL
    ,unitPrice INT
    ,PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;

CREATE TABLE customers (
    id INT AUTO_INCREMENT
    ,name VARCHAR(255) NOT NULL
    ,address VARCHAR(255) NOT NULL
    ,phone   VARCHAR(30)
    ,PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;

CREATE TABLE orders (
    id INT AUTO_INCREMENT
    ,order_date DATE NOT NULL
    ,customers_id INT
    ,PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;

CREATE TABLE order_details (
    id INT AUTO_INCREMENT
    ,orders_id INT
    ,products_id INT
    ,amount INT
    ,PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;