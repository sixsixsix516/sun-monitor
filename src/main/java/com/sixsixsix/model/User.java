package com.sixsixsix.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sun 2020/8/27 17:11
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    private String cron;
}
