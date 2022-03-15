package com.dzqc.demo3.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

import java.util.Date;

/**
 * @author jzh
 * @date 2022/3/14 16:09
 */
@Data
@TableName("y_user")
public class YUser {


    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String username;
    private String password;

    private Integer gender;
    private String phone;
    private String email;
    private int age;

    private String vocation;
    @TableField("create_time")
    private Date createTime;

    @TableField("is_cancel")
    private String iscancel;

    @TableField("funs_number")
    private String funsnumber;

    @TableField("attention_num")
    private String attentionNum;


}



