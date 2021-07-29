package zero.programmer.factory_method.dua;

public class AnimalFactory {

    public static Animal create(String type){
        if (type.equals("tiger")){
            return new Tiger2();
        } else if (type.equals("cat")){
            return new Cat();
        } else if (type.equals("dog")){
            return new Dog();
        }
        return null;
    }
}
