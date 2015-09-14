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

        System.out.println("Inicio");
        Person mipersona = new Person("Enrique", new Date(69, 5, 2));
        System.out.println(mipersona.getName());
        System.out.println(mipersona.getBirthday());
        System.out.println(mipersona.getAge());
        Person mipersona1 = new Person("Juan", new Date(64, 7, 3));
        System.out.println(mipersona1.getName());
        System.out.println(mipersona1.getBirthday());
        System.out.println(mipersona1.getAge());

        System.out.println("Fin ");
    }

}
