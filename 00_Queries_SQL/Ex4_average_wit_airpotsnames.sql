
SELECT usairports.Airport, flights.colYear, flights.colMonth, AVG(ArrDelay) as avg_arrival 
FROM flights 
INNER JOIN usairports
ON flights.Origin=usairports.IATA
GROUP BY colYear, colMonth, Origin;