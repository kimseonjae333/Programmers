-- 코드를 입력하세요
SELECT M.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE, '%Y-%m-%d') AS REVEIW_DATE 
FROM MEMBER_PROFILE AS M
JOIN REST_REVIEW AS R ON M.MEMBER_ID = R.MEMBER_ID
WHERE R.MEMBER_ID = (
        SELECT MEMBER_ID 
        FROM (
            SELECT MEMBER_ID, COUNT(*) AS REVIEW_COUNT
            FROM REST_REVIEW 
            GROUP BY MEMBER_ID 
            ORDER BY REVIEW_COUNT DESC 
            LIMIT 1
        ) AS T
    )
ORDER BY REVIEW_DATE, R.REVIEW_TEXT;