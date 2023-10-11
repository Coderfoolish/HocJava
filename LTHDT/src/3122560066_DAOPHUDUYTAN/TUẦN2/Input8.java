package BT;

import java.util.Scanner;

public class Input8 {
    Scanner sc = new Scanner(System.in);
    public String str;

    public Input8() {
        this.str = null;
    }

    public Input8(String s) {
        this.str = s;
    }

    public String getS() {
        return str;
    }

    public void setS(String s) {
        this.str = str;
    }

    public void menu() {
        int choice;
        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("MENU CHUỖI: ");
            System.out.println("1. Nhập chuỗi");
            System.out.println("2. Xuất chuỗi");
            System.out.println("3. Kiểm tra toàn chữ hoa");
            System.out.println("4. Chuyển đổi sang chữ hoa");
            System.out.println("5. Tìm kiếm chuỗi con");
            System.out.println("6. Thay thế chuỗi con");
            System.out.println("7. Loại bỏ khoảng trắng thừa");
            System.out.println("8. Độ dài chuỗi");
            System.out.println("0. Thoát");
            System.out.print("Chọn một lựa chọn (0 ->8 ): ");
            choice = sc.nextInt();
            sc.nextLine() ;
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3: {
                    if (fullUpper()) {
                        System.out.println("Chuỗi là toàn chữ hoa.");
                    } else {
                        System.out.println("Chuỗi không phải toàn chữ hoa.");
                    }
                    break;
                }
                case 4:
                    isUpperCase();
                    break;
                case 5:
                    timkiem();
                    break;
                case 6:
                    thaythe();
                    break;
                case 7:
                    deleteSpaceHeadTail();
                    break;
                case 8:
                    lengthStrig();
                    break;
                case 0:
                    System.out.println("Thoát chương trình thành công !!");
                    return ;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

    public void nhap() {
        System.out.print("Nhập chuỗi: ");
        str = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Chuỗi nhập vào là: " + str);
    }

    // Kiểm tra xem chuỗi có phải toàn chữ hoa hay không
    public boolean fullUpper() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count == str.length();
    }

    // Chuyển đổi chuỗi sang chữ hoa
    public void isUpperCase() {
        str = str.toUpperCase();
        System.out.println("Result: " +str);
    }

    // Tìm kiếm chuỗi con
    public void timkiem() {
        int index = str.indexOf("world");
        System.out.println("Result: " +index); // 6
    }

    // Thay thế chuỗi con
    public void thaythe() {
        str = str.replace("world", "Java");
        System.out.println("Result: " +str); // Hello Java!
    }

    // Loại bỏ các ký tự khoảng trắng thừa ở đầu và cuối chuỗi
    public void deleteSpaceHeadTail() {
        str = str.trim();
        System.out.println("Result: " +str); // HelloJava!
    }

    // Trả về độ dài của chuỗi
    public void lengthStrig() {
        int length = str.length();
        System.out.println("Result: " +length); // 10
    }

}
