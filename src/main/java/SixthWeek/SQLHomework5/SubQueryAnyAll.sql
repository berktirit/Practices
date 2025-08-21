-- Ortalama film uzunluğundan daha uzun filmlerin sayısı
SELECT COUNT(*) AS uzun_filmler
FROM film
WHERE length > (SELECT AVG(length) FROM film);
-- En yüksek rental_rate değerine sahip film sayısı
SELECT COUNT(*) AS max_rental_filmler
FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);
-- En düşük rental_rate ve replacement_cost değerine sahip filmler
SELECT *
FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
  AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);
-- En fazla alışveriş yapan müşteriler
SELECT customer_id, COUNT(*) AS toplam_odeme
FROM payment
GROUP BY customer_id
ORDER BY toplam_odeme DESC;