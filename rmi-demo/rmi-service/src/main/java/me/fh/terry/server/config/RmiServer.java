package me.fh.terry.server.config;

import me.fh.terry.server.service.UserService;
import me.fh.terry.service.UserServiceInterfce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @Auther: Terry
 * @Date: 2022/3/19 - 03 - 19 - 15:41
 * @Description: me.fh.terry.server.config
 * @Vsrsion: 1.0
 */
@Configuration
public class RmiServer {

    @Autowired
    private UserService userService;

    @Bean
    public RmiServiceExporter getRmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("userService");
        rmiServiceExporter.setServicePort(9001);
        rmiServiceExporter.setService(userService);
        rmiServiceExporter.setServiceInterface(UserServiceInterfce.class);
        return rmiServiceExporter;

    }
}
