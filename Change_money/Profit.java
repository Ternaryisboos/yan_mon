package com.yan.Change_money;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 收益模块：
*    用户选择这一个模块后，会出现收益入帐，多少金额，收益时间，余额
* */
public class Profit {
    private double money;
    private String time;
    private double balance;

//    public Profit(double money) {
//        this.money = money;
//    }
    public void setMoney(double money) {
        if (money >= 0){
        this.money = money;
        }else {
            System.out.println("请重新输入金额！");
        }
    }

    Date date = new Date();
    SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    //记录收入的金额，时间，余额


    public void profit(int money){
        balance += money;
    }
}
