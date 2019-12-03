package pro.sunhao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LearningEureka7003 {
    public static void main(String[] args) {
        SpringApplication.run(LearningEureka7003.class, args);
    }
}
