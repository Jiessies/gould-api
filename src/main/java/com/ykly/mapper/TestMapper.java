package com.ykly.mapper;

import org.springframework.stereotype.Repository;

/**
 * Created by huangmingjie on 2018/1/3.
 */
@Repository
public interface TestMapper {
    String findOrder(String orderNo);
}
