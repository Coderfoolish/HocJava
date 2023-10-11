package BT;

import java.util.Scanner;

public class Input1 {
    public double x ;
    public double y ;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static char nextChar = 'A' ;
    public Input1()
    {
        this.x = 0.00;
        this.y = 0.00;
    }
    public Input1(double x , double y )
    {
        this.x = x ;
        this.y = y ;
    }
    public void menu()
    {
        Input1 diem = new Input1();
        Scanner sc  = new Scanner(System.in) ;
        int choice;

        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("Menu:");
            System.out.println("1. Nhập điểm");
            System.out.println("2. Xuất điểm");
            System.out.println("3. Di chuyển điểm");
            System.out.println("0. Thoát");
            System.out.print("Chọn tùy chọn (0 -> 3): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    diem.nhap();
                    break;
                case 2:
                    diem.xuat();
                    break;
                case 3:
                    diem.Move();
                    diem.xuat() ;
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình.");
                    return; // Thoát khỏi chương trình.
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm x: ");
        x =sc.nextDouble();
        System.out.println("Nhập điểm y: ");
        y =sc.nextDouble() ;
    }
    public void xuat()
    {
        if(nextChar <= 'Z')
        {
            char ch = nextChar ;
            nextChar ++ ;
            System.out.println("Điểm "+ch+"(" + x + ";" +y+ ")");
        }
    }
    public void Move()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập giá trí muốn tăng thêm của x (1 đơn vị ) : ");
        double dx = sc.nextDouble() ;
        x += dx ;
        System.out.println("Nhập giá trí muốn tăng thêm của y(1 đơn vị ) : ");
        double dy = sc.nextDouble();
        y += dy;
    }
}


