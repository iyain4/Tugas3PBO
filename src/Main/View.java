/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.*;
import javax.swing.*;
import ruang.Balok;

/**
 *
 * @author Nisrina AZ - 123200042
 */
public class View extends JFrame implements ActionListener {
    JLabel labelJudul = new JLabel("KALKULATOR BALOK");
    
    JLabel labelPanjang = new JLabel("Panjang");
    JTextField textFieldPanjang = new JTextField(5);
    JLabel labelLebar = new JLabel("Lebar");
    JTextField textFieldLebar = new JTextField(5); 
    JLabel labelTinggi = new JLabel("Tinggi");
    JTextField textFieldTinggi = new JTextField(5);
       
    JLabel labelHasil = new JLabel("Hasil :");
    JLabel labelLuas = new JLabel();
    JLabel labelKeliling = new JLabel();
    JLabel labelLuasPermukaan = new JLabel();
    JLabel labelVolume = new JLabel();
       
    JButton buttonHitung = new JButton("Hitung");
    JButton buttonReset = new JButton("Reset");

    public View() {
        setTitle("Kalkulator Balok");
           
        setSize(500, 500);
        setLayout(null);
        add(labelJudul);
        add(labelPanjang);
        add(textFieldPanjang);
        add(labelLebar);
        add(textFieldLebar);
        add(labelTinggi);
        add(textFieldTinggi);
        
        add(labelHasil);
        add(labelLuas);
        add(labelKeliling);
        add(labelLuasPermukaan);
        add(labelVolume);
        
        add(buttonHitung);
        add(buttonReset);
           
       //Atur posisi
        labelJudul.setBounds(200,5,140,30);
        labelPanjang.setBounds(50,40,100,20);
        textFieldPanjang.setBounds(130,40,150,20);
        labelLebar.setBounds(50,65,100,20);
        textFieldLebar.setBounds(130,65,150,20);
        labelTinggi.setBounds(50,95,100,20);
        textFieldTinggi.setBounds(130,95,150,20);
       
        labelHasil.setBounds(145,150,100,30);
        labelLuas.setBounds(30,165,200,30);
        labelKeliling.setBounds(30,185,200,30);
        labelVolume.setBounds(30,210,200,30);
        labelLuasPermukaan.setBounds(30,235,200,30);
        
        buttonHitung.setBounds(100,300,80,20);
        buttonReset.setBounds(250,300,80,20);
           
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       
        buttonHitung.addActionListener(this);
        buttonReset.addActionListener(this);
       }
       
    @Override
    public void actionPerformed(ActionEvent e){
        double panjang, lebar, tinggi;
           
        if (e.getSource() == buttonHitung) {
            if (textFieldPanjang.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Panjang can not be empty!");
            } else if (textFieldLebar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lebar can not be empty!");
            } else if (textFieldTinggi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tinggi can not be empty!");
            } else {
                try {
                    panjang = Double.parseDouble(textFieldPanjang.getText());
                    lebar = Double.parseDouble(textFieldLebar.getText());
                    tinggi = Double.parseDouble(textFieldTinggi.getText());
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    labelLuas.setText("Luas Persegi               : " + balok.luas());
                    labelKeliling.setText("Keliling Persegi       : " + balok.keliling());
                    labelVolume.setText("Volume Balok             : " + balok.volume());
                    labelLuasPermukaan.setText("Luas Permukaan Balok  : " + balok.luasPermukaan());
                } catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "INPUT NUMBER!!!");
                }
            }
        }
           
        if (e.getSource() == buttonReset) {
            labelLuas.setText(" ");
            labelKeliling.setText(" ");
            labelLuasPermukaan.setText(" ");
            labelVolume.setText(" ");
            textFieldPanjang.setText("");
            textFieldLebar.setText("");
            textFieldTinggi.setText("");
        }
    }
}
