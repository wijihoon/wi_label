-- MySQL
SELECT ANIMAL_ID
     , NAME
  FROM ANIMAL_INS
 WHERE (
        NAME LIKE '%EL%'
     OR NAME LIKE '%el%'
     OR NAME LIKE '%eL%'
     OR NAME LIKE '%El%'
        )
   AND ANIMAL_TYPE = 'Dog'
 ORDER
    BY NAME