package com.cuiyq.service;

import com.cuiyq.dao.DingingTableDao;
import com.cuiyq.domain.DingingTable;

import java.util.List;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：业务层
 */
@SuppressWarnings("all")
public class DingingTableService {

    private DingingTableDao dao = new DingingTableDao();

//    把餐桌从‘已预订’设置为‘空’
    public boolean unyuding(int id) {
        return dao.update("update dingingTable set status = '空' where id = ? ", id) > 0;
    }

/*
//    判断是餐桌是否为空,真就是空
    public boolean isEmpty(int id) {
         return dao.querySingle("select * from dingingTable where id = ? ", DingingTable.class, id) == null ;
    }
*/

//    根据id预定餐桌，把空的餐桌改成已预订,如果成功返回true
    public boolean yuding(int id, String orderName, String orderTel) {
        return dao.update("update dingingTable set status = ?,orderName = ?, orderTel = ? where id = ? and status = ?;", "已预订",orderName,orderTel, id,"空") > 0;
    }

//    根据id返回对象
    public DingingTable getId(int id) {
       return (DingingTable) dao.querySingle("select * from dingingTable where id = ?", DingingTable.class,id);
    }

//    显示餐桌状态
    public List<DingingTable> list() {
       return dao.queryMulti("select * from dingingTable", DingingTable.class);
    }

}
