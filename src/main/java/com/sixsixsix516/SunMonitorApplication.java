package com.sixsixsix516;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunlin
 */
@EnableAspectJAutoProxy
@MapperScan("com.sixsixsix516.mapper")
@RestController
@SpringBootApplication
public class SunMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunMonitorApplication.class, args);
    }


}
