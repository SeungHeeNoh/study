/*
 * ===문제 출처===
 * 이름이 있는 동물의 아이디, <https://programmers.co.kr/learn/courses/30/lessons/59407>.
 * */
SELECT
        ANIMAL_ID
  FROM ANIMAL_INS
 WHERE NAME IS NOT NULL
 ORDER BY 1;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/