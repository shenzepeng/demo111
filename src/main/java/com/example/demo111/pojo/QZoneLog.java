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
 * @Date: 2019/12/16 21:44
 * @Description: 空间日志
 */
@Table(name = "qq_zone_log")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QZoneLog {
    @Id
    @GeneratedValue
    /**
     * 主键
     */
    private Integer id;
    /**
     * 日志的标题
     */
    private String title;
    /**
     * 日志的内容
     */
    private String content;
    /**
     * 日志的创建时间
     */
    private Date createDate;
}
