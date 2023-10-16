package Point_vip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo hình tròn
        Point center = new Point(1, 2);
        System.out.println("Nhập bán kính đường tròn: ");
        int r = scanner.nextInt();
        CIRCLE circle = new CIRCLE(center, r);

        // Tính diện tích hình tròn
        double area = circle.getArea();
        System.out.println("Diện tích hình tròn là: " + area);

        // Tạo hình trụ
        System.out.println("Nhập chiều cao : ");
        int height = scanner.nextInt();
        Cylinder cylinder = new Cylinder(center, r, height);

        // Tính diện tích hình trụ
        area = cylinder.getArea();
        System.out.println("Diện tích hình trụ là: " + area);

        // Tính thể tích hình trụ
        double volume = cylinder.getVolume();
        System.out.println("Thể tích hình trụ là: " + volume);
    }
}
