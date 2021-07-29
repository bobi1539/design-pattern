package zero.programmer.factory_method.dua;

public class AnimalApp {

    public static void main(String[] args) {

        Tiger2 tiger2 = (Tiger2) AnimalFactory.create("tiger");
        tiger2.speak();

        Cat cat = (Cat) AnimalFactory.create("cat");
        cat.speak();

        Dog dog = (Dog) AnimalFactory.create("dog");
        dog.speak();

        Dog dog2 = (Dog) AnimalFactory.create("dog");
        dog2.speak();

    }
}
