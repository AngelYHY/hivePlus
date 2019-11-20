/**
 * Copyright 2018
 * All Right Reserved
 * Author：sherlyxiao
 * Create Date：Feb 6, 2018
 */
package com.freestar.hiveplus.ynyc_dm.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freestar.hiveplus.ynyc_dm.entity.Test;

import java.util.List;

public interface TestMapper extends BaseMapper<Test> {

    List<Test> getAll();

}
