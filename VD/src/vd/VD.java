/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd;

/**
 *
 * @author asus
 */
public class VD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double d = 12.3;
        Decrementer dec = new Decrementer();
        dec.decrement(d);
        System.out.println(d);
        char c = '\u1234';
         System.out.println(c);
    }
}

class Decrementer {

    public void decrement(double decMe) {
        decMe = decMe - 1.0;
    }
}
