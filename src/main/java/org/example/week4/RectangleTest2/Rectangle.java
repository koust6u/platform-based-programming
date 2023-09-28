package org.example.week4.RectangleTest2;

public class Rectangle {

    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    public Rectangle(Rectangle other){

        this.p1 = new Point(other.getP1().getX(), other.getP1().getY());
        this.p2 = new Point(other.getP2().getX(), other.getP2().getY());
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void moveBy(int x, int y){
        p1.setX(p1.getX() +x);
        p2.setX(p2.getX() +x);

        p1.setY(p1.getY()+y);
        p2.setY(p2.getY()+ y);
    }
    @Override
    public String toString() {
        return String.format("Rectangle[(%d, %d), (%d, %d)]",p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
