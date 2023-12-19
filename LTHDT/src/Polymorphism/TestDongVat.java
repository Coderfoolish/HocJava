/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

import java.util.Scanner;
public class TestDongVat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        DongVat dv=new DongVat();
        dv.nhap();
        dv.xuat();
        dv=new Cho();// upcasting (sử dụng các thược tính phương thức của cha.
        dv.phuongthucdv();
        
        // downcasting để gọi các phương thức của lớp con
        //Cho c=new Cho();
       // DongVat d=(DongVat)c;
       DongVat dv1=new Cho();
        DongVat d1 = new Cho();
        Cho c1=(Cho)d1; // downcasting
        c1.phuongthuccuacho();
        
        if (d1 instanceof Cho)
        {    Cho castedDog = (Cho) d1;
             castedDog.phuongthuccuacho();
             
          
        }
 
        */
        
        // ==========tao mảng động vật=================
        DongVat[] arrdv=new DongVat[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Chọn con vật bạn cần nhập");
            System.out.println("1. Chon Cho");
            System.out.println("2. Chon Meo");
            System.out.println("3. Nhập động vật chưa biết thế nào:");
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon) {
                case 1:
                    arrdv[i] = new Cho();
                    arrdv[i].nhap();
                    arrdv[i].an();
                    arrdv[i].keu();
                    break;
                case 2:
                    arrdv[i] = new Meo();
                    arrdv[i].nhap();
                    arrdv[i].an();
                    arrdv[i].keu();
                    arrdv[i].xuat();

                    break;
                case 3:
                    arrdv[i] = new DongVat();
                    arrdv[i].nhap();
                    arrdv[i].an();
                    arrdv[i].keu();
                    break;
            }
        }
        //-----------------hien thi dong vat--------------------------
        for(int i=0;i<3;i++)
        {
            if(arrdv[i] instanceof Cho)
            {
                //Cho c1=new Cho();
                Cho c1=(Cho)arrdv[i];
                System.out.println(arrdv[i]);
                c1.phuongthuccuacho();
              
            }
            else
                System.out.println(arrdv[i]);
         
        }
    }
}
