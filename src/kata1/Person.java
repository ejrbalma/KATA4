package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthdya;

    public Person(String name, Date birthdya) {
        this.name = name;
        this.birthdya = birthdya;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdya() {
        return birthdya;
    }
    
    public int getAge(){
        Date today = new Date();
        int age = (int) ((today.getTime()-birthdya.getTime())/(1000*60*60*24*365.25));
        return age;
    }
}
