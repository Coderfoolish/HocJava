package Point_vip;

public class Line {
    protected Point_vip.Point A;
    protected Point_vip.Point B;

    public Line() {
        A = new Point();
        B = new Point();
    }

    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    // Phương thức tính khoảng cách giữa hai điểm A và B
    public double distance() {
        return Math.sqrt((B.getX() - A.getX()) * (B.getX() - A.getX()) + (B.getY() - A.getY()) * (B.getY() - A.getY()));
    }

    // Phương thức tính hoành độ giao điểm của đường thẳng với trục Ox
    public double xIntercept() {
        if (slope() == 0) {
            return 0;
        } else {
            return -yIntercept() / slope();
        }
    }

    // Phương thức tính tung độ giao điểm của đường thẳng với trục Oy
    public double yIntercept() {
        return A.getY() - slope() * A.getX();
    }

    // Phương thức tính độ dốc của đường thẳng
    public double slope() {
        return (B.getY() - A.getY()) / (B.getX() - A.getX());
    }

    // Phương thức toString() để hiển thị thông tin của đường thẳng
    @Override
    public String toString() {
        return "Line{" + "A=" + A + ", B=" + B + '}';
    }
}
