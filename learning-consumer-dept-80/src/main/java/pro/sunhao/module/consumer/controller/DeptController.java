package pro.sunhao.module.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pro.sunhao.module.api.entities.Dept;

import java.util.List;

@RestController
public class DeptController {

    final private static String URL_PREFIX = "http://localhost:8001/dept";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "/add", dept, Boolean.class);
    }

    @GetMapping("/get/{id}")
    public Dept findById(@PathVariable Integer id) {
        return restTemplate.getForObject(URL_PREFIX + "/get/" + id, Dept.class);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return restTemplate.getForObject(URL_PREFIX + "/list", List.class);
    }

    @GetMapping("/test")
    public Integer getCnt() {
        return restTemplate.getForObject( URL_PREFIX + "/test", Integer.class);
    }

}
