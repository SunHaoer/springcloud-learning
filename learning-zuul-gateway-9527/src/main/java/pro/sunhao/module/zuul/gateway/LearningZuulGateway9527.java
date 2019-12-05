package pro.sunhao.module.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class LearningZuulGateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(LearningZuulGateway9527.class, args);
    }
}
