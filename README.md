## 平台简介

采用若依开源框架用于个人爱好和学习(* .*)
- 增加Mybatis Plus依赖
- 支持代码生成
- 增加lombok依赖
- 增加逻辑删除功能: 使用mp自带方法删除和查找都会附带逻辑删除功能 (自己写的xml不会)
- 增加自动插入/修改 create_by, create_time, update_by, update_time字段
- 将BaseEntity中remark, searchValue移入到相应的domain中, 增加deleted字段用于逻辑删除

