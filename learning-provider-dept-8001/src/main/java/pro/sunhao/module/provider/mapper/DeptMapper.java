package pro.sunhao.module.provider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pro.sunhao.module.api.entities.Dept;

import java.util.List;

@Repository
@Mapper
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

    Integer getCnt();

}
