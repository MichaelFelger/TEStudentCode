-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT
	genre_name
FROM
	genre AS g
	JOIN movie_genre AS mg ON g.genre_id = mg.genre_id
	JOIN movie AS m ON mg.movie_id = m.movie_id
WHERE
	title = 'The Wizard of Oz';

