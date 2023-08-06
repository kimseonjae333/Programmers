-- 코드를 입력하세요
SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS TOTAL_PRICE FROM USED_GOODS_USER AS U
JOIN USED_GOODS_BOARD AS B ON U.USER_ID = B.WRITER_ID
WHERE B.STATUS = 'DONE'
GROUP BY B.WRITER_ID HAVING TOTAL_PRICE >= 700000
ORDER BY TOTAL_PRICE;