package Polimophism;

import java.util.Scanner;

public class ProductCar {
    Scanner sc = new Scanner(System.in);
    private String idcar;
    private String modelcar;
    private String brandcar;
    private int year;
    private String trangthai;
    private int soluong;

    public ProductCar() {
        this.idcar = null;
        this.modelcar = null;
        this.brandcar = null;
        this.year = 0;
        this.trangthai = null;
        this.soluong = 0;
    }
    public ProductCar(String idcar , String modelcar , String brandcar , int year , String trangthai , int soluong)
    {
        this.idcar = idcar;
        this.modelcar = modelcar;
        this.brandcar = brandcar;
        this.year = year;
        this.trangthai = trangthai;
        this.soluong = soluong;
    }

    public String getIdcar() {
        return idcar;
    }

    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }

    public String getModelcar() {
        return modelcar;
    }

    public void setModelcar(String modelcar) {
        this.modelcar = modelcar;
    }

    public String getBrandcar() {
        return brandcar;
    }

    public void setBrandcar(String brandcar) {
        this.brandcar = brandcar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public void nhap()
    {
        System.out.println("Nhập mã số xe: ");
        idcar = sc.nextLine();
        System.out.println("Nhập mẫu xe: ");
        modelcar = sc.nextLine();
        System.out.println("Nhập hãng xe: ");
        brandcar =sc.nextLine() ;
        System.out.println("Nhập năm sản xuất xe: ");
        year = sc.nextInt() ;
        sc.nextLine();
        System.out.println("Nhập tình trạng hiện tại của xe: ");
        trangthai = sc.nextLine() ;
        System.out.println("Nhập số lượng : ") ;
        soluong = sc.nextInt() ;
    }
    public void xuat()
    {
        System.out.printf("%-10s%-10s%-20s%-20s%-20s%-10s\n", "|Mã xe|", "|Mẫu xe|", "|Hãng xe|", "|Năm sản xuất|", "|Tình trạng|", "|Số lượng|");
        System.out.printf("%-11s%-11s%-20s%-20s%-20s%-10s\n",idcar,modelcar,brandcar,year,trangthai,soluong);
    }
}
