### 1.项目名称
基于SSM的秒杀系统的设计与实现
###  2.开发工具
IntelliJ IDEA 2018.2.3 x64、Google Chrome
###  3.开发环境
| JDK | Druid | Mysql | SpringBoot | Redis | RabbitMQ | Mybatis |
| ------ | ------ | ------ | ------ | ------ | ------ | ------ |
| 1.8 | 1.1.9 | 5.5.62 | 1.5.10.RELEASE | 6.0.9 | 3.6.9 | 1.3.2 |

###  4.部署设置
1、配置 application.properties 中相关redis、mysql、rabbitmq地址

2、导入seckill.sql，生成源数据库

3、启动Redis、RabbitMQ、MySQL服务，然后启动项目

4、登录地址：http://localhost:8080/user/to_login

5、商品秒杀列表地址：http://localhost:8080/goods/list