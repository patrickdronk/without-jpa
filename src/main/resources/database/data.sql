CREATE TABLE "user"
(
    id        pg_catalog.uuid PRIMARY KEY,
    firstName varchar(255),
    lastName  varchar(255),
    birthDate DATE
);

INSERT INTO "user"
    (id, firstName, lastName, birthDate)
VALUES ('1ae4d8c3-bc42-4089-afde-c4f85799bea5', 'Billy', 'Blaze', '1990-12-14')