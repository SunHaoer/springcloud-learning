package pro.sunhao.module.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pro.sunhao.module.api.entities.Dept;

import java.util.List;

@FeignClient(value = "learning-dept", path = "/dept")
public interface DeptClientService {

    @PostMapping("/add")
    boolean addDept(@RequestBody Dept dept);

    @GetMapping("/get/{id}")
    Dept findById(@PathVariable("id") Long id);

    @GetMapping("/list")
    List<Dept> findAll();

    @GetMapping("/test")
    Integer getCnt();

}
