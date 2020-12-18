#介紹
使用Eureka做注册中心,Hystrix做熔断器

1.先運行spring-cloud-eureka項目啟動註冊中心
2.直接运行com.majian.spring.cloud.examples.EurekaServiceApplication
3.访问http://localhost:9004/ribbonQueryEurekaService//server_info/port 可查看结果
4.访问http://localhost:9004/feignQueryEurekaService/server_info/port 可查看结果

注意:因为我们要测试熔断机制,spring-cloud-eureka-service这个项目不启动