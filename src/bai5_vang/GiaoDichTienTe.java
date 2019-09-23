/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_vang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaoDichTienTe extends GiaoDich {
    public float percent;
    public int typeofMoney;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(float percent, int typeofMoney, int Id, int number, String date, double price, double money) {
        super(Id, number, date, price, money);
        this.percent = percent;
        this.typeofMoney = typeofMoney;
    }

    public float getPercent() {
        return percent;
    }

    public int getTypeofMoney() {
        return typeofMoney;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public void setTypeofMoney(int typeofMoney) {
        this.typeofMoney = typeofMoney;
    }
    
    @Override
    public void inputInfo(){
        Scanner input = new Scanner (System.in);
        super.inputInfo();
        System.out.println("Ti gia:");
        this.percent = input.nextFloat();
        System.out.println("Loai tien te:");
        this.typeofMoney = input.nextInt();
    }
    
    public double Money(){
        if(typeofMoney == 1){
            return this.money = this.number*this.price;
        }else{
            return this.money = this.number*this.price*this.percent;
        }
    }
    
    @Override
    public String toString(){
        String temp;
        switch (typeofMoney) {
            case 1:
                temp = "VND";
                break;
            case 2:
                temp = "USD";
                break;
            default:
                temp = "EURO";
                break;
        }
        return "Giao dich tien te:"+super.toString()+",Ti gia:"+percent+",Loai tien te:"+temp+",Thanh tien:"+money;
    }
}
