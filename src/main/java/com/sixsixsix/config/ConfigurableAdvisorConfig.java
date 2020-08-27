package com.sixsixsix.config;

import com.sixsixsix.aop.LogAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sun 2020/8/27 12:34
 */
@Configuration
public class ConfigurableAdvisorConfig {

    @Value("${interface-package}")
    private String interfacePackage;

    @Bean
    public AspectJExpressionPointcutAdvisor configurabledvisor() {
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(String.format("execution(* %s..*.*(..))", interfacePackage));
        advisor.setAdvice(logAdvice());
        return advisor;
    }

    @Bean
    public LogAdvice logAdvice() {
        return new LogAdvice();
    }

}
