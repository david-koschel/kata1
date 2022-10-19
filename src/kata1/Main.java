package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(2002, 9, 6);
	    Person persona = new Person("Juan", date);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años");
    }

}