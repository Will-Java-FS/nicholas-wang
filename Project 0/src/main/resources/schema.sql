DROP TABLE IF EXISTS users_items;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS users;

CREATE TABLE items (
    item_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    quantity INT DEFAULT 0
);

CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    type VARCHAR(100) DEFAULT 'user' NOT NULL
);

CREATE TABLE users_items (
    "user_id" INT REFERENCES users(user_id) NOT NULL,
    "item_id" INT REFERENCES items(item_id) NOT NULL,
    UNIQUE ("user_id", "item_id")

);

CREATE TABLE IF NOT EXISTS actors (
    a_id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    age smallint CHECK (age>=0),
    worth INT
);