package pro.sunhao.module.consumer.configuration;

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

}
