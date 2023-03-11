SELECT CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY) ASC, CITY ASC
LIMIT 1;

SELECT CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY) DESC, CITY ASC
LIMIT 1;


/* ORDER BY LENGTH(CITY) ASC, CITY ASC ordena os resultados 
primeiro pelo comprimento do nome da cidade em ordem crescente,
e depois pelo nome da cidade em ordem alfabética.*/

/* ORDER BY LENGTH(CITY) DESC, CITY ASC ordena os resultados
primeiro pelo comprimento do nome da cidade em ordem decrescente,
e depois pelo nome da cidade em ordem alfabética.*/
