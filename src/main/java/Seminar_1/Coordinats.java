package Seminar_1;

public class Coordinats {
    int x;
    int y;

    public Coordinats(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getPosition() {
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %d", x, y);
    }

    public int getDistance(Coordinats targetPosition) {
        return (int) Math.sqrt(Math.pow(x - targetPosition.getPosition()[0], 2) + Math.pow(y - targetPosition.getPosition()[1], 2));
    }
}
