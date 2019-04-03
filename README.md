# bi

|--src/main/java&emsp;&emsp;&emsp;&emsp;&emsp;项目src(java)源码</br>
&emsp;|--com.bi.controller&emsp;&emsp;&emsp;&emsp;项目controller层（负责后端数据跳转前端）</br>
&emsp;&emsp;|--com.bi.controller.login&emsp;&emsp;登录界面跳转数据</br>
&emsp;|--com.bi.mapper&emsp;&emsp;&emsp;&emsp;项目dao+mapper层（忘记分开了。。）</br>
&emsp;&emsp;|--com.bi.mapper.xml&emsp;&emsp;&emsp;mybatis链接数据库sql语句</br>
&emsp;|--com.bi.pojo&emsp;&emsp;&emsp;&emsp;&emsp;数据库表的实体类（bean）</br>
&emsp;|--com.bi.service&emsp;&emsp;&emsp;&emsp;service层，对数据库取出的数据进行操作</br>
&emsp;|--com.bi.test&emsp;&emsp;&emsp;&emsp;&emsp;测试层，对controller层、service层、mybatis层进行测试</br>
&emsp;|--com.bi.util&emsp;&emsp;&emsp;&emsp;&emsp;工具类,包含分页工具、获取客户端IP等一系列方法</br>
|--src/main/resources&emsp;&emsp;&emsp;&emsp;&emsp;项目配置文件文件夹</br>
&emsp;|--applicationContext.xml&emsp;&emsp;&emsp;spring、mybatis配置文件</br>
&emsp;|--jdbc.properties&emsp;&emsp;&emsp;&emsp;数据库连接配置</br>
&emsp;|--log4j.properties&emsp;&emsp;&emsp;&emsp;日志显示配置</br>
&emsp;|--springMVC.xml&emsp;&emsp;&emsp;&emsp;spring、springMVC配置文件</br>
|--sql&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;SQL建表语句及数据库需求数据</br>
|--src&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;前端文件</br>
&emsp;|--src/main/webapp&emsp;&emsp;&emsp;&emsp;前端展示文件</br>
&emsp;&emsp;|--resources&emsp;&emsp;&emsp;&emsp;静态文件存放位置（包含js、css、less、login背景图片等）</br>
&emsp;&emsp;|--WEB-INF&emsp;&emsp;&emsp;&emsp;&emsp;jsp文件（既前端展示代码）</br>
|--target&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;（百度！！！）</br>
|--pom.xml&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;项目maven文件（远程jar导入文件）</br>
</br>




