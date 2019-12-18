package com.example.demo111.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:41
 * @Description: qq空间
 */
@Table(name = "qq_zone")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QZone {
    @Id
    @GeneratedValue
    /**
     * 主键id
     */
    private Integer id;
    /**
     * qq空间名称
     */
    private String zoneName;
    /**
     * qq空间背景图
     */
    private String backGroundPicture;
    /**
     * qq秀
     */
    private String qqShowPhoto;

}
