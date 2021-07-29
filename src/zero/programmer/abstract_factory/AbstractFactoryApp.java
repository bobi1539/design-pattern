package zero.programmer.abstract_factory;

public class AbstractFactoryApp {
    public static void main(String[] args) {

        Game gameEasy = new Game(new gameFactoryEasy());
        gameEasy.start();

        Game gameMedium = new Game(new gameFactoryMedium());
        gameMedium.start();

        Game gameHard = new Game(new gameFactoryHard());
        gameHard.start();
    }
}
