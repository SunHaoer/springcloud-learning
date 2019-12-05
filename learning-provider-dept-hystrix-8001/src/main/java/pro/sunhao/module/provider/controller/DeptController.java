package pro.sunhao.module.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sunhao.module.api.entities.Dept;
import pro.sunhao.module.provider.service.DeptService;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{id}")
//    @HystrixCommand(fallbackMethod = "processHystrixFindById")
    public Dept findById(@PathVariable Long id) {
        Dept dept = this.deptService.findById(id);
        if(dept == null) {
            throw new RuntimeException("该id " + id + " 不存在");
        }
        return deptService.findById(id);
    }

    @GetMapping("/list")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "processHystrixGetCnt")
    public Integer getCnt() {
        throw new RuntimeException("单纯的抛个异常");
        //return deptService.getCnt();
    }

    public Integer processHystrixGetCnt() {
        return -1;
    }

//    public Dept processHystrixFindById(@PathVariable("id") Long id) {
//        return new Dept().setDeptno(id).setDname("该id " + id + " 不存在, null--@HystrixCommond").setDb_source("no this data in MySQL");
//    }
//

}
