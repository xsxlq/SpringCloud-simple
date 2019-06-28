package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/20 20:25
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptNo;
    private String dName;
    private String db_source;   //来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
