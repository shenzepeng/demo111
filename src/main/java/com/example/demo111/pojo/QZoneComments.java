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
 * @Date: 2019/12/16 21:48
 * @Description: 空间评论
 */
@Table(name = "qq_zone_comments")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QZoneComments {
    @Id
    @GeneratedValue
    /**
     * 评论的id
     */
    private Integer id;
    /**
     * 评论的内容
     */
    private String content;
    /**
     * 评论人的id
     */
    private Integer writeId;
    /**
     * 收到人的id
     */
    private Integer receiveId;
    /**
     * 发表评论的时间
     */
    private Date createTime;
}
