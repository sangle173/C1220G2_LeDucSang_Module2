package _04_object.exercises;

public class Fan {
    public static final byte SLOW = 1;
    public static final byte MEDIUM = 2;
    public static final byte FAST = 3;
    private int speed;
    private boolean isStatus;
    private int radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.isStatus = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean Status) {
        isStatus = Status;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String displayFan() {
        return "Fan{" +
                "speed=" + speed +
                ", isStatus=" + isStatus +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        //fan 1
        fan1.setStatus(true);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setSpeed(FAST);
        //fan 2
        fan2.setStatus(false);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setSpeed(MEDIUM);
        System.out.println("Fan 1 info :" + fan1.displayFan());
        System.out.println("Fan 2 info :" + fan2.displayFan());

    }
}
