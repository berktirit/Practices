-- 1) title 'n' ile biten EN UZUN 5 film
SELECT *
FROM film
WHERE title ILIKE '%n'
ORDER BY "length" DESC, title
LIMIT 5;
-- 2) title 'n' ile biten EN KISA filmlerden 6–10. kayıtlar
SELECT *
FROM film
WHERE title ILIKE '%n'
ORDER BY "length" ASC, title
LIMIT 5 OFFSET 5;   -- 6–10
-- 3) customer: store_id = 1, last_name azalan; ilk 4 kayıt
SELECT *
FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;