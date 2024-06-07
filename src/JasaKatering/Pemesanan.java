/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JasaKatering;

/**
 *
 * @author GAMING 3
 */
public class Pemesanan {
     int id_Pemesanan;
     String Tgl_Pesan;
     String Alamat_Pengiriman;
     double total_bayar;

    public Pemesanan(int id_Pemesanan, String Tgl_Pesan, String Alamat_Pengiriman, double total_bayar) {
        this.id_Pemesanan = id_Pemesanan;
        this.Tgl_Pesan = Tgl_Pesan;
        this.Alamat_Pengiriman = Alamat_Pengiriman;
        this.total_bayar = total_bayar;
    }

    // getter and setter methods
    public int getId_Pemesanan() {
        return id_Pemesanan;
    }

    public void setId_Pemesanan(int id_Pemesanan) {
        this.id_Pemesanan = id_Pemesanan;
    }

    public String getTgl_Pesan() {
        return Tgl_Pesan;
    }

    public void setTgl_Pesan(String Tgl_Pesan) {
        this.Tgl_Pesan = Tgl_Pesan;
    }

    public String getAlamat_Pengiriman() {
        return Alamat_Pengiriman;
    }

    public void setAlamat_Pengiriman(String Alamat_Pengiriman) {
        this.Alamat_Pengiriman = Alamat_Pengiriman;
    }

    public double getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(double total_bayar) {
        this.total_bayar = total_bayar;
    }
}