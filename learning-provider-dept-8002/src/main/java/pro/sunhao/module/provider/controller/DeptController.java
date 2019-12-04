package pro.sunhao.module.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.testng.annotations.Test;
import pro.sunhao.module.api.entities.Dept;
import pro.sunhao.module.provider.service.DeptService;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept findById(@PathVariable Long id) {
        return deptService.findById(id);
    }

    @GetMapping("/list")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    @GetMapping("/test")
    public Integer getCnt() {
        return deptService.getCnt();
    }

    @RequestMapping("/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("discovery:" + list);
        List<ServiceInstance> instanceList = client.getInstances("learning-dept");
        for(ServiceInstance instance : instanceList) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getUri() );
        }
        return this.client;
    }

}
