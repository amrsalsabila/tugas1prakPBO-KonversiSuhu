/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

/**
 *
 * @author Amara Salsabila
 */
public class Konversi {
    double Celcius(){
        return(Main.suhuAwal);
    }
    double rumusFahrenheit(){
        return(Main.suhuAwal*1.8+32);
    }
    double rumusReamur(){
        return(Main.suhuAwal*0.8);
    }
    double rumusKelvin(){
        return(Main.suhuAwal+273.15);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
