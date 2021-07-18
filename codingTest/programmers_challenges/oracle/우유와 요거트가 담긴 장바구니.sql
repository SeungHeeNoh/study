/*
 * ===문제 출처===
 * 우유와 요거트가 담긴 장바구니, <https://programmers.co.kr/learn/courses/30/lessons/62284>.
 * */
SELECT
       CART_ID
  FROM CART_PRODUCTS
 WHERE NAME = 'Milk'
INTERSECT
SELECT
       CART_ID
  FROM CART_PRODUCTS
 WHERE NAME = 'Yogurt';
 /*
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
*/