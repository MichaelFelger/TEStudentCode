-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
SELECT
	DISTINCT (person_name)
FROM
	movie AS m
	JOIN COLLECTION AS C ON C.collection_id = m.collection_id
	JOIN PERSON AS P ON P.person_id = m.director_id
WHERE
	COLLECTION_NAME = 'Harry Potter Collection';
