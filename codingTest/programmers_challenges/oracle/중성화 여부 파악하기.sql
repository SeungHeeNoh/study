/*
 * ===문제 출처===
 * 중성화 여부 파악하기, <https://programmers.co.kr/learn/courses/30/lessons/59409>.
 * */
SELECT
       ANIMAL_ID
     , NAME
     , CASE 
            WHEN SEX_UPON_INTAKE LIKE 'Neutered%' OR SEX_UPON_INTAKE LIKE 'Spayed%' THEN 'O'
            ELSE 'X'
        END
  FROM ANIMAL_INS
 ORDER BY ANIMAL_ID;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/