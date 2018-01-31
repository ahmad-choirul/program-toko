/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class mbarang extends koneksi {

    public mbarang() throws SQLException {
        super();
    }

    public boolean tambahbarang(String data[]) {
        String query = "INSERT INTO `barang` (`kd_barang`, `nama_barang`, `harga`, `stok`, `keterangan`) "
                + "VALUES ('" + data[0] + "', '" + data[1] + "', '" + data[2] + "', '" + data[3] + "', '" + data[4] + "');";
        return execute(query);
    }

    public boolean updatebarang(String data[]) {
        String query = "UPDATE `barang` SET `nama_barang`='" + data[1] + "',`harga`='" + data[2] + "',"
                + "`stok`='" + data[3] + "',`keterangan`='" + data[4] + "' where `kd_barang`='" + data[0] + "' ";
        return execute(query);
    }

    public boolean cekbarang(String data) {
        String query = "select * from barang where kd_barang = " + data;
        return execute(query);
    }

    public DefaultTableModel getdata() throws SQLException {
        String kolom[] = {"kd_barang", "nama barang", "harga", "stok", "keterangan"};
        String query = "SELECT * FROM `barang` ";
        return getDatatotal(query, kolom);
    }

    public String[] getdatawithid(String kodebarang) throws SQLException {
        String kolom[] = {"kd_barang", "nama barang", "harga", "stok", "keterangan"};
        String query = "SELECT * FROM `barang` where kd_barang = '" + kodebarang + "' ";
        return getdataid(query, kolom);
    }

    public DefaultTableModel getdatasearch(String data) throws SQLException {
        String kolom[] = {"kd_barang", "nama barang", "harga", "stok", "keterangan"};
        String query = "SELECT * FROM `barang` WHERE `kd_barang` LIKE '%" + data + "%' or `nama_barang` LIKE '%" + data + "%' "
                + "or `harga` LIKE '%" + data + "%' or `stok` LIKE '%" + data + "%' or `keterangan` LIKE '%" + data + "%'";
        return getDatatotal(query, kolom);
    }
    public String getquantity(String kd_barang) throws SQLException {

        String query = "SELECT`stok` from barang WHERE kd_barang = '"+kd_barang+"'";
        String id = getdataidNoaray(query);
        return id;
    }
    public boolean hapusbarang(String data) {
        String query = "delete from barang where kd_barang = " + data;
        return execute(query);
    }
    public DefaultTableModel getdatacaribarangbeli(String data) throws SQLException{
    String kolom[] = {"kd_barang", "nama barang", "harga", "stok", "keterangan"};
        String query = "SELECT * FROM `barang` WHERE `kd_barang` LIKE '%" + data + "%' or `nama_barang` LIKE '%" + data + "%' "
                + "or `harga` LIKE '%" + data + "%' or `stok` LIKE '%" + data + "%' or `keterangan` LIKE '%" + data + "%'";
        return getDatatotal(query, kolom);
    }
}
