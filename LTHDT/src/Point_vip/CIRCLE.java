package Point_vip;

public class CIRCLE {
    protected Point center;
    protected int r;

    public CIRCLE() {
        center = new Point();
        r = 1;
    }

    public CIRCLE(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    // Phương thức tính diện tích của hình tròn
    public double getArea() {
        return Math.PI * r * r;
    }

    // Phương thức tính chu vi của hình tròn
    public double getCircumference() {
        return 2 * Math.PI * r;
    }

    // Phương thức kiểm tra xem điểm P có nằm trong hình tròn hay không
    public boolean contains(Point P) {
        double distance = Math.sqrt((P.getX() - center.getX()) * (P.getX() - center.getX()) + (P.getY() - center.getY()) * (P.getY() - center.getY()));
        return distance <= r;
    }

    // Phương thức toString() để hiển thị thông tin của hình tròn
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }
}
