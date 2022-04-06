package com.yan.housingSystem.view;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.yan.housingSystem.Test;
import com.yan.housingSystem.modic.House;
import com.yan.housingSystem.service.HomeService;

import java.util.Scanner;

/*
* 项目功能的实现-显示主菜单和完成退出软件的功能
* */
public class HouseView {
    //将不用使用操作的变量都放置到方法外
    Scanner scanner = new Scanner(System.in);
    boolean oop = true;
    boolean nnu = true;
    private HomeService homeService = new HomeService(3);
    Test test = new Test();

    //完成修改房屋信息的功能
    public void modifi() {
        System.out.println("----------------修改房屋----------------");
        System.out.println("请选择待修改房屋编号(-1退出)：");
        int mon = scanner.nextInt();
        if (mon == -1) {
            System.out.println("----------------放弃修改房屋----------------");
            return;
        }
        House house = homeService.finHomeService(mon);
        if (house == null) {
            System.out.println("----------------你查找的内容不存在----------------");
            return;
        }
        //根据查找的id号确认房屋信息：
        System.out.print("姓名("+house.getHomeowners()+")");
        String name = scanner.next();
//还有一个需求，让输入的值判定一个如果为null，就输出原值
        house.setHomeowners(name);
        System.out.print("电话("+house.getPhone()+")：");
        int phone = scanner.nextInt();
        house.setPhone(phone);
        System.out.print("地址("+house.getAddress()+")：");
        String addres = scanner.next();
        house.setAddress(addres);
        System.out.print("租金("+house.getRental()+")：");
        int rental = scanner.nextInt();
        house.setRental(rental);
        System.out.print("状态("+house.getState()+")：");
        String sta = scanner.next();
        house.setState(sta);
    }
    //根据id查找房屋信息的功能
    public void findHome(){
        System.out.println("----------------查找房屋----------------");
        System.out.println("请输入你要查找的id:");
        int inf = scanner.nextInt();
        //需要设置一个工具方法，如果输入的不是数字的话就一直循环
        if (homeService.finHomeService(inf) == null){
            System.out.println("你查找的内容不存在");
        }
        House house = homeService.finHomeService(inf);
        System.out.println(house);
        }




    //删除房屋信息
    public void deleteHome() {
        System.out.println("----------------删除房屋----------------");
        System.out.println("请选择待删除房屋编号(-1退出)");
        int num = scanner.nextInt();
        while (nnu) {
            if (-1 == num) {
                System.out.println("删除功能已经取消！");
                return;
            } else {
                System.out.println("确定是否删除(y/n),请小心选择：");
                System.out.println("请输入你的选择(y/n)：");
                //将获取的数据转换为字符类型
                char ono = scanner.next().charAt(0);
//
//
                if (ono == 'n' && ono == 'y') {
                    nnu = false;
                } else {
                    //如果输入的不是这两个属性的话，那么就一直循环
                }
                if (ono == 'n') {
                    System.out.println("选择停止，请重新选择");
                    return;
                } else if (ono == 'y') {
                    //这里就设计到删除数组的问题，需要在HomeService设计
                    //如果删除成功就返回一个true，删除失败就返回一个false
                    if (homeService.dalHome(num)) {
                        System.out.println("----------------删除完成----------------");
                        return;
                    } else {
                        System.out.println("----------------删除失败，编号不存在----------------");
                        return;
                    }
                }
            }
        }
    }

    //增加房屋信息
    public void addHome(){
        System.out.println("----------------添加房屋列表----------------");
        System.out.print("姓名：");
        String name = scanner.next();
//
        System.out.print("电话：");
        int homeowners =scanner.nextInt();
//
        System.out.print("地址：");
        String address = scanner.next();
//
        System.out.print("月租：");
        int rental =scanner.nextInt();
//
        System.out.print("状态(已出租/未出租)：");
        String state = scanner.next();
//
        //将id设置为自动递增并且用户不能改变
        House house = new House(0,name,homeowners,address,rental,state);
        if (homeService.add(house)){
            System.out.println("----------------添加完成----------------");
        }else {
            System.out.println("添加房屋失败！");
        }

    }
    public void HomeService(){
        System.out.println("----------------房屋列表----------------");
        System.out.println("编号  "+"  房主  "+"   电话  "+"   地址  "+"   月租  "+
                "  状态(未出租/已出租)  ");
        House[] houses = homeService.lise();
        for (int i = 0; i <houses.length ; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }
    public void Minview() {

        //数据的返回
        do {
            System.out.println("----------------房屋出租系统----------------");
            System.out.println("1"+"\t"+" 新 增 房 源");
            System.out.println("2"+"\t"+" 查 找 房 屋");
            System.out.println("3"+"\t"+" 删 除 房 屋");
            System.out.println("4"+"\t"+" 修 改 房 屋 系 统 信 息");
            System.out.println("5"+"\t"+" 房 屋 列 表");
            System.out.println("6"+"\t"+" 退" + "\t" +"\t"+"出");
            System.out.print("请选择要选择的功能：");
            int conut = scanner.nextInt();
            switch (conut) {
                case 1:
                    addHome();
                    break;
                case 2:
                    System.out.println("请选择(1-6)：");
                    findHome();
                    break;
                case 3:
                    deleteHome();
                    break;
                case 4:
                    modifi();
                    break;
                case 5:
                    HomeService();
                    break;
                case 6:
                    Test test = new Test();
                    if (test.exit() == false){
                        oop = false;
                    }else {
                        break;
                    }
            }
        } while (oop);
          System.out.println("系统已经关闭，请继续操作面板");
    }
}

