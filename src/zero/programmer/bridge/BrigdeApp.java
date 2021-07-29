package zero.programmer.bridge;

import java.util.Arrays;
import java.util.List;

public class BrigdeApp {
    public static void main(String[] args) {

        List<Binatang> binatangs = Arrays.asList(
                new Anjing(),
                new Kucing(),
                new Koi(),
                new Hiu()
        );

        binatangs.forEach(binatang -> {
            if (binatang instanceof BinatangAir){
                BinatangAir binatangAir = (BinatangAir) binatang;
                System.out.println(binatangAir.getNama() + " hidup di air");
            } else if (binatang instanceof BinatangDarat){
                BinatangDarat binatangDarat = (BinatangDarat) binatang;
                System.out.println(binatangDarat.getNama() + " hidup di darat dan jumlah kaki : "
                        + binatangDarat.getJumlahKaki());
            }
        });

    }
}
