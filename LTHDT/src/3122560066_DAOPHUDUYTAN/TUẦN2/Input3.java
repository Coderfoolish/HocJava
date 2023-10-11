package BT;

import java.util.Scanner;

public class Input3 {
    public double r ;

    public Input3()
    {
        this.r = 0.00 ;
    }
    public Input3(double r )
    {
        this. r= r ;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void menu ()
    {
        Input3 dt = new Input3() ;
        Scanner sc=  new Scanner(System.in);
        int choise ;

        while (true)
        {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("MENU BÀI3 : ");
            System.out.println("1. Nhập bán kính r") ;
            System.out.println("2. Xuất bán kinh r ");
            System.out.println("3. Tính chu vi hình tròn") ;
            System.out.println("4. Tính diện tích hình tròn") ;
            System.out.println("0. Thoát chương trình ");

            choise = sc.nextInt() ;
            switch (choise)
            {
                case 1 :
                    dt.nhap();
                    break;
                case 2 :
                    dt.xuat();
                    break;
                case 3 :
                    dt.chuvi();
                    break ;
                case 4:
                    dt.dientich();
                    break;
                case 0 :
                    System.out.println("Thoát chương trình thành công !!");
                    return;
                default:
                    System.out.println("Sai cú pháp , mời bạn nhập lại lựa chọn !") ;
                    break ;
            }
        }
    }
    public void nhap()
    {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Nhập bạn kính r(cm): " );
        r = sc.nextDouble() ;
    }
    public void xuat()
    {
        System.out.print("Bán kính r: " +r + "(cm)");
    }
    public void chuvi()
    {
        double cv = 2*r*Math.PI  ;
        System.out.println("Chu vi của hình tròn là: " + cv +"(cm)");
    }
    public void dientich()
    {
        double dt = r*r*Math.PI;
        System.out.println("Diện tích của hình tròn là: " +dt +"(cm^2)");
    }
}
