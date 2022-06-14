-- 21. The census region, and the average, minimum, and maximum population of states and districts in each census region. 
-- Exclude ones that don't have a census region.
-- Name the population columns 'average_population, 'min_population', and 'max_population'.
-- Order the results from lowest to highest average population.
-- (4 rows)

SELECT CENSUS_REGION, AVG(POPULATION) AS AVERAGE_POPULATION, MIN (POPULATION) AS MIN_POPULATION, MAX (POPULATION) AS MAX_POPULATION

FROM STATE

WHERE CENSUS_REGION IS NOT NULL

GROUP BY CENSUS_REGION

ORDER BY AVERAGE_POPULATION;
