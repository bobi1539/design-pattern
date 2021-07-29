package zero.programmer.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {
    public static void main(String[] args) {

        List<CatalogAdapter> list = new ArrayList<>();

        list.add(new BookCatalogAdapter(new Book("Pemrograman Java", "Ucup")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman PHP", "Tono")));
        list.add(new BookCatalogAdapter(new Book("Pemrograman Python", "Mario")));

        list.add(new ScreencastCatalogAdapter(new Screencast("Web laravel", "Joni", 100L)));
        list.add(new ScreencastCatalogAdapter(new Screencast("Web codeigniter", "Tono", 100L)));
        list.add(new ScreencastCatalogAdapter(new Screencast("React Native", "Otong", 100L)));

        list.forEach(item -> {
            System.out.println(item.getCatalogTitle());
        });

    }
}
