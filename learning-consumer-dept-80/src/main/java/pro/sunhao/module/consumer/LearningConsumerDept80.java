package pro.sunhao.module.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import pro.sunhao.module.rule.SelfRule;

@EnableEurekaClient
@RibbonClient(name = "learning-dept", configuration = SelfRule.class)
@SpringBootApplication
public class LearningConsumerDept80 {
    public static void main(String[] args) {
        SpringApplication.run(LearningConsumerDept80.class, args);
    }
}
