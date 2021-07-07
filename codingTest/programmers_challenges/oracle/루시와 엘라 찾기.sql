/*
 * ===문제 출처===
 * 루시와 엘라 찾기, <https://programmers.co.kr/learn/courses/30/lessons/59046>.
 * */
SELECT
       ANIMAL_ID
     , NAME
     , SEX_UPON_INTAKE
  FROM ANIMAL_INS
  WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
  ORDER BY 1;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/