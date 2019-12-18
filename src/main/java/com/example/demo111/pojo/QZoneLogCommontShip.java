package com.example.demo111.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:50
 * @Description: 沈泽鹏写点注释吧
 */
@Table(name = "qq_group_ship")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QZoneLogCommontShip {
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 日志id
     */
    private Integer logId;
    /**
     * 评论id
     */
    private Integer commontId;
    /**
     * 创建时间
     */
    private Integer createTime;
}
