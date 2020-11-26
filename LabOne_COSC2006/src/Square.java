import java.io.Serializable;

public class Square extends Rectangle implements Serializable {
    Square() {
        this(1);
    }

    Square(int size) {
        if (size >= 0) {
            setWidth(size);
            setHeight(size);
        }
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }

    public int getSize() {
        return super.getHeight();
    }

    public void setSize(int size) {
        super.setHeight(size);
        super.setWidth(size);
    }

    @Override
    public String toString() {
        return ("String: " + getSize() + " x " + getSize() + " at " + getLocation().toString());
    }
}
