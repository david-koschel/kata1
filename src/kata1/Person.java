package kata1;

import java.util.Date;

public class Person {

    private String name;
    private Date birthdate;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthdate = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
}
