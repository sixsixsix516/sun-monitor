package com.sixsixsix.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 请求统计
 *
 * @author sun 2020/8/27 12:50
 */
@Data
public class State implements Serializable {

    private String url;

    /**
     * 请求次数
     */
    private Integer count;

    /**
     * 平均花费时间
     */
    private Long avgTime;

    /**
     * 统计时间
     */
    private LocalDate localDate;
}
