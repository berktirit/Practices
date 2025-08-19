-- 1) film: title ve description'ı sırala
SELECT title, description
FROM film
ORDER BY title;
-- 2) film: tüm sütunlar; 60 < length < 75
SELECT *
FROM film
WHERE "length" > 60 AND "length" < 75
ORDER BY "length", title;
-- 3) film: rental_rate = 0.99 VE (replacement_cost = 12.99 VEYA 28.99)
SELECT *
FROM film
WHERE rental_rate = 0.99
  AND replacement_cost IN (12.99, 28.99)
ORDER BY replacement_cost, title;
-- 4) customer: first_name = 'Mary' olan(ların) last_name değeri
SELECT DISTINCT last_name
FROM customer
WHERE first_name = 'Mary';
-- 5) film: length > 50 OLMAYAN ve rental_rate 2.99/4.99 OLMAYANlar
SELECT *
FROM film
WHERE "length" <= 50
  AND rental_rate NOT IN (2.99, 4.99)
ORDER BY title;