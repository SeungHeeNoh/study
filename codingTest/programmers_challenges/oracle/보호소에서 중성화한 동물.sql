/*
 * ===문제 출처===
 * 보호소에서 중성화한 동물, <https://programmers.co.kr/learn/courses/30/lessons/59045>.
 * */
SELECT
       I.ANIMAL_ID
     , I.ANIMAL_TYPE
     , I.NAME
  FROM ANIMAL_INS I, ANIMAL_OUTS O
 WHERE I.ANIMAL_ID = O.ANIMAL_ID
   AND I.SEX_UPON_INTAKE LIKE 'Intact%'
   AND (O.SEX_UPON_OUTCOME LIKE 'Spayed%'
    OR O.SEX_UPON_OUTCOME LIKE 'Neutered%')
 ORDER BY 1;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/