package com.yan.housingSystem.modic;
/*
*项目功能实现-完成House类
* 编号-房主-电话-地址-月租-状态(未出租/已出租)
* */
public class House {
    //number = 编号
    private double number;
    //homeowners = 房屋主人
    private String homeowners;
    //phone = 电话
    private int phone;
    //address = 地址
    private String address;
    //rental = 月租
    private int rental;
    //state = 状态
    private String state;

    public House(double number, String homeowners, int phone, String address, int rental, String state) {
        this.number = number;
        this.homeowners = homeowners;
        this.phone = phone;
        this.address = address;
        this.rental = rental;
        this.state = state;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getHomeowners() {
        return homeowners;
    }

    public void setHomeowners(String homeowners) {
        this.homeowners = homeowners;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRental() {
        return rental;
    }

    public void setRental(int rental) {
        this.rental = rental;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //重写toString,方便显示属性名
//    public static void page(){
//        System.out.println("----------------房屋列表----------------");
//        System.out.println("编号  "+"  房主  "+"   电话  "+"   地址  "+"   月租  "+
//                "  状态(未出租/已出租)  ");
//    }
    @Override
    public String toString() {
    return number +" "+
                "\t" + homeowners +" "+
                "\t" + phone      +" "+
                "\t" + address    +" "+
                "\t" + rental     +" "+
                "\t"+ state ;
    }
}
