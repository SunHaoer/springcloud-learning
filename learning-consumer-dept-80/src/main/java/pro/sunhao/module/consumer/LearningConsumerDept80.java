package pro.sunhao.module.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.sunhao.module.api.entities.Dept;

@SpringBootApplication
public class LearningConsumerDept80 {
    public static void main(String[] args) {
        Dept dept = new Dept();
        SpringApplication.run(LearningConsumerDept80.class, args);
    }
}
