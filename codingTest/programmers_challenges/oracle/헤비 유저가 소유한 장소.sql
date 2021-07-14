/*
 * ===문제 출처===
 * 헤비 유저가 소유한 장소, <https://programmers.co.kr/learn/courses/30/lessons/77487>.
 * */
SELECT
       *
  FROM PLACES
 WHERE HOST_ID IN (SELECT
                          HOST_ID
                     FROM PLACES
                    GROUP BY HOST_ID
                    HAVING COUNT(HOST_ID) >= 2)
 ORDER BY ID;
/*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/