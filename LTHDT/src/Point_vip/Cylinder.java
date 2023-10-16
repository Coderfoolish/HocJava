package Point_vip;

public class Cylinder extends CIRCLE {
    protected int height;

    public Cylinder() {
        super();
        height = 1;
    }

    public Cylinder(Point center, int r, int height) {
        super(center, r);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Phương thức tính diện tích xung quanh của hình trụ
    public double getArea() {
        return super.getArea() * 2 * height;
    }

    // Phương thức tính thể tích của hình trụ
    public double getVolume() {
        return Math.PI * r * r * height;
    }

    // Phương thức toString() để hiển thị thông tin của hình trụ
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", " + super.toString() +
                '}';
    }
}
