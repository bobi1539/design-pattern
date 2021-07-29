package zero.programmer.template_method;

public class BlockGame2 extends BlockTemplate{

    @Override
    public String getTitle() {
        return "BLOCK GAME 2";
    }

    @Override
    public String getEndTitle() {
        return "FINISH BLOCK GAME 2";
    }

    @Override
    public String getCharacter() {
        return "X";
    }

    @Override
    public int getHeight() {
        return 10;
    }

    @Override
    public int getWidth() {
        return 20;
    }
}
