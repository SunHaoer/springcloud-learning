package pro.sunhao.module.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class LearningProviderDept8001 {
    public static void main(String[] args) {
        SpringApplication.run(LearningProviderDept8001.class, args);
    }
}
