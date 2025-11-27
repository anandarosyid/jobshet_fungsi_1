package Pertemuan14;

public class PengunjungCafe05 {
     static void daftarPengujung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengujung:");
        for (int i = 0; i < namaPengunjung.length; i++)
        System.out.println("-"+namaPengunjung[i]);
     }
    

    public static void main(String[]args) {
        daftarPengujung("Ali", "Budi", "Citra");
        daftarPengujung("Andi");
        daftarPengujung("Doni", "Eti","Fahmi", "Galih");
    }
}