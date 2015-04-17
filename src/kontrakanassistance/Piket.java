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
public class Piket {

    private String piket;
    
    public void piket(){
        
    }

    public void setpiket(String hari) throws Exception {
        switch (hari) {
            case "senin":
                this.piket = hari;
                break;
            case "selasa":
                this.piket = hari;
                break;
            case "rabu":
                this.piket = hari;
                break;
            case "kamis":
                this.piket = hari;
                break;
            case "jumat":
                this.piket = hari;
                break;
            case "sabtu":
                this.piket = hari;
                break;
            case "minggu":
                this.piket = hari;
                break;
            default:
                throw new Exception("hanya bisa diisi oleh hari dalam bahasa"
                        + " Indonesia dengan huruf kecil semua");
        }
    }

    public String getpiket() {
        return piket;

    }
}
