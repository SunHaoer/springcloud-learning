package pro.sunhao.module.provider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pro.sunhao.module.api.entities.Dept;

import java.util.List;

@Repository
@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

    Integer getCnt();

}
