package pro.sunhao.module.provider.service;

import pro.sunhao.module.api.entities.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

    Integer getCnt();

}
