/*
 * ===문제 출처===
 * 오랜 기간 보호한 동물(1), <https://programmers.co.kr/learn/courses/30/lessons/59044>.
 * */
SELECT
       *
  FROM (SELECT
               NAME
             , DATETIME
          FROM ANIMAL_INS
         WHERE ANIMAL_ID NOT IN (SELECT I.ANIMAL_ID 
                                   FROM ANIMAL_INS I, ANIMAL_OUTS O
                                  WHERE I.ANIMAL_ID = O.ANIMAL_ID)
         ORDER BY DATETIME)
 WHERE ROWNUM <= 3;
/*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/