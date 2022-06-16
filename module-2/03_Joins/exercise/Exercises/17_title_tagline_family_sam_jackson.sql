-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)
SELECT
	title, tagline
FROM
	person AS p
	JOIN movie_actor AS ma ON p.person_id = ma.actor_id
	JOIN movie AS m ON ma.movie_id = m.movie_id
	JOIN movie_genre AS mg ON m.movie_id = mg.movie_id
	JOIN genre AS g ON mg.genre_id = g.genre_id
WHERE
	genre_name = 'Family'
	AND person_name = 'Samuel L. Jackson';