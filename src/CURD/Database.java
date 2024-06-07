/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CURD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author GAMING 3
 */
public class Database {
    private String databaseName = "muhammad_pahmi_2210010231";
    private String username = "root";
    private String password = "";
    public static Connection  ConnectionDB;
   
   public Database (){
       try {
           String location = "jdbc:mysql://localhost/" + databaseName;
           Class.forName("com.mysql.jdbc.Driver");
           ConnectionDB = DriverManager.getConnection(location, username, password);
           System.out.println("databse terkoneksi");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
//   public void simpanuji(String nik, String nama, String telp, String alamat){
//     try{
//         String sql = "insert into Uji ( nik, nama, telp, Alamat)value (?,?,?,?)";
//         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
//         perintah.setString(1, nik);
//         perintah.setString(2, nama);
//         perintah.setString(3, telp);
//         perintah.setString(4, alamat);
//         
//         perintah.executeUpdate(); 
//             System.out.println("data berhasil disimpan");
//        
//     }  
//     catch (Exception e){
//         System.out.println(e.getMessage());
//     }
//   }
//      public void ubahuji(String nik, String nama, String telp, String alamat){
//     try{
//         String sql = "Update Uji set nama = ?, telp =?, alamat = ? where nik =?";
//         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
//         perintah.setString(1, nama);
//         perintah.setString(2, telp);
//         perintah.setString(3, alamat);
//         perintah.setString(4, nik);
//         
//         perintah.executeUpdate(); 
//             System.out.println("data berhasil diubah");
//        
//     }  
//     catch (Exception e){
//         System.out.println(e.getMessage());
//     }
//   }
//     public void hapusuji(String Nik ){
//     try{
//         String sql = " delete from uji where nik = 1";
//         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
//         
//         perintah.executeUpdate(); 
//             System.out.println("data berhasil dihapus");
//             }  
//     catch (Exception e){
//         System.out.println(e.getMessage());
//     }
//   }
     // tabel keranjang
      public void simpankeranjang(String Id_Keranjang, String Harga, String Jumlah, String Tgl_order, String Id_pemesanan){
     try{
         String sql = "insert into keranjang ( id_keranjang, harga, jumlah, tgl_order, id_pemesanan)value (?,?,?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, Id_Keranjang);
         perintah.setString(2, Harga);
         perintah.setString(3, Jumlah);
         perintah.setString(4, Tgl_order);
         perintah.setString(5, Id_pemesanan);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }  
          public void ubahkeranjang(String id_keranjang, String Harga, String Jumlah, String Tgl_order, String id_pemesanan){
     try{
         String sql = "Update keranjang set Harga = ?, Jumlah =?, Tgl_order =?, id_pemesanan =? where id_keranjang =?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, Harga);
         perintah.setString(2, Jumlah);
         perintah.setString(3, Tgl_order);
         perintah.setString(4, id_pemesanan);
         perintah.setString(5, id_keranjang);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }  
     
      public void hapuskeranjang(String id_keranjang ){
     try{
         String sql = " delete from keranjang where id_keranjang = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
            public void carikeranjang(String id_keranjang ){
     try{
         String sql = "SELECT*FROM keranjang where id_keranjang = ?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_keranjang);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("id_keranjang :"+data.getString("id_keranjang"));
             System.out.println("harga :"+data.getString("harga"));
             System.out.println("jumlah :"+data.getString("jumlah"));
             System.out.println("tgl_order :"+data.getString("tgl_order"));
             System.out.println("id_pemesanan :"+data.getString("Id_pemesanan")); 
         }
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
         public void datakeranjang(){
     try{
     Statement stmt = ConnectionDB.createStatement();
     ResultSet baris = stmt.executeQuery("SELECT*FROM keranjang ORDER BY id_keranjang ASC");
     while (baris.next()){
         System.out.println(baris.getString("id_keranjang")+" | "+
                            baris.getString("harga")+" | "+
                            baris.getString("jumlah")+" | "+
                            baris.getString("tgl_order")+" | "+
                            baris.getString("id_pemesanan"));           
     }  
             }  
     catch (Exception e){
         System.err.println(e.getMessage());
     }
   }

      
      
      //Tabel Pesanan
     public void simpanpesanan(String id_pemesanan, String tgl_pesan, String id_pelanggan, String alamat_pengiriman, String total_bayar){
     try{
         String sql = "insert into pemesanan ( id_pemesanan, tgl_pesan, id_pelanggan, alamat_pengiriman, total_bayar)value (?,?,?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_pemesanan);
         perintah.setString(2, tgl_pesan);
         perintah.setString(3, id_pelanggan);
         perintah.setString(4, alamat_pengiriman);
         perintah.setString(5, total_bayar);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   } 
          public void ubahpesanan(String id_pemesanan, String tgl_pesan, String id_pelanggan, String alamat_pengiriman, String total_bayar){
     try{
         String sql = "Update pemesanan set tgl_pesan = ?, id_pelanggan =?, alamat_pengiriman =?, total_bayar=?  where id_pemesanan =?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, tgl_pesan);
         perintah.setString(2, id_pelanggan);
         perintah.setString(3, alamat_pengiriman);
         perintah.setString(4, total_bayar);
         perintah.setString(5, id_pemesanan);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }  
          public void hapuspesanan(String id_pemesanan ){
     try{
         String sql = " delete from pemesanan where id_pemesanan = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
          public void caripesanan(String id_pemesanan ){
     try{
         String sql = "SELECT*FROM pemesanan where id_pemesanan = ?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_pemesanan);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("id_pemesanan :"+data.getString("id_pemesanan"));
             System.out.println("tgl_pesan :"+data.getString("tgl_pesan"));
             System.out.println("id_pelanggan :"+data.getString("id_pelanggan"));
             System.out.println("alamat_pengiriman :"+data.getString("alamat_pengiriman"));
             System.out.println("total_bayar :"+data.getString("total_bayar")); 
         }
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
         public void datapesanan(){
     try{
     Statement stmt = ConnectionDB.createStatement();
     ResultSet baris = stmt.executeQuery("SELECT*FROM pemesanan ORDER BY id_pemesanan ASC");
     while (baris.next()){
         System.out.println(baris.getString("id_pemesanan")+" | "+
                            baris.getString("tgl_pesan")+" | "+
                            baris.getString("id_pelanggan")+" | "+
                            baris.getString("alamat_pengiriman")+" | "+
                            baris.getString("total_bayar"));           
     }  
             }  
     catch (Exception e){
         System.err.println(e.getMessage());
     }
   }

          
     // tabel pelanggan
     
     public void simpanpelanggan(String id_pelanggan, String username, String password, String nama, String alamat, String telp){
     try{
         String sql = "insert into pelanggan ( id_pelanggan, username, password, nama, alamat, telp)value (?,?,?,?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_pelanggan);
         perintah.setString(2, username);
         perintah.setString(3, password);
         perintah.setString(4, nama);
         perintah.setString(5, alamat);
         perintah.setString(6, telp);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }  
      
             public void ubahpelanggan(String id_pelanggan, String username, String password, String nama, String alamat, String telp){
     try{
         String sql = "Update pelanggan set username =?, password =?, nama =?, alamat =?, telp =?  where id_pelanggan =?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, username);
         perintah.setString(2, password);
         perintah.setString(3, nama);
         perintah.setString(4, alamat);
         perintah.setString(5, telp);
         perintah.setString(6, id_pelanggan);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   } 
            public void hapuspelanggan(String id_pelanggan ){
     try{
         String sql = " delete from pelanggan where id_pelanggan = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }  
            
         public void caripelanggan(String id_pelanggan ){
     try{
         String sql = "SELECT*FROM pelanggan where id_pelanggan = ?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_pelanggan);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("id_pelanggan :"+data.getString("id_pelanggan"));
             System.out.println("username :"+data.getString("username"));
             System.out.println("password :"+data.getString("password"));
             System.out.println("nama :"+data.getString("nama"));
             System.out.println("alamat :"+data.getString("alamat"));
             System.out.println("telp :"+data.getString("telp"));
         }
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
         public void datapelanggan(){
     try{
     Statement stmt = ConnectionDB.createStatement();
     ResultSet baris = stmt.executeQuery("SELECT*FROM pelanggan ORDER BY id_pelanggan ASC");
     while (baris.next()){
         System.out.println(baris.getString("id_pelanggan")+" | "+
                            baris.getString("username")+" | "+
                            baris.getString("password")+" | "+
                            baris.getString("nama")+" | "+
                            baris.getString("alamat")+" | "+
                            baris.getString("telp"));           
     }  
             }  
     catch (Exception e){
         System.err.println(e.getMessage());
     }
   }
            
   // tabel detail_pemesanan
    
         public void simpandetail_pemesanan(String id_det_pemesanan, String id_pemesanan, String id_menu){
     try{
         String sql = "insert into detail_pemesanan ( id_det_pemesanan, id_pemesanan, id_menu )value (?,?,?)";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_det_pemesanan);
         perintah.setString(2, id_pemesanan);
         perintah.setString(3, id_menu);

         
         perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   } 
         
             public void ubahdetail_pemesanan(String id_det_pemesanan, String id_pemesanan, String id_menu){
     try{
         String sql ="Update detail_pemesanan set id_pemesanan =?, id_menu =?  where id_det_pemesanan =?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_pemesanan);
         perintah.setString(2, id_menu);
         perintah.setString(3, id_det_pemesanan);

         
         perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   } 
    public void hapusdetail_pemesanan(String id_det_pemesanan ){
     try{
         String sql = " delete from detail_pemesanan where id_det_pemesanan = 1";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
          public void car1idetail_pemesanan(String id_det_pemesanan ){
     try{
         String sql = "SELECT*FROM detail_pemesanan where id_det_pemesanan = ?";
         PreparedStatement perintah = ConnectionDB.prepareStatement(sql);
         perintah.setString(1, id_det_pemesanan);
         ResultSet data = perintah.executeQuery();
         while(data.next()){
             System.out.println("id_det_pemesanan :"+data.getString("id_det_pemesanan"));
             System.out.println("id_pemesanan :"+data.getString("id_pemesanan"));
             System.out.println("id_menu :"+data.getString("id_menu"));
         }
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
         public void datadetail_pemesanan(){
     try{
     Statement stmt = ConnectionDB.createStatement();
     ResultSet baris = stmt.executeQuery("SELECT*FROM detail_pemesanan ORDER BY id_det_pemesanan ASC");
     while (baris.next()){
         System.out.println(baris.getString("id_det_pemesanan")+" | "+
                            baris.getString("id_pemesanan")+" | "+
                            baris.getString("id_menu"));         
     }  
             }  
     catch (Exception e){
         System.err.println(e.getMessage());
     }
   }   
}
