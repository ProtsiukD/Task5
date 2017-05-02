package practicalTask.secondTask;

/**
 * Created by prots on 01.05.2017.
 */
public abstract class Person {
    protected String name;

    public abstract String print();

    public static void main(String[] args) {
        Student student1 = new Student("Andre");
        Student student2 = new Student("Jack");
        Student student3 = new Student("Den");

        Teacher teacher1 = new Teacher(36.5, 11, "Christie");
        Teacher teacher2 = new Teacher(46.6, 12, "Alla");
        Teacher teacher3 = new Teacher(56.7, 10, "Nina");

        Cleaner cleaner1 = new Cleaner(12.3, 14, "Marina");
        Cleaner cleaner2 = new Cleaner(12.99, 14, "Jane");
        Cleaner cleaner3 = new Cleaner(15, 14, "Inna");

        Person[] people = {teacher1,teacher2,teacher3,cleaner1,cleaner2,cleaner3,student1,student2,student3};
        for (Person person:people){
            System.out.println(person.print());
        }
            System.out.println(teacher1.salary());
            System.out.println(teacher2.salary());
            System.out.println(teacher3.salary());

            System.out.println(cleaner1.salary());
            System.out.println(cleaner2.salary());
            System.out.println(cleaner3.salary());
    }
}