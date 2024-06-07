/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jasa;
    import JasaKatering.*;
    import CURD.Database;
/**
 *
 * @author GAMING 3
 */


public class Jasa {
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database dbconnect = new Database();
      //dbconnect.simpanuji("1", "Muhammad Pahmi", "082155363688", "jalan pramuka");
      //dbconnect.ubahuji("1", "muhammad pahmi", "0821553636", "jalan pramuka");
       //dbconnect.hapusuji("1");

        // informasi keranjang
       //dbconnect.simpankeranjang("2", "50000", "2", "2024/06/02","2");
       //dbconnect.ubahkeranjang("2", "75000", "1", "2024/06/03", "1");
       //dbconnect.hapuskeranjang("1");
       //dbconnect.carikeranjang("1");
       //dbconnect.datakeranjang();  
       

        // informasi pesanan
        //dbconnect.simpanpesanan("1", "2024/06/02", "1", "jln sutoyo","25000");
        //dbconnect.ubahpesanan("1", "2024/06/03", "1", "jln kuripan","30000");
        //dbconnect.hapuspesanan("1");
        //dbconnect.caripesanan("1");
        //dbconnect.datapesanan();
         
        // informasi pelanggan 
         //dbconnect.simpanpelanggan("1", "iyan", "123", "madiyan", "jln permai", "083636353");
         dbconnect.ubahpelanggan("1", "madiyan", "1234", "iyan", "jln sutoyo", "0826253636");
         //dbconnect.hapuspelanggan("1");
         //dbconnect.caripelanggan("1");
         //dbconnect.datapelanggan();

        // informasi detail_pemesanan 
          //dbconnect.simpandetail_pemesanan("1", "1", "1");
          //dbconnect.ubahdetail_pemesanan("2", "1", "1");
          //dbconnect.hapusdetail_pemesanan("1"); 
          //dbconnect.caridetail_pemesanan("1");
          //dbconnect.datadetail_pemesanan();
    
          
          
          
      

//          Pemesanan katering = new Pemesanan(1, "2024-06-01", "Jalan Melati indah",25000);
//           
//          // pelanggan
//        Pelanggan saya = new Pelanggan(1, "derxis", "****","pahmi", "jalan melati indah", "09474747004",
//                                             2, "2024-06-02", "jalan melati indah", 25000);
//
//        // Menampilkan informasi Pemesanan
//        System.out.println("Informasi Pemesanan Katering");
//        System.out.println("ID Pemesanan: " + katering.getId_Pemesanan());
//        System.out.println("Tanggal Pemesanan: " + katering.getTgl_Pesan());
//        System.out.println("Tujuan Pesanan: " + katering.getAlamat_Pengiriman());
//        System.out.println("Biaya Pesanan: " + katering.getTotal_bayar());
//        
//        // Menampilkan Informasi Pelanggan
//        System.out.println("\nInformasi Pelanggan Katering:");
//        System.out.println("ID Pelanggan: " + saya.getId_Pelanggan());
//        System.out.println("Username Pelanggan: " + saya.getUsername());
//        System.out.println("Password Pelanggan: " + saya.getPassword());
//        System.out.println("Nama Pelanggan: " + saya.getNama());
//        System.out.println("Alamat Pelanggan: " + saya.getAlamat());
//        System.out.println("Alamat Pelanggan: " + saya.getTelp());
//
//       
}
}
