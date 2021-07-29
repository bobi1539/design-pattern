package zero.programmer.prototype;

public class PrototypeApp {
    public static void main(String[] args) {

        Store store1 = new Store("Toko X", "Jakarta", "Indonesia", "Gadget");

        Store store2 = (Store) store1.clone();
        store2.setName("Toko Y");

        Store store3 = (Store) store1.clone();
        store3.setName("Toko Z");
        store3.setCity("Bandung");

        Store store4 = (Store) store3.clone();
        store4.setName("Toko W");
        store4.setCategory("Fashion");

        System.out.println("city store 4 : " + store4.getCity());
        System.out.println("category store 4 : " + store4.getCategory());

    }
}
