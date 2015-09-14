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
        return 0;
    }
}
