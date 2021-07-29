package zero.programmer.factory_method.dua;

public interface Animal {

    void speak();

}

@Deprecated
class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("roar");
    }
}

class Tiger2 implements Animal {
    @Override
    public void speak() {
        System.out.println("roar");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("meow");
    }
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("gug");
    }
}
