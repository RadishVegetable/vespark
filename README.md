# vespark
简单的仿spark的parser，加深sql执行过程的理解
## VeSqlBase.g4
仿SqlBase.g4，仅支持 EXPRESSION(表达式) 操作符 常量 SELECT FROM JOIN WHERE 及子查询等成分（聚合 窗口 分组 Union，CTE，DDL语句暂不实现）

Test: SELECT NAME,AGE,1+1,* FROM A LEFT JOIN (SELECT NAME,AGE FROM B WHERE AGE>10) C ON A.NAME=C.NAME WHERE AGE>10

## catalyst
从sql的解析到执行

## 思想与实现
SQL的全流程为：
sql 
-> 
Unresolved LogicalPlan -> Analyzed LogicalPlan -> Optimized LogicalPlan
->
Iterator[PhysicalPlan] -> SparkPlan -> Prepared SparkPlan

目前想要实现的功能为：
sql -> LogicalPlan -> SparkPlan

忽略掉逻辑计划中的解析、优化，以及物理计划中的一些优化。

在LogicalPlan中，重点是Expression的eval()

在SparkPlan中，重点是ExecNode中的doExecute()

这样构成火山模型，从根节点到叶子节点的递归调用eval()和doExecute()

