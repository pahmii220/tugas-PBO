/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JasaKatering;

/**
 *
 * @author GAMING 3
 */
public class Pelanggan extends Pemesanan{
    int id_Pelanggan;
     String Username;
     String Password;
     String nama;
     String alamat;
     String telp;

    public Pelanggan(int id_Pelanggan, String Username, String Password, String nama, String alamat, String telp,
                     int id_Pemesanan, String Tgl_Pesan, String Alamat_Pengiriman, double total_bayar) {
        super (id_Pemesanan, Tgl_Pesan, Alamat_Pengiriman, total_bayar);
        this.id_Pelanggan = id_Pelanggan;
        this.Username = Username;
        this.Password = Password;
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
    }

    // getter and setter methods
    public int getId_Pelanggan() {
        return id_Pelanggan;
    }

    public void setId_Pelanggan(int id_Pelanggan) {
        this.id_Pelanggan = id_Pelanggan;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
