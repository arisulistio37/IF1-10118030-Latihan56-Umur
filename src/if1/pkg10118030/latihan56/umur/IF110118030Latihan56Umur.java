/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan56.umur;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi program : program ini berisi tentang tampilan umur barang antik
 */
public class IF110118030Latihan56Umur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        radio.setName("Radio");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
