package BT;

import java.util.Scanner;

public class Input6 {
    public int n;
    Scanner sc = new Scanner(System.in);

    public Input6() {
        this.n = 0;
    }

    public Input6(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void menu() {
        Input6 dt = new Input6();
        int choice;
        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("MENU BÀI 6: ");
            System.out.println("1. Nhập & xuất số nguyên");
            System.out.println("2. Kiểm tra số nguyên vừa nhập");
            System.out.println("0. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    dt.nhap();
                    dt.xuat();
                    break;
                }
                case 2: {
                    String ketQua = "";
                    dt.Prime();
                    dt.Scp();
                    dt.isSymmetric();
                    dt.isPerfect();
                    dt.laSoChinhQuy();
                    dt.isFibonacci();
                    dt.isCarmichael();
                    dt.isSophieGermain();
                    if (dt.Prime()) {
                        ketQua += "Số nguyên tố ";
                    }
                    if (dt.Scp()) {
                        ketQua += "Số chính phương ";
                    }
                    if (dt.isSymmetric()) {
                        ketQua += " Số đối xứng ";
                    }
                    if (dt.isPerfect()) {
                        ketQua += " Số hoàn hảo ";
                    }
                    if (dt.laSoChinhQuy()) {
                        ketQua += " Số chính quy ";
                    }
                    if (dt.isSophieGermain()) {
                        ketQua += " Số Sophie Germain ";
                    }
                    if (dt.isCarmichael()) {
                        ketQua += " Số Carmichael ";
                    }
                    if (ketQua.isEmpty()) {
                        ketQua = " Số trên không xác định";
                    }
                    System.out.println("Congratulation! , bạn vừa nhập ra số ... " + ketQua + " ");
                    break;
                }
                case 0: {
                    System.out.println("Thoát chương trình thành công !!!");
                    return;
                }
                default:
                    System.out.println("Sai cú pháp , vui lòng chọn lại lựa chọn");
                    break;
            }
        }
    }

    public void nhap() {
        System.out.println("Nhập số nguyên : ");
        this.n = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Số nguyên của bạn: " + this.n);
    }

    //Số nguyên tố: là số nguyên dương có đúng 2 ước nguyên tố là 1 và chính nó.
    public boolean Prime() {
        if (this.n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(this.n); i++)
            if (this.n % i == 0)
                return false;
        return true;
    }

    //Số chính phương: là số nguyên dương có căn bậc hai là số nguyên.
    public boolean Scp() {
        return Math.sqrt(this.n) % 1 == 0;
    }

    //Số đối xứng: là số nguyên dương có giá trị bằng số đối của nó.
    public boolean isSymmetric() {
        String strSoNguyen = String.valueOf(this.n);
        String strSoNguyenDao = new StringBuilder(strSoNguyen).reverse().toString();
        return strSoNguyen.equals(strSoNguyenDao);
    }

    //Số hoàn hảo: là số nguyên dương có tổng các ước nguyên tố của nó bằng chính nó.
    public boolean isPerfect() {
        int tongChiaHet = 1;
        for (int i = 2; i * i <= this.n; i++) {
            if (this.n % i == 0) {
                tongChiaHet += i + this.n / i;
            }
        }
        return tongChiaHet == this.n;
    }

    //Số chính quy: là số nguyên dương có tổng các chữ số bằng chính nó.
    public boolean laSoChinhQuy() {
        int soNguyen = this.n;
        int tong = 0;
        while (soNguyen > 0) {
            tong += soNguyen % 10;
            soNguyen /= 10;
        }
        return soNguyen == tong;
    }

    //Số Fibonacci: là số nguyên dương trong dãy Fibonacci.
    public boolean isFibonacci() {
        int i = 0;
        int j = 1;
        while (j <= this.n) {
            int temp = i + j;
            i = j;
            j = temp;
        }
        return j == this.n;
    }

    //Số Carmichael: là số nguyên dương có số ước nguyên tố chỉ là 1 và chính nó.
    public boolean isCarmichael() {
        int count = 0;
        for (int i = 2; i * i <= this.n; i++) {
            if (this.n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    //Số Sophie Germain: là số nguyên tố nhỏ hơn gấp đôi một số nguyên tố khác
    public boolean isSophieGermain() {
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(this.n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}