1. 配置中心在请求量少的情况下做成单一节点
2. 量大可以考虑做成多节点-集群，通过在配置中心集成eureka-server
3. 将配置做成微服务在对外提供服务

通过bus-refresh 端口服务进行刷新配置
curl http://xxxxx.cn:8001/actuator/bus-refresh -d {} -H "Content-type: application/json"