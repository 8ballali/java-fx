 import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


class jamDigital extends JFrame {
  // Deklarasi komponen Label
  JLabel tampil_jam = new JLabel();


  // Konstruktor
  public jamDigital() {
    tampil_jam.setFont(new Font("Dialog", 1, 30));
    this.getContentPane().setLayout(new FlowLayout());
    this.getContentPane().add(tampil_jam);


    // ActionListener untuk Keperluan Timer
    ActionListener taskPerformer = (ActionEvent evt) -> {
        String nol_jam = "";
        String nol_menit = "";
        String nol_detik = "";
        // Membuat Date
        Date dt = new Date();
        // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
        int nilai_jam = dt.getHours();
        int nilai_menit = dt.getMinutes();
        int nilai_detik = dt.getSeconds();
        // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
        if (nilai_jam <= 9) {
            // Tambahkan "0" didepannya
            nol_jam = "0";
        }
        // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
        if (nilai_menit <= 9) {
            // Tambahkan "0" didepannya
            nol_menit = "0";
        }
        // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
        if (nilai_detik <= 9) {
            // Tambahkan "0" didepannya
            nol_detik = "0";
        }
        // Membuat String JAM, MENIT, DETIK
        String jam = nol_jam + Integer.toString(nilai_jam);
        String menit = nol_menit + Integer.toString(nilai_menit);
        String detik = nol_detik + Integer.toString(nilai_detik);
        // Menampilkan pada Layar
        tampil_jam.setText("  " + jam + " : " + menit + " : " + detik + "  ");
    };
    // Timer
    new Timer(1000, taskPerformer).start();
  }


  // MAIN
  public static void main(String[] args) {
    jamDigital jd = new jamDigital();
    jd.setTitle("Jam Digital");
    jd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jd.setSize(200, 90);
    jd.show();
  }
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    


    
}
