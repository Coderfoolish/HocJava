package BT;

import java.util.Scanner;

public class Input2 {
    public int x ;
    public int y ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Input2()
    {
        this.x = 0 ;
        this.y =0 ;
    }

    public Input2(int x , int y )
    {
        this.x =x ;
        this.y = y ;
    }
    public void menu ()
    {
        Input2 dt = new Input2();
        Scanner sc =new Scanner(System.in) ;
        int choice ;

        while ( true )
        {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("MENU BAI 2: ");
            System.out.println("1. Nhập chiều dài , chiều rộng") ;
            System.out.println("2. Xuất chiều dài , chiều rộng ") ;
            System.out.println("3. Tính chu vi hình chữ nhật") ;
            System.out.println("4. Tính diện tích hình chữ nhật") ;
            System.out.println("0. Thoát") ;
            System.out.println("Nhập lựa chọn từ (0 -> 4):") ;
            choice = sc.nextInt() ;

            switch (choice)
            {
                case 1: {
                    dt.Nhap();
                    break;
                }
                case 2: {
                    dt.xuat();
                    break;
                }
                case 3:{
                    dt.chuvi();
                    break;
                }
                case 4 : {
                    dt.dientich();
                    break;
                }
                case 0: {
                    System.out.println("Thoát chương trình!");
                    return;
                }
                default:
                    System.out.println("Lựa chọn không hợp lệ , vui lòng nhập lại lựa chọn! ") ;
                    break;
            }
        }
    }
    public void Nhap()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập chiều dài của hình chử nhật: ");
      x = sc.nextInt();
      System.out.println("Nhập chiều rộng của hình chữ nhật: ");
      y = sc.nextInt() ;
    }
    public void xuat()
    {
        System.out.println("Chiều dài: " + x);
        System.out.println("Chiều rộng: " + y);
    }
    public void dientich()
    {
        int dt = x*y ;
        System.out.println("Diện tích cúa hình chữ nhật là: " + dt );
    }
    public void chuvi()
    {
        int cv = (x + y ) *2 ;
        System.out.println("Chu vi của hình chữ nhật là: " + cv);
    }

}
