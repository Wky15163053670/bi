# bi

|--src/main/java                    项目src(java)源码
  |--com.bi.controller              项目controller层（负责后端数据跳转前端）
    |--com.bi.controller.login      登录界面跳转数据
  |--com.bi.mapper                  项目dao+mapper层（忘记分开了。。）
    |--com.bi.mapper.xml            mybatis链接数据库sql语句
  |--com.bi.pojo                    数据库表的实体类（bean）
  |--com.bi.service                 service层，对数据库取出的数据进行操作
  |--com.bi.test                    测试层，对controller层、service层、mybatis层进行测试
  |--com.bi.util                    工具类,包含分页工具、获取客户端IP等一系列方法
|--src/main/resources               项目配置文件文件夹
  |--applicationContext.xml         spring、mybatis配置文件
  |--jdbc.properties                数据库连接配置
  |--log4j.properties               日志显示配置
  |--springMVC.xml                  spring、springMVC配置文件
|--sql                              SQL建表语句及数据库需求数据
|--src                              前端文件
  |--src/main/webapp                前端展示文件
    |--resources                    静态文件存放位置（包含js、css、less、login背景图片等）
    |--WEB-INF                      jsp文件（既前端展示代码）
|--target                           （百度！！！）
|--pom.xml                          项目maven文件（远程jar导入文件）





