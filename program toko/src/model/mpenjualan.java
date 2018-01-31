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
     public DefaultTableModel getdatapenjualantgl(String tglawal,String tglakhir) throws SQLException {
        String kolom[] = {"no_transaksi","tgl_transaksi","kd_barang","harga","jumlah","totalharga"};
        String query = "SELECT no_transaksi,tgl_transaksi,nama_barang,b.harga,p.jumlah,totalharga FROM penjualan p join barang b on (p.kd_barang=b.kd_barang)  WHERE tgl_transaksi between '"+tglawal+"' AND '"+tglakhir+"' ";
        return getDatatotal(query, kolom);
    }
    public String getnotransaksi() throws SQLException {
        String query = "SELECT MAX(no_transaksi)+1 as kode from penjualan";
        String id = getdataidNoaray(query);
        String notr=id.substring(6, 12);
        return notr;
    }
}
