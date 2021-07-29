package zero.programmer.abstract_factory;

public interface Level {
    void start();
}

class LevelEasy implements Level {
    public void start(){
        System.out.println("Level Easy");
    }
}

class LevelMedium implements Level {
    public void start(){
        System.out.println("Level Medium");
    }
}

class LevelHard implements Level {
    public void start(){
        System.out.println("Level Hard");
    }
}
