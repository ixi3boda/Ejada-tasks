USE TestSchema;

/* Gets all books with a price greater than 5000 */
SELECT book_id, title, author, price
FROM Books
WHERE price > 5000
LIMIT 100;

/* Gets all books with an author that starts with 'M' */
SELECT book_id, title, author, price
FROM Books
WHERE author LIKE 'M%';

/* Gets all books with a title of Comedy or Drama */
SELECT book_id, title, author, price
FROM Books
WHERE title IN ('Comedy', 'Drama');

/* Gets all books with a price between 5000 and 10000 */
SELECT book_id, title, author, price
FROM Books
WHERE price BETWEEN 5000 AND 10000;

/* Gets all books with a null author */
SELECT book_id, title, author, price
FROM Books
WHERE author IS NULL;
