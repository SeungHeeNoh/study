/*
 * ===문제 출처===
 * 이름이 없는 동물의 아이디, <https://programmers.co.kr/learn/courses/30/lessons/59039>.
 * */
SELECT
        ANIMAL_ID "ANIMAL_ID"
  FROM ANIMAL_INS
 WHERE NAME IS NULL
 ORDER BY 1;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/