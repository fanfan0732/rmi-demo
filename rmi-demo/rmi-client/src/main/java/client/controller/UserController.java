package client.controller;

import me.fh.terry.entity.User;
import me.fh.terry.service.UserServiceInterfce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Terry
 * @Date: 2022/3/19 - 03 - 19 - 14:58
 * @Description: me.fh.terry.server.service
 * @Vsrsion: 1.0
 */
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceInterfce userService;

    @GetMapping("/getUser/{userId}")
    public User selectUserByUserId(@PathVariable("userId") Integer userId) {
        User user = userService.selectUserByUserId(userId);
        System.out.println("通过RMI调用接口");
        return user;
    }
}
