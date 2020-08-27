package com.sixsixsix.aop;

import com.alibaba.fastjson.JSON;
import com.sixsixsix.mapper.RequestMapper;
import com.sixsixsix.model.Request;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author sun 2020/8/27 12:32
 */
public class LogAdvice implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object result = null;
        String methodName = methodInvocation.getMethod().getName();
        Request request = new Request();

        long startTime = System.currentTimeMillis();
        //执行目标方法
        result = methodInvocation.proceed();

        long endTime = System.currentTimeMillis();
        String servletPath = servletRequest.getServletPath();
        if ("/state".equalsIgnoreCase(servletPath)) {
            return result;
        }
        request.setUrl(servletPath);
        String method = servletRequest.getMethod();
        if ("get".equalsIgnoreCase(method)) {
            request.setParam(JSON.toJSONString(servletRequest.getParameterMap()));
        } else {
            request.setParam(Arrays.toString(methodInvocation.getArguments()));
        }
        request.setReturnValue(result);
        request.setUseTime(endTime - startTime);
        requestMapper.insert(request);
        return result;
    }

    @Autowired
    private RequestMapper requestMapper;
    @Autowired
    private HttpServletRequest servletRequest;
}
