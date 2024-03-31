package com.syzc.entity;

import lombok.Data;

/**
 * @author xueli
 * @email 2632624281@qq.com
 * @date 2022-04-04 09:54
 * @description
 */
@Data
public class User {
    private int id;
    private String uname;
    private String upwd;
    private String uemail;
    private String utele;
}
