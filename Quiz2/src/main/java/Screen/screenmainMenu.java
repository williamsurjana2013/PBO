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
import javax.swing.JPanel;

/**
 *
 * @author willi
 */
public class screenmainMenu {
    JButton InsertData;
    public screenmainMenu(){
        JFrame frame = new JFrame("MY ITHB");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true); 
        
        
        JPanel panel = new JPanel();
        panel.setBounds(50, 70, 500, 700);
        
        JLabel label;
        label = new JLabel("My ITHB");
        label.setBounds(120, 50, 300, 30);
        JPanel labell = new JPanel();
        panel.add(labell);
        frame.add(label);
        
        JButton jurBaru;
        jurBaru = new JButton("Insert Data Jurusan Baru");
        jurBaru.setBounds(179, 100, 100, 30);
        jurBaru.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenmainMenu();
            }
            
        });
        JPanel cust = new JPanel();
        panel.add(cust);
        frame.add(jurBaru);
       
        JButton semJurusan;
        semJurusan = new JButton("Insert Data Semua Jurusan");
        semJurusan.setBounds(179, 150, 100, 30);
        semJurusan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenmainMenu();
            }
            
        });
        JPanel cashierpanel = new JPanel();
        panel.add(cashierpanel);
        frame.add(semJurusan);
        
        JButton mhsBaru;
        mhsBaru = new JButton("Insert Mahasiswa baru");
        mhsBaru.setBounds(179, 200, 100, 30);
        JPanel managerpanel = new JPanel();
        panel.add(managerpanel);
        frame.add(mhsBaru);
        
        JButton dataMhs;
        dataMhs = new JButton("Lihat Data Mahasiswa Per jurusan");
        dataMhs.setBounds(179, 250, 100, 30);
        frame.add(dataMhs);
    }
}

