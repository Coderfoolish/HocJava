/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Arrays;
import java.util.Scanner;
public class DanhSachSinhVien{
    //public static final long serialVersionUID = 1L;
    private int n;
    Sinhvien [] arrsv;
    //String s[]={"A", "B", "C"};
    Scanner sc=new Scanner(System.in);
    public DanhSachSinhVien()
    {
        arrsv=null;
        n=0;
    }
    
    public void nhapdssinhvien() 
    {
        
        System.out.println("Nhap vao so luong sinh vien:");
        n=Integer.parseInt(sc.nextLine());
        arrsv=new Sinhvien[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap vao sinh vien thu:" +(i+1));
            // Sử dụng cach 1
            Sinhvien a=new Sinhvien();
            a.nhap();
            arrsv[i]=a;
            //-----------su dung cach 2---------
            //arrsv[i]=new Sinhvien();
            //arrsv[i].nhapsinhvien();
 
        }
    }
    public void thaydoinoihoc(String noihoc)
    {
        System.out.println("Nhap vào nơi học mới:");
        noihoc=sc.nextLine();
       
    }
    public void xuatmangsinhvien()
    {
        System.out.println("Danh sach sinh vien vua nhap)");
        System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3"); //test
        System.out.printf("%-12d%-12d%07d\n", 15, 12, 5); //test
        System.out.println("+-----------------------------------------------------------------------------------------------+");
    	//System.out.println("| Ma sv |          Ho va ten           | Ngay sinh  |   Dia chi      |      Dien Thoai   |");
    	System.out.printf("%-12s%-20s%-12s%-25s%-12s%-12s\n","MaSV","Ho va Ten","Ngay sinh","Dia Chi", "Dien Thoai","Noi hoc");
        //System.out.println("+--------------------------------%-12s%-20s%-12s%-25s%-12s%-12s\\n\",-------------------------+");
        //for(int i=0; i<arrsv.length; i++)
        for(Sinhvien objsv: arrsv)
        {    
            //arrsv[i].xuatsinhvien(); 
            objsv.xuat();
        }
    }
    public void timkiemsinhvien()
    {
        System.out.println("Nhap vào mã sinh viên cần tim:");
        String masv=sc.nextLine();
        for(int i=0; i<arrsv.length; i++)
            if(arrsv[i].getMasv().equalsIgnoreCase(masv))
                arrsv[i].xuat();
    }
    public Sinhvien timkiemsinhvien1()
    {
        Sinhvien sv=null;
        System.out.println("Nhap vào mã sinh viên cần tim:");
        String masv=sc.nextLine();
        for(int i=0; i<arrsv.length; i++)
            if(arrsv[i].getMasv().equalsIgnoreCase(masv))
            {    
                sv=arrsv[i];
                break;
            }
        return sv;
    }
    public Sinhvien [] timkiemsinhvien2()
    {
        int j=0;
        Sinhvien [] arrtimkiem=new Sinhvien[n];
        System.out.println("Nhap vào tên sinh viên cần tim:");
        String tensv=sc.nextLine();
        for(int i=0; i<arrsv.length; i++)
            if(arrsv[i].getHoten().equalsIgnoreCase(tensv))
            {    
                arrtimkiem[j]=arrsv[i];
                j++;
            }
        return arrtimkiem;
    }
    public void themsinhvien()
    {
        System.out.println("Nhap thong tin sinh vien can them:");
        Sinhvien sv=new Sinhvien();
        sv.nhap();
        arrsv = Arrays.copyOf(arrsv, arrsv.length +1); 
        arrsv[n]=sv;
        n++;        
    }
    
   
    public static void main(String[] args) {
        DanhSachSinhVien mangsv=new DanhSachSinhVien();
        mangsv.nhapdssinhvien();
        mangsv.xuatmangsinhvien();
        //mangsv.timkiemsinhvien();
        Sinhvien sv1=null;
        sv1=mangsv.timkiemsinhvien1();
        sv1.xuat();
        Sinhvien arr[]=null;
        arr=mangsv.timkiemsinhvien2();
        System.out.println("Phan tu cua mang:"+arr.length);
        for(int i=0;i<arr.length-1;i++)
            arr[i].xuat();
        mangsv.themsinhvien();
        mangsv.xuatmangsinhvien();
    }
}
