package me.fh.terry.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: Terry
 * @Date: 2022/3/19 - 03 - 19 - 14:52
 * @Description: me.fh.terry.entity
 * @Vsrsion: 1.0
 */
@Data
public class User implements Serializable {

    private Integer userId;

    private String userName;

}
