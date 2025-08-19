-- 1) film.rental_rate ortalaması
SELECT AVG(rental_rate) AS avg_rental_rate
FROM film;
-- 2) 'C' ile başlayan film sayısı (büyük/küçük harf duyarsız)
SELECT COUNT(*) AS cnt
FROM film
WHERE title ILIKE 'C%';
-- 3) rental_rate = 0.99 olan filmler içinde EN UZUN süre (dakika)
SELECT MAX("length") AS max_length_minutes
FROM film
WHERE rental_rate = 0.99;
-- 4) length > 150 olan filmlerde kaç farklı replacement_cost var?
SELECT COUNT(DISTINCT replacement_cost) AS distinct_replacement_costs
FROM film
WHERE "length" > 150;