package client.config;

import me.fh.terry.service.UserServiceInterfce;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @Auther: Terry
 * @Date: 2022/3/19 - 03 - 19 - 15:41
 * @Description: me.fh.terry.server.config
 * @Vsrsion: 1.0
 */
@Configuration
public class RmiClient {

    @Bean
    public RmiProxyFactoryBean getRmiProxyFactoryBean() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceInterface(UserServiceInterfce.class);
        rmiProxyFactoryBean.setServiceUrl("rmi://127.0.0.1:9001/userService");
        return rmiProxyFactoryBean;

    }
}
