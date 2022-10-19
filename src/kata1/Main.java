package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Person persona = new Person("Juan", new Date(102, 9, 6));
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años");
    }

}