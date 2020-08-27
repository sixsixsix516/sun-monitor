package com.sixsixsix.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sixsixsix.model.Request;
import com.sixsixsix.model.State;

import java.util.List;

/**
 * @author sun 2020/8/27 10:57
 */
public interface RequestMapper extends BaseMapper<Request> {

    List<State> state();
}
