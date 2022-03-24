package com.yan.Change_money;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Consu{
    private double money;
    private String time;
    private double balance;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money <= balance ){
        this.money = money;
        }else {
            this.money = -999;
            System.out.println("你支出的金额以超出你现有的金额");
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void consu(double Conmoney,String siuation){
        double sayale = 60000;
        Date date = new Date();
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        balance = sayale - Conmoney;
        String moneydate = ("------------支出明细------------");
        moneydate+="\n"+siuation+"\t"+Conmoney +"\t" +simp.format(date) +" 余额："+balance+"\t";
        System.out.println(moneydate);
    }
}
