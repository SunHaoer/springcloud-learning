package pro.sunhao.module.api.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import pro.sunhao.module.api.entities.Dept;

import java.util.List;

/**
 * 熔断机制, 若调用服务异常, 且服务内未进行异常或熔断处理
 * 进入该服务降级
 * 必须添加 component 注解
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Long id) {
                return new Dept().setDeptno(id).setDname("该id " + id + " 不存在, null--@HystrixCommond").setDb_source("no this data in MySQL");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }

            @Override
            public Integer getCnt() {
                return null;
            }

        };
    }

}
