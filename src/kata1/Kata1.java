/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author EnriqueJosé
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Inicio");
        Calendar c1 = GregorianCalendar.getInstance();
        c1.set(1969,5,2);
        Person mipersona = new Person("Enrique", c1);
        System.out.println(mipersona.getName());
        System.out.println(mipersona.getBirthday().getTime());
        System.out.println(mipersona.getAge());
        
        c1.set(1964,7,3);
        Person mipersona1 = new Person("Juan", c1);
        System.out.println(mipersona1.getName());
        System.out.println(mipersona1.getBirthday().getTime());
        System.out.println(mipersona1.getAge());

        System.out.println("Fin ");
    }

}
