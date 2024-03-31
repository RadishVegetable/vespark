# vespark
简单的仿spark的parser，加深sql执行过程的理解
## VeSqlBase.g4
仿SqlBase.g4，仅支持 EXPRESSION(表达式) 操作符 常量 SELECT FROM JOIN WHERE 及子查询等成分（聚合 窗口 分组 Union，CTE，DDL语句暂不实现）

Test: SELECT NAME,AGE,1+1,* FROM A LEFT JOIN (SELECT NAME,AGE FROM B WHERE AGE>10) C ON A.NAME=C.NAME WHERE AGE>10
