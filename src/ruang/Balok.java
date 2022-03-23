/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.Persegi;

/**
 *
 * @author Nisrina AZ - 123200042
 */
public class Balok extends Persegi implements MenghitungRuang{
    double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return this.luas()*this.tinggi;
    }
    
    @Override
    public double luasPermukaan(){
        return 2*((this.panjang*this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
    }
}
