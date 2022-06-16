-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

SELECT
	title
FROM
	movie AS m
	JOIN COLLECTION AS C ON C.collection_id = m.collection_id
	JOIN PERSON AS P ON P.person_id = m.director_id
WHERE
	COLLECTION_NAME = 'Star Wars Collection' AND
	PERSON_NAME <>'George Lucas';