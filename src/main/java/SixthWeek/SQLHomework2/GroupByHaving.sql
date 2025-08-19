-- 1) film: rating'e göre grupla (adet)
SELECT rating, COUNT(*) AS film_count
FROM film
GROUP BY rating
ORDER BY rating;
-- 2) film: replacement_cost'a göre grupla; sayısı > 50 olanları getir
SELECT replacement_cost, COUNT(*) AS film_count
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY film_count DESC, replacement_cost;
-- 3) customer: store_id'ye göre müşteri sayıları
SELECT store_id, COUNT(*) AS customer_count
FROM customer
GROUP BY store_id
ORDER BY store_id;
-- 4) city: en fazla şehir barındıran country_id ve şehir sayısı
SELECT country_id, COUNT(*) AS city_count
FROM city
GROUP BY country_id
ORDER BY city_count DESC
LIMIT 1;

/* Ülke adını da görmek isterseniz: */
-- SELECT c.country_id, co.country, COUNT(*) AS city_count
-- FROM city c JOIN country co ON c.country_id = co.country_id
-- GROUP BY c.country_id, co.country
-- ORDER BY city_count DESC
-- LIMIT 1;