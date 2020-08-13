DROP TABLE IF EXISTS payment;

CREATE TABLE payment (
     id INT AUTO_INCREMENT PRIMARY KEY,
     description VARCHAR(100) NOT NULL,
     value DOUBLE NOT NULL,
     card_id INT NOT NULL
);

INSERT INTO payment (description, value, card_id) VALUES
('Compra de Cerveja', 300.56, 1),
('Compra de Café', 73.89, 2);