package org.example.week4.RectangleTest;

public class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void moveBy(int x, int y){
        p1.setX(p1.getX() +x);
        p2.setX(p2.getX() +x);
        p1.setY(p1.getY()+y);
        p2.setY(p2.getY()+ y);
    }

    public void moveBy(int value){
        p1.setX(p1.getX() +value);
        p2.setY(p2.getY()+ value);
        p2.setX(p2.getX() +value);
        p1.setY(p1.getY()+ value);
    }


    @Override
    public String toString() {
        return String.format("Rectangle[(%d, %d), (%d, %d)]",p1.getX(),p1.getY(), p2.getX(), p2.getY());
    }
}
