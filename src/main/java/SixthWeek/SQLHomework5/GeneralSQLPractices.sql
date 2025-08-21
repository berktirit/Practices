-- 1) 'K' ile başlayan filmlerden en uzun ve replacement_cost'u en düşük olan ilk 4'ü listele.
SELECT title, length, replacement_cost
FROM film
WHERE title LIKE 'K%'
ORDER BY length DESC, replacement_cost ASC
LIMIT 4;

-- 2) En fazla film içeren rating kategorisini bul.
SELECT rating, COUNT(*) AS film_sayisi
FROM film
GROUP BY rating
ORDER BY film_sayisi DESC
LIMIT 1;

-- 3) En çok alışveriş yapan (ödeme sayısı en yüksek) müşterinin adını getir.
SELECT c.first_name, c.last_name, COUNT(p.payment_id) AS odeme_sayisi
FROM customer c
JOIN payment p ON p.customer_id = c.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name
ORDER BY odeme_sayisi DESC
LIMIT 1;

-- 4) Kategori isimlerini ve kategori başına film sayılarını (çoktan aza) sırala.
SELECT cat.name AS category, COUNT(fc.film_id) AS film_sayisi
FROM category cat
JOIN film_category fc ON fc.category_id = cat.category_id
GROUP BY cat.category_id, cat.name
ORDER BY film_sayisi DESC, cat.name;

-- 5) Adında en az dört adet 'e'/'E' bulunan film sayısını hesapla.
SELECT COUNT(*) AS en_az_4_e_olan_film_sayisi
FROM film
WHERE (LENGTH(LOWER(title)) - LENGTH(REPLACE(LOWER(title), 'e', ''))) >= 4;