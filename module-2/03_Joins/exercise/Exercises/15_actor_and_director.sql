-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)

SELECT
	title, person_name
FROM
	movie AS m
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p on ma.actor_id = p.person_id
WHERE
	director_id = person_id AND actor_id = person_id;