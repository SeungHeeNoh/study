/*
 * ===문제 출처===
 * 이름에 el이 들어가는 동물 찾기, <https://programmers.co.kr/learn/courses/30/lessons/59047>.
 * */
SELECT
       ANIMAL_ID
     , NAME
  FROM ANIMAL_INS
 WHERE LOWER(NAME) LIKE '%el%'
   AND ANIMAL_TYPE = 'Dog'
 ORDER BY NAME;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/