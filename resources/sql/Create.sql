USE TestSchema;

/* create table Books */
CREATE TABLE Books(
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    author VARCHAR(50) NOT NULL,
    price DECIMAL(10,2)
);
