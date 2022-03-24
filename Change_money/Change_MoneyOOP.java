package com.yan.Change_money;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Change_MoneyOOP {
        //属性..
        boolean loop = true;
    String siuation = "";
    int money = 0;
    int mon = 0;
    int con = 0;
    double balance = 0;
   Scanner scanner = new Scanner(System.in);
    Date date = new Date();
    SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String moneydate = "=============零钱通明细=============";
        //显示页面..
        public void page() {
            do {
                System.out.println("------------零钱通功能------------");
                Scanner scanner = new Scanner(System.in);
                System.out.println("\t" + "\t" + "1 零钱通明细");
                System.out.println("\t" + "\t" + "2 收益");
                System.out.println("\t" + "\t" + "3 消费");
                System.out.println("\t" + "\t" + "4 退出");
                System.out.print("请输入需要使用的功能(1-4):");
                mon = scanner.nextInt();
                if (mon == 1) {
                    System.out.println(moneydate);
                } else if (mon == 2) {
                    //由控制台获取收入2
                    this.profit();
                } else if (mon == 3) {
                    this.consu();

                } else if (mon == 4) {
                    this.exit();
                }
            } while (loop);
            System.out.println("零钱通程序已经退出！！");
        }
        //添加收入..
    public void profit(){
        System.out.println("请输入盈利金额：");
        money = scanner.nextInt();
        balance +=money;
        moneydate += "\n"+"收入："+money +"\t" +simp.format(date) +" 余额："+balance+"\t";
    }
        //消费
    public void consu(){
        System.out.println("请输入支出的金额：");
        con = scanner.nextInt();
        System.out.println("请输入消费类型：");
        siuation = scanner.next();
        balance -= con;
        moneydate += "\n"+siuation+"："+"-"+con +"\t" +simp.format(date) +" 余额："+balance+"\t";
    }
    public void exit(){
        while (true){
            System.out.println("确定要退出了吗？y/n");
            siuation = scanner.next();
            if ("y".equals(siuation) || "n".equals(siuation)){
                break;
            }else{}
        }
        if (siuation.equals("y")){
            loop = false;
            return;
        }else if (scanner.equals("n")){
            return;
        }
    }
}

