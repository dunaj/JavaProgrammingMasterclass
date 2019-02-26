package pl.adulek;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
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

    public double distance(int x, int y) {
        return Math.sqrt((double)Math.abs((this.x - x) * (this.x - x) +(this.y - y) * (this.y - y)));
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
}
