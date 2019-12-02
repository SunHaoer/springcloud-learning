package pro.sunhao.module.api.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    // 主键
    private Long deptno;

    // 部门名称
    private String dname;

    // 来自哪个数据库
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

}
