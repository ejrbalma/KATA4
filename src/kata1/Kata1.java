/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author EnriqueJosé
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Inici");
        Person mipersona = new Person("Enrique", new Date(69, 5, 2));
        System.out.println(mipersona.getName());
        System.out.println(mipersona.getBirthdya());
        System.out.println(mipersona.getAge());

        System.out.println("Fin ");
    }

}
