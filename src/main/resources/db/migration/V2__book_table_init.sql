CREATE TABLE IF NOT EXISTS "book"
(
    "id"        BIGSERIAL PRIMARY KEY,
    "name"      VARCHAR(128) NOT NULL,
    "author_id" BIGINT,
    CONSTRAINT "author_id_fk" FOREIGN KEY ("author_id") REFERENCES "author" ("id")
);