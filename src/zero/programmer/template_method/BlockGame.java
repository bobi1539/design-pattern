package zero.programmer.template_method;

public class BlockGame extends BlockTemplate{

    @Override
    public String getTitle() {
        return "BLOCK GAME";
    }

    @Override
    public String getEndTitle() {
        return "FINISH BLOCK GAME";
    }

    @Override
    public String getCharacter() {
        return "O";
    }

    @Override
    public int getHeight() {
        return 10;
    }

    @Override
    public int getWidth() {
        return 10;
    }
}
