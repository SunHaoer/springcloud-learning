package pro.sunhao.module.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class LearningProviderDept8003 {
    public static void main(String[] args) {
        SpringApplication.run(LearningProviderDept8003.class, args);
    }
}
