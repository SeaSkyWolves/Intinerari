SELECT TailNum, SUM(Distance) as totalDistance 
FROM usairlineflights2.flights
WHERE TailNum IS NOT NULL 
AND TailNum <> ''
GROUP BY TailNum
ORDER BY totalDistance DESC
LIMIT 10;