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
 * @Date: 2019/12/16 21:55
 * @Description: qq空间和用户的关系
 */
@Table(name = "qq_zone_member_ship")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QZoneMemerShip {
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * qq号的id
     */
    private Integer memberId;
    /**
     * 空间的id
     */
    private Integer zoneId;
}
