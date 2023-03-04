/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author M S I
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
   private int tinggi; 

    public Tabung(int tinggi, int jari_jari) {
        super(jari_jari);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
     return super.keliling()*(super.jari_jari+tinggi);
    }
    @Override
    public double volume() {
     return super.luasBidang()*tinggi;
        
    }

   
    
}
