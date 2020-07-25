
SELECT UniqueCarrier, colYear, colMonth, SUM(Cancelled) AS total_cancelled
FROM flights 
GROUP BY UniqueCarrier, colYear, colMonth
ORDER BY total_cancelled DESC;