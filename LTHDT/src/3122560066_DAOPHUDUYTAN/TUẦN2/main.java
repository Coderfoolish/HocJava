package BT;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+----------------------+");
            System.out.println("MENU SIÊU CẤP VIP PRO:");
            System.out.println("1. BÀI1");
            System.out.println("2. BÀI2");
            System.out.println("3. BÀI3");
            System.out.println("4. BÀI4");
            System.out.println("5. BÀI5 (Success)");
            System.out.println("6. BÀI6");
            System.out.println("7. BÀI7");
            System.out.println("8. BÀI8");
            System.out.println("9. BÀI9");
            System.out.println("0. Exit!!");
            System.out.print("Chọn chức năng (0-9): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    Input1 oop = new Input1();
                    oop.menu();
                    break;
                }
                case 2: {
                    Input2 oop = new Input2();
                    oop.menu();
                    break;
                }
                case 3: {
                    Input3 oop = new Input3();
                    oop.menu();
                    break;
                }
                case 4: {
                    Input4 oop = new Input4();
                    oop.menu();
                    break;
                }
                case 5: {
                    System.out.println("Bài tập 5 yêu cầu thêm các hàm setget và constructor , các class bài tập trên đã hoàn thành yêu cầu !!!");
                    break;
                }
                case 6: {
                    Input6 oop = new Input6();
                    oop.menu();
                    break;
                }
                case 7: {
                    Input7 oop = new Input7();
                    oop.menu();
                    break;
                }
                case 8: {
                    Input8 oop = new Input8() ;
                    oop.menu();
                    break;
                }
                case 9: {
                    System.out.println("Bài 9 tương tự bài 7 , hãy chọn bài 7 để xem kết quả !!!");
                    break;
                }
                case 0: {
                    System.out.println("Chương trình đã thoát thành công !!!");
                    return;
                }
                default: {
                    System.out.println("Sai cú pháp!");
                    break;
                }
            }
        } while (choice != 0);
    }
}
