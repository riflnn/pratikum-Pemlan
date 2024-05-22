package pratikum.GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class Overlay extends JFrame {
    public Overlay(String nama, String tanggalLahir, String noReg, String noTlpn, String address, String email) {
        setTitle("Data Mahasiswa");
        setLayout(null);

        JLabel judul = new JLabel("Data Mahasiswa");
        judul.setOpaque(true);
        judul.setBackground(new Color(30, 144, 255));
        judul.setForeground(Color.WHITE);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 18));
        judul.setHorizontalAlignment(SwingConstants.CENTER);
        judul.setBounds(0, 0, 400, 50);
        add(judul);

        JTextArea textArea = new JTextArea();
        textArea.setText("Nama\t\t: " + nama + "\n" + "Tanggal Lahir\t\t: " + tanggalLahir + "\n" + "Nomor Pendaftaran\t: " + noReg + "\n" + "No. Telp\t\t: " + noTlpn + "\n" + "Alamat\t\t: " + address + "\n" +"E-mail\t\t: " + email);
        textArea.setBounds(20, 60, 340, 150);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setBackground(new Color(224, 255, 255)); 
        textArea.setForeground(new Color(25, 25, 112)); 
        textArea.setBorder(new LineBorder(new Color(100, 149, 237), 2));
        add(textArea);
    }
}
