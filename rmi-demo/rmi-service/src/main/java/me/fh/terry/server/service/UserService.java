package me.fh.terry.server.service;

import me.fh.terry.entity.User;
import me.fh.terry.service.UserServiceInterfce;
import org.springframework.stereotype.Service;

/**
 * @Auther: Terry
 * @Date: 2022/3/19 - 03 - 19 - 14:58
 * @Description: me.fh.terry.server.service
 * @Vsrsion: 1.0
 */
@Service
public class UserService implements UserServiceInterfce {

    @Override
    public User selectUserByUserId(Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("fanhao");
        System.out.println("RMI Service" + userId);
        return user;
    }
}
