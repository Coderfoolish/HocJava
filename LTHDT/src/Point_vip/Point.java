package Point_vip;

public class Point {
    protected int x ;
    protected int y ;
    public Point()
    {
        this.x = 0 ;
        this.y = 0 ;
    }
    public Point(int x , int y)
    {
        this.x=  x ;
        this.y = y ;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double getDistance(Point p) {
        return Math.sqrt((double)(p.getX() - x) * (double)(p.getX() - x) + (double)(p.getY() - y) * (double)(p.getY() - y));
    }
}