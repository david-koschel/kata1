package kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 9, 6);
	    Person persona = new Person("Juan", date);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años");
    }

}