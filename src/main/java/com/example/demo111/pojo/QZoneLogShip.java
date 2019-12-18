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
 * @Date: 2019/12/16 21:45
 * @Description: 沈泽鹏写点注释吧
 */
@Table(name = "qq_log_ship")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QZoneLogShip {
    @Id
    @GeneratedValue
    /**
     * 主键
     */
    private Integer id;
    /**
     * 空间id
     */
    private Integer qZoneId;
    /**
     * 日志id
     */
    private Integer logId;
    /**
     * 发表日志时间
     */
    private Date creatTime;
}
