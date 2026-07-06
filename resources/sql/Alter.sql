use TestSchema;

ALTER TABLE Books
ADD book_description VARCHAR(100);

ALTER TABLE Books
MODIFY price DECIMAL(12,2);

ALTER TABLE Books
RENAME COLUMN book_description TO bk_description;

ALTER TABLE Books
DROP COLUMN bk_description;