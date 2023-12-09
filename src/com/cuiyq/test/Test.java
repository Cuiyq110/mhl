package com.cuiyq.test;

import com.cuiyq.utils.JDBCUtilsByDruid;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        System.out.println("你好");

        try {
            JDBCUtilsByDruid.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
        }


    }
    @org.junit.Test
    public void test1(){
        System.out.println("你好");

        try {
            JDBCUtilsByDruid.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
        }


    }
}
