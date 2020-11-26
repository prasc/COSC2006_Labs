import java.io.Serializable;

public class MyPoint implements Serializable {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyPoint) {
            return (((MyPoint) obj).getX() == x && ((MyPoint) obj).getY() == y);
        }
        return false;
    }

    @Override
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }
}
