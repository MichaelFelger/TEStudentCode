-- 15. The name and date established of the newest national park.
-- (1 row)

SELECT PARK_NAME,
	date_established
FROM PARK
ORDER BY DATE_ESTABLISHED DESC,
	PARK_NAME
LIMIT 1;