CREATE TABLE mountainike
(
    id       SERIAL PRIMARY KEY,
    brand    VARCHAR(30) NOT NULL,
    model    VARCHAR(30) NOT NULL,
    size     FLOAT       NOT NULL,
    weight   FLOAT       NOT NULL,
    material VARCHAR(30) NOT NULL
);


INSERT INTO mountainbike(brand, model, size, weight, material) VALUES
('Santa Crus', 'V 10', 19, 15.5, 'Carbon');

SELECT * FROM mountainbike

DELETE FROM MountainBike where id=6

UPDATE mountainbike SET brand='test', model='V 10', size=19, weight=15.5, material='Carbon' where id=2;


