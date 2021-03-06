package practicalTask.secondTask;

/**
 * Created by prots on 01.05.2017.
 */
public class Teacher extends Staff {
    private double rate;
    private int hours;

    public Teacher(double rate, int hours, String name) {
        setRate(rate);
        setHours(hours);
        setName(name);
    }

    public double getRate() {

        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String setName(String name){
        return name;
    }
    public String getName(){
        return name;
    }
    @Override
    public double salary() {
        return getRate()*(double)getHours();
    }

    @Override
    public String print(){
        return "I'm a teacher.";
    }
}
