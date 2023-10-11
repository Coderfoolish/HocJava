package TUAN3;

import java.util.Scanner;

public class baitap1 {
    protected int x;
    protected int y;

    public static char nextChar = 'A';

    public baitap1() {
        this.x = 0;
        this.y = 0;
    }

    public baitap1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x: ");
        x = sc.nextInt();
        System.out.println("Nhập y: ");
        y = sc.nextInt();
    }

    public void xuat() {
        if (nextChar <= 'Z') {
            char ch = nextChar;
            System.out.println("Điểm " + nextChar + " (" + x + ";" + y + ")");
            nextChar++;
        }
    }
}
