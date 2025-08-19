-- 1) film.replacement_cost sütunundaki birbirinden farklı değerleri sırala
SELECT DISTINCT replacement_cost
FROM film
ORDER BY replacement_cost;
-- 2) film.replacement_cost sütununda kaç farklı değer var?
SELECT COUNT(DISTINCT replacement_cost) AS distinct_replacement_cost_count
FROM film;
-- 3) Title'ı T ile başlayan ve rating'i 'G' olan film sayısı
SELECT COUNT(*) AS cnt
FROM film
WHERE title ILIKE 'T%' AND rating = 'G';
-- 4) country ismi 5 karakter olan ülke sayısı
SELECT COUNT(*) AS cnt
FROM country
WHERE LENGTH(country) = 5;
-- 5) city ismi 'R' veya 'r' ile biten şehir sayısı
SELECT COUNT(*) AS cnt
FROM city
WHERE city ILIKE '%r';