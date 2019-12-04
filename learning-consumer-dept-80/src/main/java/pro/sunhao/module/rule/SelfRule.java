package pro.sunhao.module.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelfRule {

    @Bean
    public IRule rule() {    // 指定算法代替轮询
        return new SelfRandomRule();
    }

}
