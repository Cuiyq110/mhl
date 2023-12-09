package com.cuiyq.domain;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：
 */
public class DingingTable {
    private Integer id;
    private String status; // 状态
    private String orderName; // 订单人名称
    private String oderTel; //订单人电话

    public DingingTable() {
    }

    public DingingTable(Integer id, String status, String orderName, String oderTel) {
        this.id = id;
        this.status = status;
        this.orderName = orderName;
        this.oderTel = oderTel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOderTel() {
        return oderTel;
    }

    public void setOderTel(String oderTel) {
        this.oderTel = oderTel;
    }

    @Override
    public String toString() {
        return "DingingTalbe{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderName='" + orderName + '\'' +
                ", oderTel='" + oderTel + '\'' +
                '}';
    }

}
