use TestSchema;

INSERT INTO Books
(title, author, price)
VALUES
('Horror', 'Ahmed', 6000),
('Comedy', 'Mohamed', 7000),
('Drama', 'Omar', 8000);

UPDATE Books
SET price = 9000
WHERE book_id = 1;

DELETE FROM Books
WHERE book_id = 1;