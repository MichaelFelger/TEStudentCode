-- 20. The state abbreviation, and population of the largest city (name column 'city_population')
-- of all states, territories, and districts.
-- Order the results from highest to lowest populations.
-- (56 rows)
SELECT STATE_ABBREVIATION, MAX (POPULATION) AS CITY_POPULATION FROM CITY GROUP BY STATE_ABBREVIATION ORDER BY CITY_POPULATION DESC;
