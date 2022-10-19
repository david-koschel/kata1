package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private String name;
    private Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthdate = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) ((GregorianCalendar.getInstance().getTimeInMillis() -
                this.birthdate.getTimeInMillis())/MILLISECONDS_PER_YEAR);
    }

}
