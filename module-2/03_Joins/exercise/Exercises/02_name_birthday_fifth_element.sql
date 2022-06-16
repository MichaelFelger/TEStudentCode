-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT
	person_name, birthday
FROM
	person AS p
	JOIN movie_actor AS ma ON p.person_id = ma.actor_id
	JOIN movie AS m ON m.movie_id = ma.movie_id
WHERE
	title = 'The Fifth Element';

