package lab3.problem2;

public interface Sprintable extends Moveable {
    void startSprinting();
    void stopSprinting();
    boolean isSprinting();
    double getSpeed();
    void setSpeed(double speed);
}
