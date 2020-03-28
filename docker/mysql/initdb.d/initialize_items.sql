CREATE TABLE items (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    price INT NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO items (name,price) VALUES ('apple',150);
INSERT INTO items (name,price) VALUES ('orange',300);
INSERT INTO items (name,price) VALUES ('banana',250);