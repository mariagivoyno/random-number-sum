DROP TABLE IF EXISTS sample_number;

CREATE TABLE sample_number
(
    id    INT PRIMARY KEY,
    value INT

);

INSERT INTO sample_number (id, value)
VALUES (1, 100),
       (2, 200),
       (3, 300),
       (4, 400),
       (5, 500);
