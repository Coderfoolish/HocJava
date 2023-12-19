package TUAN9;

import java.util.Scanner;

public class baitap6 {
    public static void input(Cow[] cows) {
        System.out.print("Nhập số lượng bò ban đầu: ");
        Scanner sc = new Scanner(System.in);
        int numCows = sc.nextInt();
        cows = new Cow[numCows];
//        System.out.print("Nhập số lượng cừu ban đầu: ");
//        int numSheeps = scanner.nextInt();
//        sheeps = new Sheep[numSheeps];
//
//        System.out.print("Nhập số lượng dê ban đầu: ");
//        int numGoats = scanner.nextInt();
//        goats = new Goat[numGoats];

        // Khởi tạo các đối tượng Cow, Sheep, Goat
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cow[] cows = null;
        input(cows);
        GiaSuc[] arrdv = new GiaSuc[3] ;
        for(int i=0;i<3;i++)
        {
            System.out.println("Chọn con vật bạn cần nhập");
            System.out.println("1. Chon Bò");
            System.out.println("2. Chon Cừu");
            System.out.println("3. Nhập Dê");
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon)
            {
                case 1:
                    arrdv[i]=new Cow();
                    arrdv[i].nhap();
                    arrdv[i].getMilkAmount() ;
//                    arrdv[i].an();
//                    arrdv[i].keu();
                    break;
//                case 2:
//                    arrdv[i]=new Meo();
//                    arrdv[i].nhap();
//                    arrdv[i].an();
//                    arrdv[i].keu();
//                    arrdv[i].xuat();
//
//                    break;
//                case 3:
//                    arrdv[i]=new DongVat();
//                    arrdv[i].nhap();
//                    arrdv[i].an();
//                    arrdv[i].keu();
//                    break;
            }
            for(i = 0; i<3; i++)
            {
                if(arrdv[i] instanceof Cow)
                {
                    //Cho c1=new Cho();
                    Cow c1 =(Cow)arrdv[i];
                    System.out.println(arrdv[i]);
                    c1.giveBirth();

                }
                else
                    System.out.println(arrdv[i]);

            }
        }
    }
}
