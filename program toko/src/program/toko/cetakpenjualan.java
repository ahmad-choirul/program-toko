/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.toko;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.Sides;
import javax.swing.JEditorPane;
import static program.toko.penjualan.foot;
import static program.toko.penjualan.head;

/**
 *
 * @author acer
 */
public class cetakpenjualan {

    String gethasil;

    public cetakpenjualan(String gethasil) {
        this.gethasil = gethasil;
    }

    public void cetak() throws PrinterException {
        PrinterJob pj = PrinterJob.getPrinterJob();

        PageFormat pf = pj.defaultPage();
        Paper paper = new Paper();
        double margin = 20; // half inch
        paper.setImageableArea(margin, margin - 15, paper.getWidth() - margin * 2, paper.getHeight()
                - margin * 2);
        pf.setPaper(paper);;
        if (pj.printDialog()) {
            JEditorPane text = new JEditorPane("text/html", "<p style=\"text-align:left;\">PT apa itu (0336-321212)<BR>\n"
                    + "Jl yang pernah ada<BR>\n"
                    + "Jember Selatan<BR>\n"
                    + "NPWP : 1293827384675\n"
                    + "</p>\n"
                    + "<div style=\"border-bottom:2px dashed black;\">\n"
                    + "</div>\n"
                    + "" + getjam() + " " + gettanggal() + " " + Gethari() + " | 051115/Aichi\n"
                    + "<div style=\"border-bottom:2px dashed black;\"></div>\n"
                    + "<table width=\"40%\">\n"
                    + "<tr>\n"
                    + "	<td>Nama</td>\n"
                    + "	<td>Jumlah</td>\n"
                    + "	<td>Harga</td>\n"
                    + "	<td>Total</td>\n"
                    + "</tr>\n"
                    + gethasil
            +"<table width=\"40%\">\n"
                    + "<tr>\n"
                    + "	<td>Total bayar</td>\n"
                    + "	<td>Rp.25.000,00</td>\n"
                    + "</tr>\n"
                    + "<tr>\n"
                    + "	<td>Bayar</td>\n"
                    + "	<td>50000</td>\n"
                    + "</tr>\n"
                    + "<tr>\n"
                    + "	<td>Kembalian</td>\n"
                    + "	<td>25000.0</td>\n"
                    + "</tr>\n"
                    + "</table>\n"
                    + "<hr>\n"
                    + "<p>Terima Kasih Atas Kunjungan Anda <br>\n"
                    + "Periksa barang sebelum dibeli<br>\n"
                    + "Barang yang sudah dibeli tidak bisa dikembalikan</p>"
            );
            text.repaint();
            pj.setPrintable(text.getPrintable(head, foot), pf);
            PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
            aset.add(new Copies(1));
            aset.add(Sides.DUPLEX);
            pj.print(aset);
        }
    }

    public static String gettanggal() {
        DateFormat dateformat = new SimpleDateFormat("yyMMdd");
        Date date = new Date();
        return dateformat.format(date);
    }

    public static String getjam() {
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }

    public static String Gethari() {
        Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week abbreviated
        String hari = simpleDateformat.format(now);
        return hari;
    }
}
