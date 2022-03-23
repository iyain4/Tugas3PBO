/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Nisrina AZ - 123200042
 */
public class Persegi implements MenghitungBidang{
    public double panjang;
    public double lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double luas(){
        return this.panjang*this.lebar;
    }
    
    @Override
    public double keliling(){
        return 2*(this.panjang+this.lebar);
    }
}
