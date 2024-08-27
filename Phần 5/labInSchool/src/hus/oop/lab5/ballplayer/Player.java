package hus.oop.lab5.ballplayer;

public class Player {
    private int number;
    private float x, y, z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        return Math.sqrt(Math.pow((x - ball.getX()), 2) - Math.pow((y - ball.getY()), 2)) < 8;
    }

    public void kick(Ball ball) {
        ball.setXYZ(ball.getX() + 10, ball.getY() + 10, ball.getZ() + 100);
    }
}
