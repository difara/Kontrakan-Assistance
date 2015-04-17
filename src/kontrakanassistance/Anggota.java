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
public class Anggota {

    private String Nama;
    Piket piket = new Piket();
    uang setoran = new uang();
    uang hutang = new uang();

    public void setNama(String nama) throws Exception {
        for (char n : nama.toCharArray()) {
            if (Character.isDigit(n)) {
                throw new Exception("nama tidak boleh mengandung"
                        + " angka");
            }
        }

        this.Nama = nama;
    }

    public String getnama() {
        return Nama;
    }
    
    public void cek_hutang(String utang) throws Exception{
        if(this.hutang.get() >= this.setoran.get())
        {
            System.out.println("maaf saldo kontribusi anda terhadap kontrakan"+
                    " masih kurang untuk berhutang sebesar itu");
            System.out.println("silahkan naikan kontribusi anda");
        }
        else {
            System.out.println("permintaan hutang anda dapat di terima");
            System.out.println("silahkan hubungi bendahara");
        }
    }
    
    


}

