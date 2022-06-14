-- 18. The count of the number of cities (name column 'num_cities') 
-- and the state abbreviation for each state and territory (exclude state abbreviation DC).
-- Order the results by state abbreviation.
-- (55 rows)

SELECT COUNT(*) AS NUM_CITIES, STATE_ABBREVIATION FROM CITY WHERE STATE_ABBREVIATION <> 'DC' GROUP BY STATE_ABBREVIATION ORDER BY STATE_ABBREVIATION;