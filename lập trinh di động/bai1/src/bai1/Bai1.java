/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBT1 ptb1= new PBT1(10,20);
        System.out.println("a=" +ptb1.gethsa());
        System.out.println("b=" +ptb1.gethsb());
        ptb1.sethsa(5);
        ptb1.sethsb(10);
        System.out.println("a=" +ptb1.gethsa());
        System.out.println("a=" +ptb1.gethsa());
        System.out.println(ptb1.GiaiB1());
    }
   
}
