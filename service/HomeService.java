package com.yan.housingSystem.service;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.yan.housingSystem.modic.House;
/*
//        House[] houses = new House[2];
//        houses[0] =new House(1,"Tome",112,"朝阳区",2000,"未出租");
//        houses[1] =new House(2,"kime",991,"雨湖区",1700,"已出租");
//        for (int i = 0; i <houses.length ; i++) {
//            System.out.println(houses[i]);
//        }
//        System.out.println("----------------房屋列表完成----------------");
    }
使用动态数组存储数据*/


public class HomeService {
    private House[] houses;
    //设置一个houseNumber用于记录最初数据
    private int houseNumber = 3;
    private int idCounter = 1;
    int innf = 0;
    int index = -1;
    //这里是设置一个构造器，而构造器是没有返回类型的
    // 并且方法名和类名相同
    public HomeService(int size) {
        houses = new House[size];
        //向其中存储一些数据
        houses[0] = new House(1, "kime", 991, "雨湖区", 1700, "已出租");
        houses[1] = new House(2, "jack", 212, "长沙"  , 1000, "未出租");
        houses[2] = new House(3, "min",  124, "湘潭",1200, "未出租");
    }

    //修改id信息
    public boolean modo(int modid){
        for (int i = 0; i <houseNumber ; i++) {
            if (index == modid){
                index = i;
                System.out.println(houses[index]);
                return true;
            }else {
            }
        }
        return false;
    }
    //查找id信息,放回一个House，没有就返回一个null
    //在查找当中，编号值并不等于一个下标值
    public House finHomeService(int inf) {
        for (int i = 0; i < houseNumber; i++) {
            if (inf == houses[i].getNumber()) {
                return houses[i];
            }
        }
        return null;
    }
//        for (int i = inf; i <= houseNumber; --i) {
//            if (inf == i){
//                System.out.println(houses[inf-1]);
//                break;
//            }else {
//                System.out.println("没有找到");
//                break;
//            }
//        }
    //删除方法当中返回一个boolean类型
    public boolean dalHome(int num){
        //找到要删除的下标值
        int index = -1;
        for (int i = 0; i <houseNumber; i++) {
            if (num == houses[i].getNumber()){
                //获取数组的下标值
                index = i;
            }
        }
        if (index == -1){
            System.out.println("你要删除的信息没有找到，请确认后重新选择");
            return false;
        }else {
            //否则就是找到了，将要删除的下标用后一条信息进行覆盖即可
            for (int i = index; i  < houseNumber - 1 ; i++) {
                houses[i] = houses[i+1];
            }
            houses[--houseNumber] = null;
            return true;
        }
    }

    /*根据设置的空间，如果空间满了则取消录入
    * 设置一个add方法用于返回true/false
    * houseNumber = 1 ， 1！= 10
    * */
    public boolean add(House Numhouse){
        if (houseNumber == houses.length){
            System.out.println("对不起，信息存储的空间已经满了，无法进行添加");
            return false;
        }
        //这个就是可以起到存储数据的作用
        //house[1++] = new House(0,name,homeowners,address,rental,state);
        houses[houseNumber++] = Numhouse;
        //id为自动增长，设置初始化为零
        Numhouse.setNumber(++idCounter);
        return true;
    }

    //让house获取数组数据之后，我们要进行一个返回。
    public House[] lise() {
        return houses;
    }


}

