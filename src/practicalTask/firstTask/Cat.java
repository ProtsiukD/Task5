package practicalTask.firstTask;

/**
 * Created by prots on 01.05.2017.
 */
public class Cat implements Animal {

    @Override
    public String voice() {
        return "May-May";
    }

    @Override
    public String feed() {
        return "I'm like eat a Whiskas";
    }
}
