/*
 * ===문제 출처===
 * 있었는데요 없었습니다, <https://programmers.co.kr/learn/courses/30/lessons/59043>.
 * */
SELECT
       I.ANIMAL_ID
     , I.NAME
  FROM ANIMAL_INS I
  LEFT JOIN ANIMAL_OUTS O ON (I.ANIMAL_ID = O.ANIMAL_ID)
 WHERE I.DATETIME > O.DATETIME
 ORDER BY I.DATETIME;
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/