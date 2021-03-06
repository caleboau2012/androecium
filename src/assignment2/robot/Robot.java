package assignment2.robot;

/**
 * Created by KayLee on 08/03/2018.
 */
public class Robot {
    int x;
    int y;
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    public static final int LEFT_UP_CORNER = 5;
    public static final int LEFT_DOWN_CORNER = 6;
    public static final int RIGHT_UP_CORNER = 7;
    public static final int RIGHT_DOWN_CORNER = 8;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Robot(int x, int y){
        this.x = x;
        this.y = y;
    }
}
