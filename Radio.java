/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan56_UmurBarangAntik;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi menampilkan umur barang antik
 */
public class Radio extends BarangAntik {
    private String name;
    
    public Radio(int umur){
        super(umur);
        this.umur = umur;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
