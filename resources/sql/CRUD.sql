USE TestSchema;

/* inserts raw data into the Books table */
INSERT INTO Books
(title, author, price)
VALUES
('Horror', 'Ahmed', 6000),
('Comedy', 'Mohamed', 7000),
('Drama', 'Omar', 8000);

START TRANSACTION;

/* updates the price of a book with book_id = 1 */
UPDATE Books
SET price = 9000
WHERE book_id = 1;

/* deletes a book with book_id = 2 */
DELETE FROM Books
WHERE book_id = 2;

COMMIT;
-- ROLLBACK; -- uncomment to undo instead
