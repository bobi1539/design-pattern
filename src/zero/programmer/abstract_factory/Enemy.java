package zero.programmer.abstract_factory;

public interface Enemy {
    void start();
}

class EnemyEasy implements Enemy{
    public void start(){
        System.out.println("Enemy Easy");
    }
}

class EnemyMedium implements Enemy{
    public void start(){
        System.out.println("Enemy Medium");
    }
}

class EnemyHard implements Enemy{
    public void start(){
        System.out.println("Enemy Hard");
    }
}