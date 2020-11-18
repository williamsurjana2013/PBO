/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author willi
 */
public class ScreenMhsBaru {
    public ScreenMhsBaru(){
        JFrame frame = new JFrame("Mahasiswa Baru");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Masukan Mahasiswa Baru");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel nim;
        nim = new JLabel("NIM");
        nim.setBounds(120, 100, 100, 30);
        frame.add(nim);
        JTextField Nim;
        Nim = new JTextField();
        Nim.setBounds(210, 100, 157, 30);
        frame.add(Nim);
        
        JLabel nama;
        nama = new JLabel("Nama");
        nama.setBounds(120, 150, 100, 30);
        frame.add(nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 150, 157, 30);
        frame.add(fieldNama);
        
        JLabel angkatan;
        angkatan = new JLabel("Angkatan");
        angkatan.setBounds(120, 200, 100, 30);
        frame.add(angkatan);
        JTextField fieldangkatan;
        fieldangkatan = new JTextField();
        fieldangkatan.setBounds(210, 200, 157, 30);
        frame.add(fieldangkatan);
        
        
        JLabel kode_jurusan;
        kode_jurusan = new JLabel("Kode Jurusan");
        kode_jurusan.setBounds(120, 250, 100, 30);
        frame.add(kode_jurusan);
        JTextField fieldKJ;
        fieldKJ = new JTextField();
        fieldKJ.setBounds(210, 250, 157, 30);
        frame.add(fieldKJ);
        
        
        JButton save;
        save = new JButton("Save");
        save.setBounds(355, 500, 70, 30);
        frame.add(save);
        
        JButton back;
        back = new JButton("Back");
        back.setBounds(355, 550, 70, 30);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new ScreenMhsBaru();
            }
            
        });
        frame.add(back);
        
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
