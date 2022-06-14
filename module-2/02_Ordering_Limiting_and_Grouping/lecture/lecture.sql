-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population FROM state ORDER BY population ASC; 

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region FROM state ORDER BY census_region DESC NULLS LAST, state_name;

-- The biggest park by area
SELECT park_name, area FROM park ORDER BY area DESC;

-- Notes here on aliasing and when you have to repeat the math - alias becomes available in the middle of the evaluation
-- can't alias within the WHERE
SELECT state_name, population, population / area AS density FROM state WHERE population / area >= 100 ORDER BY density DESC; 



-- LIMITING RESULTS

-- The 10 largest cities by populations  --pagination uses OFFSET
-- Important to always us ORDER BY to get reliable data
SELECT city_name, population FROM city ORDER BY population DESC OFFSET 10 LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT PARK_NAME,
	DATE_ESTABLISHED,
	(CURRENT_DATE - DATE_ESTABLISHED) / 365 AS PARK_AGE_YEARS
FROM PARK
ORDER BY PARK_AGE_YEARS DESC,
	PARK_NAME
LIMIT 20;
-- SELECT CURRENT_DATE - '2022-5-16';



-- CONCATENATING OUTPUTS --                ***Dave almost wishes they didn't teach this***
--  USE SPARINGLY, you don't usually want to derive your data here, but rather later in user land

-- All city names and their state abbreviation.
SELECT CITY_NAME || ', ' || STATE_ABBREVIATION AS CITY_AND_STATE
FROM CITY;

-- The all parks by name and date established.
SELECT 'Name: ' || PARK_NAME || ' Date Established: ' || DATE_ESTABLISHED
FROM PARK;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT * FROM state WHERE census_region IN ('West', 'Midwest');
-- Start here and construct the WHERE statement first and then build it out

SELECT 'Census region: ' || census_region || ' State: ' || state_name AS cr_and_state
FROM state
WHERE census_region IN ('West', 'Midwest')
ORDER BY population;

-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG (population) AS avg_pop FROM state;
SELECT ROUND (AVG (population)) avg_pop_rounded FROM state;

-- Total population in the West and South census regions
SELECT SUM (population) AS total_pop, ROUND (AVG (population)) AS avg_pop FROM state WHERE census_region IN ('West','South');

-- The number of cities with populations greater than 1 million
SELECT COUNT (city_name) AS count_cities_over_million_pop FROM city WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT (state_nickname) FROM state;  --NULLS do not count
SELECT COUNT (*) FROM state WHERE state_nickname IS NULL;

-- The area of the smallest and largest parks.
SELECT area FROM park;
SELECT MIN (area) AS smallest_park, MAX (area) AS largest_park FROM park;



-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT
	COUNT (city_name) AS num_of_cities,
	state_abbreviation
FROM
	city
-- WHERE
-- 	population > 1000000
GROUP BY
	state_abbreviation
ORDER BY
	num_of_cities DESC, state_abbreviation;


-- Determine the average park area depending upon whether parks allow camping or not.
SELECT * FROM park;
SELECT has_camping, AVG (area) AS average_area FROM park GROUP BY has_camping;
SELECT has_camping, AVG (area) AS average_area, COUNT(*) AS num_parks FROM park GROUP BY has_camping;


-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM (population) AS city_pop FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation; 

-- The smallest city population in each state ordered by city population.
SELECT state_abbreviation, MIN (population) AS smallest_city FROM city GROUP BY state_abbreviation ORDER BY smallest_city, state_abbreviation;

--count of states by census region excluding nulls- so what do I group by? census_region
SELECT
	census_region, COUNT(*) AS num_states
FROM
	state
WHERE
	census_region IS NOT NULL 	
GROUP BY -- getting buckets for each census_region
	census_region
HAVING -- SELECT still hasn't happened here, so you need to write out the math bc alias isn't avialable
	COUNT(*) >= 13
ORDER BY
	num_states DESC;
	
-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)



-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
 

-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.
SELECT * FROM state;
SELECT * FROM city WHERE city_id = 198;

--first SELECT all cities with capital (key)
SELECT capital FROM state;

--then insert it as a subquery in your WHERE
SELECT
	*
FROM
	city
WHERE
	city_id IN (SELECT capital FROM state); --to be exclusive of subquery list, you can use NOT IN



