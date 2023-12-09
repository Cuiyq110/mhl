package com.cuiyq.view;

import com.cuiyq.service.EmployeeService;
import com.cuiyq.utils.Utility;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：mhl主菜单
 */
@SuppressWarnings("all")
public class MHLView {
    
//    控制是否退出主菜单
    private boolean loop = true;
    
//    接受用户输入
    private String key = "";

    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    //主菜单
    public void mainMenu() {
        
        while (loop) {

            System.out.println("=============满汉楼=============");
            System.out.println(" \t\t1 登录满汉楼");
            System.out.println(" \t\t2 退出满汉楼");
            System.out.print("请输入你的选择：");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    String empId = "";//接收用户名
                    String  empPwd = "";//接收密码
                    System.out.println("请输入用户名：");
                    empId = Utility.readString(50);
                    System.out.println("请输入密码：");
                    empPwd = Utility.readString(50);

                    //到数据库中验证密码
                    EmployeeService employeeService = new EmployeeService();
                    if (employeeService.getEmployee(empId) == null) {
                        System.out.println("用户名不存在,登录失败");
                        break;
                    }
                    if (employeeService.getEmployee(empId, empPwd) == null) {
                        System.out.println("密码错误,登录失败");
                        break;
                    }


//                    if (!("1".equals(empPwd))) {
//                        System.out.println("登录失败");
//                        break;
//                    }

                    System.out.println("登录成功");
                    System.out.println();
                    System.out.println("=============满汉楼(二级菜单)=============");
                    System.out.println(" \t\t1 显示餐桌状态");
                    System.out.println(" \t\t2 预定餐桌");
                    System.out.println(" \t\t3 显示所有菜品");
                    System.out.println(" \t\t4 点餐服务");
                    System.out.println(" \t\t5 查看账单");
                    System.out.println(" \t\t6 结账");
                    System.out.println(" \t\t9 退出满汉楼");
                    System.out.print("请输入你的选择：");
                    key = Utility.readString(1);

                    switch (key) {
                        case "1":
                            System.out.println("1显示餐桌状态");
                            break;

                        case "2":
                            System.out.println("2预定餐桌");
                            break;

                        case "3":
                            System.out.println("3显示所有菜品");
                            break;

                        case "4":
                            System.out.println("4点餐服务");
                            break;

                        case "5":
                            System.out.println("5查看账单");
                            break;
                        case "6":
                            System.out.println("6");
                            break;
                        case "9":
                            System.out.println("退出满汉楼~");
                            loop = false;
                            break;
                        default:
                            System.out.println("输入有误，请重新输入~");

                    }
                    break;

                case "2":
                    System.out.println("退出满汉楼~");
                    loop = false;
                    break;

                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }


    }
}
