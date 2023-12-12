package com.cuiyq.domain;

import java.util.Date;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
public class Bill {
    private Integer id;
    private String billId;
    private Integer menuId;//菜品编号
    private Integer nums;//数量
    private Double money;//单价
    private Integer dingingTableId;//桌号;
    private Date billDate; //订单时间
    private String state; //订单状态

    public Bill() {
    }
    public Bill(Integer id, String billId, Integer menuId, Integer nums, Double money, Integer dingingTableId, Date billDate, String state) {
        this.id = id;
        this.billId = billId;
        this.menuId = menuId;
        this.nums = nums;
        this.money = money;
        this.dingingTableId = dingingTableId;
        this.billDate = billDate;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getDingingTableId() {
        return dingingTableId;
    }

    public void setDingingTableId(Integer dingingTableId) {
        this.dingingTableId = dingingTableId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billId='" + billId + '\'' +
                ", menuId=" + menuId +
                ", nums=" + nums +
                ", money=" + money +
                ", dingingTableId=" + dingingTableId +
                ", billDate=" + billDate +
                ", state='" + state + '\'' +
                '}';
    }
}
