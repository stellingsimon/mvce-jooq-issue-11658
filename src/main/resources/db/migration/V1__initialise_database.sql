DROP SCHEMA IF EXISTS "MCVE" CASCADE;
CREATE SCHEMA "MCVE";
CREATE TABLE "MCVE"."TEST"
(
    "ID"    INT PRIMARY KEY,
    "VALUE" char(2)[] check (array_to_string("VALUE", ',', '*') != 'A ' )
);