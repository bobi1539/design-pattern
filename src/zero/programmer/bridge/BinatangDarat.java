package zero.programmer.bridge;

public abstract class BinatangDarat implements Binatang{
    @Override
    public boolean hidupDiAir() {
        return false;
    }

    @Override
    public boolean hidupDiDarat() {
        return true;
    }

    public abstract Integer getJumlahKaki();
}
