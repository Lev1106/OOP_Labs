package lab3.problem6;

public interface Trainable {
    void learnCommand(String command);
    boolean canPerform(String command);
}
