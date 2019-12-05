package pro.sunhao.module.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker    // 开启 hystrix
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class LearningProviderDeptHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(LearningProviderDeptHystrix8001.class, args);
    }
}
