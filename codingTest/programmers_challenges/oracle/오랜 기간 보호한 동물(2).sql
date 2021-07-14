/*
 * ===문제 출처===
 * 오랜 기간 보호한 동물(2), <https://programmers.co.kr/learn/courses/30/lessons/59411>.
 * */
SELECT
       ANIMAL_ID
     , NAME
  FROM (SELECT
               I.ANIMAL_ID ANIMAL_ID
             , I.NAME NAME
             , O.DATETIME - I.DATETIME
          FROM ANIMAL_OUTS O, ANIMAL_INS I
         WHERE O.ANIMAL_ID = I.ANIMAL_ID
         ORDER BY 3 DESC)
 WHERE ROWNUM <= 2;
/*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/