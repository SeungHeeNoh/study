/*
 * ===문제 출처===
 * 없어진 기록 찾기, <https://programmers.co.kr/learn/courses/30/lessons/59042>.
 * */
SELECT
       O.ANIMAL_ID
     , O.NAME
  FROM ANIMAL_INS I
 RIGHT JOIN ANIMAL_OUTS O ON(I.ANIMAL_ID = O.ANIMAL_ID)
 WHERE  I.DATETIME IS NULL
 ORDER BY 1, 2;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/