package pro.sunhao.module.provider.service;

import pro.sunhao.module.api.entities.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

    Integer getCnt();

}
