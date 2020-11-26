import org.w3c.dom.css.Rect;

import java.io.Serializable;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>, Serializable {
    private int width = 1;
    private int height = 2;
    private MyPoint location = new MyPoint(5, 10);

    Rectangle() {
        this (1, 2);
    }

    Rectangle(int x, int y) {
        super("black", true);
        setWidth(x);
        setHeight(y);
    }

    public MyPoint getLocation() {
        return location;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * (height + width));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            return (((Rectangle) obj).getHeight() == getHeight() && ((Rectangle) obj).getWidth() == getWidth());
        }
        return false;
    }

    @Override
    public int compareTo(Rectangle rec) {
        if (getArea() > ((Rectangle) rec).getArea())
            return 1;
        else if (getArea() < ((Rectangle) rec).getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return ("Rectangle: " + width + " x " + height + " at " + location.toString());
    }
}