package com.sixsixsix.controller;

import com.sixsixsix.mapper.RequestMapper;
import com.sixsixsix.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sun 2020/8/26 18:19
 */
@RestController
public class HelloController {

    @GetMapping("/state")
    public List<State> state(){
        return requestMapper.state();
    }

    @Autowired
    private RequestMapper requestMapper;
}
