package pro.sunhao.module.consumer.configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TemplateConfig {

    @Bean
    @LoadBalanced    // ribbon 实现客户端负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule rule() {    // 指定算法代替轮询
//        return new RandomRule();    // 随机算法
        return new RetryRule();    // 跳过不响应服务
    }

}
