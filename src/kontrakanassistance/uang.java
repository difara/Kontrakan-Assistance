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
public class uang {

    private int duid;
    
    public uang (){
        
    }

    public void set(String uang) throws Exception {
        try {
            Integer.parseInt(uang);
        } catch (Exception e) {
            throw new Exception(" harus berupa angka");
        }

        this.duid = Integer.parseInt(uang);
    }

    public int get() {
        return duid;
    }

}
