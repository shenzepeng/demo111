package com.example.demo111.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/16 20:50
 * @Description: qq账号的
 */
@Table(name = "qq_member")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QqMember {
    @Id
    @GeneratedValue
    /**
     * 主键id
     */
    private Integer id;
    /**
     * qq号
     */
    private String qqNumber;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String imgUrl;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private String sex;

    public static void main(String[] args) {
        List<QqMember> list=new ArrayList<QqMember>();

    }

}
