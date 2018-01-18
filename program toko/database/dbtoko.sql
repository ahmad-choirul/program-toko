-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2018 at 07:01 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtoko`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_barang` varchar(25) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `harga` varchar(30) NOT NULL,
  `stok` varchar(30) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_barang`, `nama_barang`, `harga`, `stok`, `keterangan`) VALUES
('B001', 'Sabun Nuvo', '1000', '10', 'sabun mandi'),
('B002', 'Shampo', '500', '10', ''),
('B003', 'Pepsodent', '1500', '19', 'pasta gigi'),
('B004', 'Gula 1 Kg', '7500', '11', 'gula manis'),
('5010029020519', 'tinta', '10000', '10', 'tinta warna putih'),
('671860013624', 'pensil', '10000', '100', 'pensil 2b'),
('811204012344', 'pen', '100', '10', 'pen biasa'),
('9421023610112', 'tas', '100000', '1', 'tas sekolah'),
('9788420532318', 'gelas', '9000', '9', 'gelas minum'),
('712345678911', 'memori', '100000', '10', 'memory hp'),
('129002702047', 'speaker', '100000', '10', 'speaker laptop'),
('9771234567003', 'keyboard', '1000', '1', 'keyboard laptop'),
('640509040147', 'laptop', '800000', '1', 'baru'),
('9501101530003', 'sepatu', '10000', '1', 'baru'),
('8886008101053', 'aqua', '3000', '100', 'aqua 600 ml'),
('8996001304990', 'roma sari gandum', '6000', '21', 'jajan'),
('8995899250150', 'boncabe', '1000', '123', 'sambal tabur'),
('8997200880865', 'pilus panda', '5000', '89', 'jajan'),
('089686043297', 'indomi sambal matah', '2000', '100', 'mie instan'),
('089686043273', 'indomi sambal rica-rica', '100', '100', 'mi instan');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `kd_pelanggan` varchar(6) NOT NULL,
  `nm_pelanggan` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `notlp` varchar(13) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`kd_pelanggan`, `nm_pelanggan`, `alamat`, `notlp`) VALUES
('P001', 'Fahruddin', 'Bangil', '083837288399'),
('P002', 'Iklima N', 'Bangil', '0827636377'),
('P003', 'Novi Santoso', 'Pasuruan', '08374747748'),
('P004', 'Mahros', 'Pasuruan', '083833117951');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `no_transaksi` varchar(30) NOT NULL,
  `tgl_transaksi` datetime NOT NULL,
  `kd_supplier` varchar(30) NOT NULL,
  `kd_barang` varchar(30) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `totalharga` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`no_transaksi`, `tgl_transaksi`, `kd_supplier`, `kd_barang`, `harga`, `jumlah`, `totalharga`) VALUES
('001', '2013-06-11 00:00:00', 'S002', 'B003', '1500', '23', '34500');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `no_transaksi` varchar(30) NOT NULL,
  `tgl_transaksi` datetime NOT NULL,
  `kd_barang` varchar(30) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `totalharga` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`no_transaksi`, `tgl_transaksi`, `kd_barang`, `harga`, `jumlah`, `totalharga`) VALUES
('1', '2018-01-18 00:00:00', 'B001', '1000', '1', '1000'),
('1', '2018-01-18 00:00:00', 'B002', '500', '1', '500');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `kd_supplier` varchar(6) NOT NULL,
  `nm_supplier` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `notlp` varchar(13) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`kd_supplier`, `nm_supplier`, `alamat`, `notlp`) VALUES
('S001', 'Toko Barokah', 'Pasuruan', '0847373447343'),
('S002', 'Toko Indah', 'Surabaya', '031-789453'),
('S003', 'Supermart', 'Bangil', '08323245556');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`kd_pelanggan`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`kd_supplier`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
