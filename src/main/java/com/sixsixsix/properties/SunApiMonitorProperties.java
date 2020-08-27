package com.sixsixsix.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author sun 2020/8/27 17:09
 */
@Data
@ConfigurationProperties(prefix = "sun-api-monitor")
public class SunApiMonitorProperties {


    private String name;

    private String cron;

}
