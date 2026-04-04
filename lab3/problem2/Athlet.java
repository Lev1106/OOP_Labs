package lab3.problem2;

public class Athlet implements Sprintable {
    private boolean sprinting;
    private double speed;
    @Override
    public void move() {
        System.out.println("Athlet moving");
    }
    @Override
    public void startSprinting() {
        sprinting = true;
    }
    @Override
    public void stopSprinting() {
        sprinting = false;
    }
    @Override
    public boolean isSprinting() {
        return sprinting;
    }
    @Override
    public double getSpeed() {
        return speed;
    }
    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
