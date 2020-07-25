SELECT Origin, AVG(ArrDelay) as avgArrivalDelay, AVG(DepDelay) AS avg_DepartureDelay 
FROM usairlineflights2.flights 
GROUP BY Origin;
