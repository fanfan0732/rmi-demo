package me.fh.terry.service;

import me.fh.terry.entity.User;

/**
 * @Auther: Terry
 * @Date: 2022/3/19 - 03 - 19 - 14:54
 * @Description: me.fh.terry.service
 * @Vsrsion: 1.0
 */
public interface UserServiceInterfce {

    User selectUserByUserId(Integer userId);
}
