import java.awt.*;
import java.io.Serializable;

public abstract class Food implements Drawable, Effect, Serializable {
    protected int x, y;
    protected static final int SIZE = GamePanel.UNIT_SIZE;

    public Food(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, SIZE, SIZE);
    }
}
