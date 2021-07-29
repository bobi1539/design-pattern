package zero.programmer.abstract_factory;

public interface GameFactory {
    Level createLevel();
    Arena createArena();
    Enemy createEnemy();
}

class gameFactoryEasy implements GameFactory {

    @Override
    public Level createLevel() {
        return new LevelEasy();
    }

    @Override
    public Arena createArena() {
        return new ArenaEasy();
    }

    @Override
    public Enemy createEnemy() {
        return new EnemyEasy();
    }
}

class gameFactoryMedium implements GameFactory {

    @Override
    public Level createLevel() {
        return new LevelMedium();
    }

    @Override
    public Arena createArena() {
        return new ArenaMedium();
    }

    @Override
    public Enemy createEnemy() {
        return new EnemyMedium();
    }
}

class gameFactoryHard implements GameFactory {

    @Override
    public Level createLevel() {
        return new LevelHard();
    }

    @Override
    public Arena createArena() {
        return new ArenaHard();
    }

    @Override
    public Enemy createEnemy() {
        return new EnemyHard();
    }
}
