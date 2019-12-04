package pro.sunhao.module.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"pro.sunhao.module"})
@ComponentScan("pro.sunhao.module")
public class LearningConsumerDeptFeign {
    public static void main(String[] args) {
        SpringApplication.run(LearningConsumerDeptFeign.class, args);
    }
}
