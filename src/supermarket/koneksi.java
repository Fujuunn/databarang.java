/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket ;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Vivobook
 */
public class koneksi {
    Connection Koneksi=null;

    public static Connection koneksiDb() 
    {
        try{
            String url="jdbc:mysql://localhost/supermarket"; // nama database
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");     // nama driver MySQL
            Connection koneksi=DriverManager.getConnection(url,user,pass);  // membuat koneksi
            return koneksi;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e); // menampilkan perintah jika koneksi gagal
            return null;
        }
    }
}