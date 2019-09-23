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
public class GiaoDich {
    public int Id,number;
    public String date;
    public double price,money;

    public GiaoDich() {
    }

    public GiaoDich(int Id, int number, String date, double price, double money) {
        this.Id = Id;
        this.number = number;
        this.date = date;
        this.price = price;
        this.money = money;
    }

    public int getId() {
        return Id;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public double getMoney() {
        return money;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ma giao dich:");
        this.Id = input.nextInt();
        System.out.println("Ngay giao dich:");
        this.date = input.nextLine();
        System.out.println("Don gia:");
        this.money = input.nextDouble();
        System.out.println("So luong:");
        this.number = input.nextInt();
    }
    
    @Override
    public String toString(){
        return "Ma giao dich:"+Id+"\nNgay giao dich:"+date+"\nSo luong:"+number+"\nDon gia:"+price;
    }
}
