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

//    显示餐桌状态
    public List<DingingTable> list() {
       return dao.queryMulti("select * from dingingTable", DingingTable.class);
    }

}
