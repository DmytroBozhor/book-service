CREATE TABLE IF NOT EXISTS "author"
(
    "id"         BIGSERIAL PRIMARY KEY,
    "first_name" VARCHAR(128) NOT NULL,
    "last_name"  VARCHAR(128) NOT NULL
);