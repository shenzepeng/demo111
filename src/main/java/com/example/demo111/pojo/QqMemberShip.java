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
 * @Date: 2019/12/16 21:33
 * @Description: 沈泽鹏写点注释吧
 */
@Table(name = "qq_member_ship")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QqMemberShip {
    @Id
    @GeneratedValue
    /**
     * 记录id  主键id
     */
    private Integer id;
    /**
     * 自己qq号的id
     */
    private Integer QqMemberId;
    /**
     * 朋友qq号的id
     */
    private Integer friendId;
    /**
     * 分组id
     */
    private Integer groupId;
    /**
     * 0 特别关注
     * 1 拉黑了
     * 2 删除
     */
    private Short status;

}
