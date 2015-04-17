/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrakanassistance;

/**
 *
 * @author Z 400
 */
import java.util.*;
import java.io.*; // untuk mengantisipasi kalau second user 
                  //mau pakai input dari pengguna

public class KontrakanAssistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Kontrakan Kontrakan1 = new Kontrakan();
        try {
            Kontrakan1.member.setNama("lolol");
        } catch (Exception ex) {
            System.out.println("terjadi Error pada nama anggota:");
            System.out.println(ex.getMessage());
        }
        System.out.println(Kontrakan1.member.getnama());

        try {
            Kontrakan1.member.setoran.set("20000");
        } catch (Exception ex) {
            System.out.println("terjadi error pada pengisian setoran :");
            System.out.println(ex.getMessage());
        }
        System.out.println(Kontrakan1.get_total_saldo());

        try {
            Kontrakan1.member.piket.setpiket("senin");
        } catch (Exception e) {
            System.out.println("terjadi error pada pengisian piket:");
            System.out.println(e.getMessage());
        }
        
        System.out.print("piket"+Kontrakan1.member.getnama()+"pada hari");
        System.out.println(Kontrakan1.member.piket.getpiket());
        
        System.out.println(Kontrakan1.get_total_tagihan());
        
       
        
        try {
            Kontrakan1.member.hutang.set("10000");
        } catch (Exception ex){
            System.out.println("terjadi error pada pengisian hutang :");
            System.out.println(ex.getMessage());
        }
        
        System.out.println(Kontrakan1.get_nett_saldo());
        
        
    }

}
