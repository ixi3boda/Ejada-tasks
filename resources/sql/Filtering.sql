use TestSchema;

SELECT *
FROM books
WHERE price > 5000;

SELECT *
FROM Books
WHERE author LIKE 'M%';

SELECT *
FROM Books
WHERE title IN ('Comedy', 'Drama');

SELECT *
FROM Books
WHERE price BETWEEN 5000 AND 10000;

SELECT *
FROM Books
WHERE author IS NULL;