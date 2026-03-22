package practice4.problem3;

public class App {
    public static void getStatistics(Game g) {
        g.a();
        g.b();
        g.c();
    }
    public static void main(String[] args) {
        Game logicGame = new LogicGame();
        Game memoryGame = new MemoryGame();
        getStatistics(logicGame);
        getStatistics(memoryGame);
    }
}
