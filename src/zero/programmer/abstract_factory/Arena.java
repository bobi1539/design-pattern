package zero.programmer.abstract_factory;

public interface Arena {
    void start();
}

class ArenaEasy implements Arena{
    public void start(){
        System.out.println("Arena Easy");
    }
}

class ArenaMedium implements Arena{
    public void start(){
        System.out.println("Arena Medium");
    }
}

class ArenaHard implements Arena{
    public void start(){
        System.out.println("Arena Hard");
    }
}
