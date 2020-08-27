package com.sixsixsix.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author sun 2020/8/26 17:46
 */
@Data
@TableName("sun_monitor_request")
public class Request {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 使用掉的时间(单位毫秒)
     */
    private Long useTime;

    /**
     * 请求参数
     */
    private String param;

    /**
     * 接口返回值
     */
    private Object returnValue;

    /**
     * 请求时间
     */
    private LocalDateTime gmtCreate;

}
