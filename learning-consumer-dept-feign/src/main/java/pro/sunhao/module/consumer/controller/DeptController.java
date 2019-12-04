package pro.sunhao.module.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pro.sunhao.module.api.entities.Dept;
import pro.sunhao.module.api.service.DeptClientService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/add")
    public boolean add(Dept dept) {
        return deptClientService.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept findById(@PathVariable Long id) {
        return deptClientService.findById(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptClientService.findAll();
    }

    @GetMapping("/test")
    public Integer getCnt() {
        return deptClientService.getCnt();
    }

}
