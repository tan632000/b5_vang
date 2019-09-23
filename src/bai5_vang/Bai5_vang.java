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
public class Bai5_vang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListGiaoDich lgd = new ListGiaoDich();
        Scanner input = new Scanner(System.in);
        int x;
        do{
            System.out.println("\n\t1.Them giao dich vang:");
            System.out.println("\n\t2.Them giao dich tien te:");
            System.out.println("\n\t3.Hien thi danh sach giao dich:");
            System.out.println("\n\t4.Xem tong so luong cac giao dich:");
            System.out.println("\n\t5.Xem trung binh cua cac giao dich tien te:");
            System.out.println("\n\t6.Hien thi danh sach giao dich tren 1 ty");
            System.out.println("\n\t7.Exit and goodbye");
            System.out.println("\n\tMoi ban nhap lua chon:");
            x = input.nextInt();
            switch(x){
                case 1:
                    lgd.ThemGD(1);
                    break;
                case 2:
                    lgd.ThemGD(2);
                    break;
                case 3:
                    lgd.HienThiDS();
                    break;
                case 4:
                    lgd.TongSL();
                    break;
                case 5:
                    lgd.TrungBinhGDTT();
                    break;
                case 6:
                    lgd.GiaoDich1ty();
                    break;
            }
        }while(x!=7);
        System.out.println("");
    }
    
}
