DROP TABLE IF EXISTS invoice;

CREATE TABLE invoice (
    id INT AUTO_INCREMENT PRIMARY KEY,
    payed_value DOUBLE NOT NULL,
    payed_in DATE NOT NULL,
    card_id INT NOT NULL
);