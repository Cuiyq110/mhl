package com.cuiyq.service;

import com.cuiyq.dao.BillDao;
import org.junit.Test;

import java.util.UUID;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：调用BillDao，完成对Bill表的操作
 */
@SuppressWarnings("all")
public class BillService {
    //    定义BillDao属性
    private BillDao billDao = new BillDao();


//    生成账单
    public void orderMenu(int menuId, int nums, int dingerId) {

//       生成订单编号
        String uuid = UUID.randomUUID().toString();

    }
}
