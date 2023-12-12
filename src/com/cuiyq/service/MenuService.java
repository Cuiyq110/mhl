package com.cuiyq.service;

import com.cuiyq.dao.MenuDao;
import com.cuiyq.domain.Menu;

import java.util.List;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：完成对menu表的各种操作(通过调用MenuDAO)
 */
@SuppressWarnings("all")
public class MenuService {
//    创建menuDao属性
    private MenuDao menuDao = new MenuDao();

//    返回菜品表所有数据
    public List<Menu> list() {
       return menuDao.queryMulti("select * from menu",Menu.class);
    }

//    根据id返回一个对象
    public Menu getId(int id) {
      return menuDao.querySingle("select * from menu where id = ?", Menu.class,id);
    }
}
