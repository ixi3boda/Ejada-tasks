use TestSchema;

/* Add a new column to the Books table */
ALTER TABLE Books
ADD book_description VARCHAR(100);

/* Modify the data type of the price column */
ALTER TABLE Books
MODIFY price DECIMAL(12,2);

/* Rename the book_description column to bk_description */
ALTER TABLE Books
RENAME COLUMN book_description TO bk_description;

/* Drop the bk_description column from the Books table */
ALTER TABLE Books
DROP COLUMN bk_description;