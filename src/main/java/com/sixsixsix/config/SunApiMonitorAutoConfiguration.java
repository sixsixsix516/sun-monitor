package com.sixsixsix.config;

import com.sixsixsix.model.User;
import com.sixsixsix.properties.SunApiMonitorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author sun 2020/8/27 17:10
 */
@EnableConfigurationProperties(value = SunApiMonitorProperties.class)
public class SunApiMonitorAutoConfiguration {


    @Autowired
    private SunApiMonitorProperties sunApiMonitorProperties;

    @Bean
    public User user() {
        System.out.println("自动装配");
        return new User(sunApiMonitorProperties.getName(),sunApiMonitorProperties.getCron());
    }
}
