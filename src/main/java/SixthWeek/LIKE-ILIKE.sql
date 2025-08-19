-- 1) country: 'A' ile başlayıp 'a' ile biten ülkeler
SELECT country
FROM country
WHERE country LIKE 'A%a'
ORDER BY country;
-- 2) country: uzunluğu ≥ 6 ve 'n' ile biten ülkeler
SELECT country
FROM country
WHERE LENGTH(country) >= 6
  AND country LIKE '%n'
ORDER BY country;
-- 3) film: içinde en az 4 adet (büyük/küçük fark etmez) 'T' geçen başlıklar
SELECT title
FROM film
WHERE (LENGTH(LOWER(title)) - LENGTH(REPLACE(LOWER(title), 't', ''))) >= 4
ORDER BY title;
-- 4) film: title 'C%' ve length > 90 ve rental_rate = 2.99
SELECT *
FROM film
WHERE title LIKE 'C%'
  AND "length" > 90
  AND rental_rate = 2.99
ORDER BY title;