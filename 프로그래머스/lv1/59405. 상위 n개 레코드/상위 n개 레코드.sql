-- 코드를 입력하세요
SELECT NAME
  FROM (
        SELECT *
          FROM ANIMAL_INS 
         ORDER
            BY DATETIME ASC
       )
 WHERE ROWNUM = 1