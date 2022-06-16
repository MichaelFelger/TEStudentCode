-- INNER JOIN

SELECT * FROM park_state;

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database
SELECT city_name, state_abbreviation FROM city WHERE city_name = 'Columbus';

-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).
SELECT
	city_name, state_name, c.population AS c_pop, s.area AS st_area
	
FROM 
	city AS c
	JOIN state AS s ON c.state_abbreviation = s.state_abbreviation --evaluates boolean and if true, will chop out the others
WHERE
	city_name = 'Columbus';


-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)
SELECT
	park_name, state_abbreviation
FROM
	park AS p
	JOIN park_state AS ps ON p.park_id = ps.park_id
ORDER BY
	area DESC;

-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.
SELECT
	park_name, state_name
FROM
	park AS p
	JOIN park_state AS ps ON p.park_id = ps.park_id
	JOIN state AS s ON ps.state_abbreviation = s.state_abbreviation
ORDER BY
	sales_tax DESC, s.state_abbreviation;
	
SELECT
	*
FROM
	state AS s
	JOIN park_state AS ps ON s.state_abbreviation = ps.state_abbreviation
	JOIN park AS p ON ps.park_id = p.park_id;

-- Modify the previous query to include the name of the state's capital city.
SELECT
	park_name, state_name, city_name AS state_capital
FROM
	park AS p
	JOIN park_state AS ps ON p.park_id=ps.park_id
	JOIN state AS s ON ps.state_abbreviation = s.state_abbreviation
	JOIN city AS c ON s.capital = c.city_id
ORDER BY
	park_name;

-- Modify the previous query to include the area of each park.
SELECT
	park_name, state_name, city_name AS state_capital, p.area AS park_area
FROM
	park AS p
	JOIN park_state AS ps ON p.park_id=ps.park_id
	JOIN state AS s ON ps.state_abbreviation = s.state_abbreviation
	JOIN city AS c ON s.capital = c.city_id
ORDER BY
	park_area DESC;

-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.
SELECT
	city_name, c.population AS city_population
FROM
	state AS s
	JOIN city AS c ON s.state_abbreviation = c.state_abbreviation
WHERE
	census_region = 'Midwest'
ORDER BY
	city_population DESC;

-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.
SELECT
	state_name, COUNT(city_name) AS num_cities
FROM
	state AS s
	JOIN city AS c ON s.state_abbreviation = c.state_abbreviation
WHERE
	census_region = 'Midwest'
GROUP BY
	state_name
ORDER BY
	state_name;
-- All cities and regions
SELECT
	census_region, state_name, COUNT(city_name) AS num_cities
FROM
	state AS s
	JOIN city AS c ON s.state_abbreviation = c.state_abbreviation
GROUP BY
	census_region, state_name
ORDER BY
	census_region, state_name;


-- Modify the previous query to sort the results by the number of cities in descending order.



-- LEFT JOIN aka LEFT OUTER JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory) 
-- for every record in the state table that has park records associated with it.
SELECT
	state_name, MIN (date_established) AS oldest_park
FROM
	state AS s
	JOIN park_state AS ps ON s.state_abbreviation = ps.state_abbreviation
	JOIN park AS p ON ps.park_id = p.park_id
 
GROUP BY state_name;

-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.
SELECT
	state_name, MIN (date_established) AS oldest_park
FROM
	state AS s
	LEFT OUTER JOIN park_state AS ps ON s.state_abbreviation = ps.state_abbreviation
	LEFT OUTER JOIN park AS p on p.park_id = ps.park_id
GROUP BY
	state_name
ORDER BY
	oldest_park;

-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. (Washington is the name of a city and a state--how many times does it appear in the results?)
SELECT city_name AS place_name FROM city WHERE city_name LIKE 'W%'
UNION  --collapses duplicates **if you want both, use UNION ALL - here, with UNION ALL, Washington would appear twice
SELECT state_name AS place_name FROM state WHERE state_name LIKE 'W%'
ORDER BY place_name;

-- Modify the previous query to include a column that indicates whether the place is a city or state.
SELECT city_name AS place_name, 'City' AS place_type FROM city WHERE city_name LIKE 'W%'
UNION  --the use of the literal here makes each row unique, and therefore all the data comes through
SELECT state_name AS place_name, 'State' AS place_type FROM state WHERE state_name LIKE 'W%'
ORDER BY place_name;


-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in pgAdmin and confirm it is working correctly by writing queries to retrieve...



-- The names of all the movie genres
SELECT genre_name FROM genre;

-- The titles of all the Comedy movies
SELECT
	title
FROM
	movie AS m
	JOIN movie_genre AS mg ON m.movie_id = mg.movie_id
	JOIN genre AS g ON g.genre_id = mg.genre_id
WHERE genre_name = 'Comedy'
ORDER BY title;

