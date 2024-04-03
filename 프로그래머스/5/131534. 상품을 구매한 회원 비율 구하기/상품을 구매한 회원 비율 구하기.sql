SELECT  YEAR(os.sales_date) as YEAR,
        MONTH(os.sales_date) as MONTH,
        count(distinct(os.user_id)) as PUCHASED_USERS,
        ROUND(count(distinct(os.user_id)) / 
              (
                select count(*) 
                from USER_INFO 
                where JOINED >= '2021-01-01' 
                      AND JOINED < '2022-01-01'
              )
        , 1) as PUCHASED_RATIO
FROM    USER_INFO ui
LEFT JOIN ONLINE_SALE os
ON      os.USER_ID = ui.USER_ID
WHERE   os.PRODUCT_ID IS NOT NULL
        AND ui.JOINED >= '2021-01-01' 
        AND ui.JOINED < '2022-01-01'
GROUP BY YEAR(os.sales_date), MONTH(os.sales_date)
ORDER BY YEAR(os.sales_date), MONTH(os.sales_date);