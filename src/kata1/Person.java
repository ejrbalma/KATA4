package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthdya;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

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
        return (int)(millisecondstoYear(today.getTime()-birthdya.getTime()));
    }
    
    private int millisecondstoYear (long millis){
        return (int) (millis/MILLISECONDS_PER_YEAR);
    }
}
