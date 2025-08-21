-- 1) Tüm veriler: actor + customer first_name (tekrarlar dahil, alfabetik).
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
ORDER BY first_name;

-- 2) Kesişen veriler: her iki tabloda da bulunan first_name'ler (tekilleştirilmiş).
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
ORDER BY first_name;

-- 3) Sadece actor’da olup customer’da olmayan first_name’ler.
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer
ORDER BY first_name;

-- 4) Kesişen veriler (tekrarlar dahil) ve sadece actor’da olup customer’da olmayanlar (tekrarlar dahil).
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer
ORDER BY first_name;

SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer
ORDER BY first_name;