package practicalTask.secondTask;

/**
 * Created by prots on 01.05.2017.
 */
public class Student extends Person {

    public Student(String name) {
        setName(name);
    }
    public String setName(String name){
        return name;
    }

    @Override
    public String print() {
        return "I'm a Student.";
    }
}
