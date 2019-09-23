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
public class GiaoDichVang extends GiaoDich {
    public String typeofGold;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String typeofGold, int Id, int number, String date, double price, double money) {
        super(Id, number, date, price, money);
        this.typeofGold = typeofGold;
    }

    public String getTypeofGold() {
        return typeofGold;
    }

    public void setTypeofGold(String typeofGold) {
        this.typeofGold = typeofGold;
    }
    
    @Override
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Loai vang:");
        this.typeofGold = input.nextLine();
    }
    
    public double Money(){
        return this.money = this.number*this.price;
    }
    
    @Override
    public String toString(){
        return "Giao dich vang:"+super.toString()+",Loai vang:"+typeofGold+",Thanh tien:"+money;
    }
    
}
