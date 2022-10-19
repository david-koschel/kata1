package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthdate = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(this.birthdate, today).getYears();
    }

}
