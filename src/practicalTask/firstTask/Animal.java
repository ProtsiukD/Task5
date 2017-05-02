package practicalTask.firstTask;

/**
 * Created by prots on 01.05.2017.
 */
public interface Animal {
    public String voice();

    public String feed();

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Animal[] animals = {cat1, cat2, cat3, dog1, dog2, dog3};
        for (Animal a:animals){
            System.out.println(a.voice());
            System.out.println(a.feed());
        }
    }
}
