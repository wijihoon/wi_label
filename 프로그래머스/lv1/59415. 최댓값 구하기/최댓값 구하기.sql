-- 코드를 입력하세요
SELECT DATETIME
  FROM (
        SELECT *
          FROM ANIMAL_INS
         ORDER
            BY DATETIME DESC
       )
 WHERE ROWNUM = 1
 
;