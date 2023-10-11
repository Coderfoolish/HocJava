/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import dungchung.DiaChi;
import java.util.Scanner;

/**
 *
 * @author nguyen thanh sang
 */
public class Sinhvienlienthong extends Sinhvien{
    private String trinhdo;
    //private int sonamhoc;
    private String bangtotnghiep;

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getBangtotnghiep() {
        return bangtotnghiep;
    }

    public void setBangtotnghiep(String bangtotnghiep) {
        this.bangtotnghiep = bangtotnghiep;
    }
    Scanner sc=new Scanner(System.in);
    public Sinhvienlienthong(){
       super();
       trinhdo=null;
       bangtotnghiep=null;
    }

  
    public Sinhvienlienthong(String masv, String hoten, String ngaysinh, DiaChi dc, String dienthoai,String noihoc,String trinhdo, String bangtn) {
       super(masv, hoten, ngaysinh, dc, dienthoai,noihoc);
       this.trinhdo=trinhdo;
       this.bangtotnghiep=bangtotnghiep;
    }
    
    @Override
    public void nhap()
    {
        super.nhap();
        
    }
    
    @Override
    public void xuat()
    {
      super.xuat();
    }
    public void testsnhvienlt()
    {
       Sinhvienlienthong svlt =new Sinhvienlienthong();
       svlt.nhap();
       super.nhap();
    }
            
    public static void main(String[] args) {
       Sinhvienlienthong svlt=new Sinhvienlienthong();
       svlt.nhap();
       svlt.xuat();
        
    }
}
