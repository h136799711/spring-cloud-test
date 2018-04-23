# spring-cloud-test
spring cloud test 

spring boot 2.0
spring cloud  Finchley.M9
jdk version 1.8


#1. spring-cloud-config-server
port: 8001
##1.1 config-client
port: 8081
用于测试验证 Spring Config Server 是否成功配置
##1.2 actuator 需要开启 bus-refresh 服务端口用于刷新配置

management:
  endpoints:
    web:
      exposure:
        include:  ["health","info","shutdown", "refresh", "bus-refresh"]

#2. spring-cloud-eureka-server
port: 8002
port: 8003

#3. spring-cloud-bus & spring-cloud-bus-amqp
开启消息总线
####目前选择了 rabbitmq 驱动，也可以选择其它   
*localhost:5672    or hebidu.cn hebidu
guest   
136799711*


