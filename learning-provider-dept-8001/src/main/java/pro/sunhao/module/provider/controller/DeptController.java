package pro.sunhao.module.provider.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sunhao.module.api.entities.Dept;
import pro.sunhao.module.provider.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean add(Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/get")
    public Dept get(Long id) {
        return deptService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @GetMapping("/test")
    public Integer getCnt() {
        return deptService.getCnt();
    }

}
