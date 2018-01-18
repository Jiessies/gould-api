package com.ykly.entity.request.order;

import lombok.Data;

import java.util.Date;

/**
 * Created by huangmingjie on 2018/1/11.
 */
@Data
public class Order {
    private String orderNo;
    private Date createtime;
    private int orderstatus;
    private int orderprice;
}
