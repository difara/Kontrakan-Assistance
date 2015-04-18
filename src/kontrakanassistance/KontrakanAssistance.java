/*
 *project di buat dengan asumsi hanya ada 4 aggota dalam satu kontra
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
            Kontrakan1.member2.setNama("lololi");
        } catch (Exception ex) {
            System.out.println("terjadi Error pada nama anggota:");
            System.out.println(ex.getMessage());
        }
        System.out.println(Kontrakan1.member2.getnama());

        try {
            Kontrakan1.member.setoran.set("20000");
        } catch (Exception ex) {
            System.out.println("terjadi error pada pengisian setoran :");
            System.out.println(ex.getMessage());
        }

        try {
            Kontrakan1.member.piket.setpiket("senin");
        } catch (Exception e) {
            System.out.println("terjadi error pada pengisian piket:");
            System.out.println(e.getMessage());
        }

        System.out.print("piket " + Kontrakan1.member.getnama() + " pada hari ");
        System.out.println(Kontrakan1.member.piket.getpiket());

       

        try {
            Kontrakan1.member.hutang.set("10000");
        } catch (Exception ex) {
            System.out.println("terjadi error pada pengisian hutang :");
            System.out.println(ex.getMessage());
        }
        
        System.out.println("keuangan kontrakan bulan ini:");
        Kontrakan1.total_saldo();//line (1)
        Kontrakan1.print_total_saldo();//line (2)
        System.out.println(Kontrakan1.get_total_saldo());//line (30
        Kontrakan1.print_total_tagihan();
        Kontrakan1.print_total_hutang();
        Kontrakan1.print_saldo_bersih();
        //masih aneh pak, setelah saya commit ke github disini jadi error ga jelas
        //kalau line (1) di hapus, line (2) sama line (3) valuenya jadi 0, itu kenapa ya pa? 
        //error ini berlaku di semua method yang perlu fetching value variabel dari Class Kontrakan

    }

}
