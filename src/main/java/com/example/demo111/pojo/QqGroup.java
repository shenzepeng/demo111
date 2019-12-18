package com.example.demo111.pojo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:39
 * @Description: 沈泽鹏写点注释吧
 */

@Table(name = "qq_group")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QqGroup {
    @Id
    @GeneratedValue
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 创建分组的时间
     */
    private Date createTime;
}
