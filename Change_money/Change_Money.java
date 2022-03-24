package com.yan.Change_money;

import com.yan.orerride.OverrideExercise.Person;
import jdk.nashorn.internal.ir.CallNode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
*零钱通明细需求：
* 定义：
* 零钱明细：Chandet
* 收益：profit
* 消费：consu
* 退出：Exit
* 使用java开发零钱通项目，可以完成收益入账，消费，明细，退出系统等功能
* 首先获取控制台当中用户需要使用的功能，我们用到Scanner.并且加一个判定
* 当选择零钱通明细的时候，指向if的判定，并输出Chandet当中的方法，然后系统就
* 停止在显示页面，直到用户选择了4退出
* 收益需求：
*
*
* 问题：无法将收益的数据存储起来，进行计算
* */
public class Change_Money {

    public static void main(String[] args) {
        boolean loop = true;
        String siuation = "";
        int money = 0;
        int mon = 0;
        int con = 0;
        double balance = 0;

        Date date = new Date();
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String moneydate = "=============零钱通明细=============";
        do {
            System.out.println("------------零钱通功能------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("\t"+"\t"+"1 零钱通明细");
            System.out.println("\t"+"\t"+"2 收益");
            System.out.println("\t"+"\t"+"3 消费");
            System.out.println("\t"+"\t"+"4 退出");
            System.out.print("请输入需要使用的功能(1-4):");
            mon = scanner.nextInt();
            if (mon == 1){
                System.out.println(moneydate);
            }else if(mon == 2){
                //由控制台获取收入2
                System.out.println("请输入盈利金额：");
                money = scanner.nextInt();
                balance +=money;
                moneydate += "\n"+"收入："+money +"\t" +simp.format(date) +" 余额："+balance+"\t";

            }else if(mon == 3){
                System.out.println("请输入支出的金额：");
                con = scanner.nextInt();
                System.out.println("请输入消费类型：");
                 siuation = scanner.next();
                 balance -= con;
                moneydate += "\n"+siuation+"："+con +"\t" +simp.format(date) +" 余额："+balance+"\t";

            }else if (mon == 4) {
                while (true){
                    System.out.println("确定要退出了吗？y/n");
                    siuation = scanner.next();
                    if ("y".equals(siuation) || "n".equals(siuation)){
                        break;
                    }else{}
                }
                if (siuation.equals("y")){
                        loop = false;
                        break;
                    }else if (scanner.equals("n")){
                        break;
                }
            }
        }while (loop);
        System.out.println("系统以退出！");
        }
    }

