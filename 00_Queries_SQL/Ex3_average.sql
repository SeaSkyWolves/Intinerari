SELECT Origin, colYear, colMonth, AVG(ArrDelay) as avg_arrival 
FROM flights 
GROUP BY colYear, colMonth, Origin;