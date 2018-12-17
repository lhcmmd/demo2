package com.baizhi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ems")//表明
public class Ems implements Serializable {
    @Id//主键
    @KeySql(sql = "select ems_seq.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    @Column(name = "name")//字段名
    private String name;

    private Double salary;
    private Integer age;
    @Transient //声明当前属性不是数据表的字段，有可能是引用，没有注解会报错：找不到对应列
    private String test;

    public Ems(String name, Double salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
