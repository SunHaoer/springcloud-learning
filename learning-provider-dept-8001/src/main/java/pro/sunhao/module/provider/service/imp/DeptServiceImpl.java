package pro.sunhao.module.provider.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sunhao.module.api.entities.Dept;
import pro.sunhao.module.provider.mapper.DeptMapper;
import pro.sunhao.module.provider.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    public Integer getCnt() {
        return deptDao.getCnt();
    }

}
