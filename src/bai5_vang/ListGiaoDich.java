/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_vang;

/**
 *
 * @author Admin
 */
public class ListGiaoDich {
    GiaoDich gd[] = new GiaoDich[100];
    public int countGD,sum1 = 0,sum2 = 0,dem = 0,summoney = 0;
    public void ListGD(){
        countGD = 0;
        for(int i=0;i<100;i++){
            gd[i] = new GiaoDich();
        }
    }
    public void ThemGD(int temp){
        if(countGD>100)
            System.err.println("Khong du bo nho");
        else{
            if(temp == 1){
                gd[countGD] = new GiaoDichVang();
                GiaoDichVang gdv = new GiaoDichVang();
                gdv.inputInfo();
                gdv.money = gdv.Money();
                gd[countGD] = gdv;
                sum1 += gdv.number;
            }else{
                gd[countGD] = new GiaoDichTienTe();
                GiaoDichTienTe gdtt = new GiaoDichTienTe();
                gdtt.inputInfo();
                gdtt.money = gdtt.Money();
                gd[countGD] = gdtt;
                summoney += gdtt.money;
                sum2 += gdtt.number;
                dem++;
            }
            countGD++;
        }
    }
    public void HienThiDS(){
        for(int i=0;i<countGD;i++){
            System.out.println("\nSTT:" + i+1);
            System.out.println(gd[i].toString());
        }
    }
    public void TongSL(){
        System.out.println("\n| Tong so luong cua giao dich vang:" + sum1+"|");
        System.out.println("\n| Tong so luong cua giao dich tien te:" + sum2 + "|");
    }
    public void TrungBinhGDTT(){
        System.out.println("\n| Trung binh thanh tien giao dich tien te:" + (summoney/dem) + "|");
    }
    public void GiaoDich1ty(){
        int d=0;
        for(int i=0;i<countGD;i++){
            if(gd[i].price>1000){
                System.out.println(gd[i].toString());
                d++;
            }
        }
        if(d==0){
            System.out.println("Khong co du lieu");
        }
    }
}
