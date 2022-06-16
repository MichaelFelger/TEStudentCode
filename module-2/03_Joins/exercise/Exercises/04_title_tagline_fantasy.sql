-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)

SELECT
	title, tagline
FROM
	movie AS m
	JOIN movie_genre AS mg ON m.movie_id = mg.movie_id
	JOIN genre AS g ON mg.genre_id = g.genre_id
WHERE
	genre_name = 'Fantasy'
ORDER BY
	title;