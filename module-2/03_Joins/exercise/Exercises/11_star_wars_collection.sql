-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)
SELECT
	title
FROM
	movie AS m
	JOIN COLLECTION AS C ON C.collection_id = m.collection_id
WHERE
	COLLECTION_NAME = 'Star Wars Collection'
ORDER BY
	release_date desc;