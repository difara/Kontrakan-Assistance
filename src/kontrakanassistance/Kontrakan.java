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
public class Kontrakan {

    Anggota member = new Anggota();
    Anggota member1 = new Anggota ();
    Anggota member2 = new Anggota ();
    Anggota member3 = new Anggota ();
    private int saldo;
    uang tagihan_Listrik = new uang (); // bisa di tambah
    private int totta;
                 //totta = total tagihan
    private int nett;
    private int totalhutang;
           
        
        public void total_tagihan(){
           int spend = this.tagihan_Listrik.get();//bisa di tambah tagihan lain lain
           this.totta = spend;
        }
        
        public int get_total_tagihan(){
            return totta;
        }
    
        public void total_saldo(){
           int save = this.member.setoran.get();//bisa di tambah setoran setoran
           this.saldo = save;
        }

        public int get_total_saldo(){
            return saldo ;
        }
        
        public void nett_saldo(){
            int bersih = this.saldo - this.totta-this.totalhutang;
            this.nett = bersih;
        }
        
        public int get_nett_saldo(){
            return nett;
        }
        
        public void total_hutang (){
            int utang= this.member.hutang.get();
            this.totalhutang=utang;
        }
        
}
        
    
