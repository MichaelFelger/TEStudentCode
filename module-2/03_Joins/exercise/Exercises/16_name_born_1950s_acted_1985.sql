-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT 
	DISTINCT (person_name), birthday
FROM
	person AS p
	JOIN movie_actor AS ma ON p.person_id = ma.actor_id
	JOIN movie AS m ON ma.movie_id = m.movie_id
WHERE
	birthday > '12-31-1949' AND birthday < '01-01-1960' AND
	release_date >= '01-01-1985' AND release_date <= '12-31-1985'

