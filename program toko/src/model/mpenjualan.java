/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class mpenjualan extends koneksi {
   public mpenjualan() throws SQLException {
        super();
    }

   
//    
    public boolean tambahdatapenjualan(String data[]) {
        String query = "INSERT INTO `penjualan` (`no_transaksi`, `tgl_transaksi`, `kd_barang`, `harga`, `jumlah`, `totalharga`) "
                + "VALUES ('"+data[0]+"', CURRENT_TIMESTAMP, '"+data[2]+"', '"+data[3]+"', '"+data[4]+"', '"+data[5]+"')";
        return execute(query);
    }
    public boolean kurangistokgudang(String stok,String kodebarang) {
        String query = "UPDATE `barang` SET `stok`=`stok`-"+stok+" WHERE `kd_barang` = '"+kodebarang+"' ";
        System.out.println("gimana"+query);
        return execute(query);
    }
//    public boolean updatebarang(String data[]) {
//        String query = "UPDATE `barang` SET `nama_barang`='"+data[1]+"',`harga`='"+data[2]+"',"
//                + "`stok`='"+data[3]+"',`keterangan`='"+data[4]+"' where `kd_barang`='"+data[0]+"' ";
//        return execute(query);
//    }
//    public boolean cekbarang(String data) {
//        String query = "select * from barang where kd_barang = "+data;
//        return execute(query);
//    }
//   
     public DefaultTableModel getdatapenjualantgl(String tglawal,String tglakhir) throws SQLException {
        String kolom[] = {"no_transaksi","tgl_transaksi","kd_barang","harga","jumlah","totalharga"};
        String query = "SELECT * FROM penjualan  WHERE tgl_transaksi between '"+tglawal+"' AND '"+tglakhir+"' ";
         System.out.println("query"+query);
        return getDatatotal(query, kolom);
    }
//     public String[] getdatawithid(String kodebarang) throws SQLException {
//        String kolom[] = {"kd_barang","nama barang","harga","stok","keterangan"};
//        String query = "SELECT * FROM `barang` where kd_barang = '"+kodebarang+"' ";
//        return getdataid(query, kolom);
//    }
//     
//     public DefaultTableModel getdatasearch(String data) throws SQLException {
//        String kolom[] = {"kd_barang","nama barang","harga","stok","keterangan"};
//        String query = "SELECT * FROM `barang` WHERE `kd_barang` LIKE '%"+data+"%' or `nama_barang` LIKE '%"+data+"%' "
//                + "or `harga` LIKE '%"+data+"%' or `stok` LIKE '%"+data+"%' or `keterangan` LIKE '%"+data+"%'";
//        return getDatatotal(query, kolom);
//    }

    public String getnotransaksi() throws SQLException {

        String query = "SELECT MAX(no_transaksi)+1 as kode from penjualan";
        String id = getdataidNoaray(query);
        String notr=id.substring(6, 12);
        return notr;
    }
}
