package Pertemuan14;

public class PengunjungCafe05 {
     static void daftarPengujung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengujung:");
        for (String nama : namaPengunjung)
        System.out.println("-"+nama);
     }
    

    public static void main(String[]args) {
        daftarPengujung("Ali", "Budi", "Citra");
        daftarPengujung("Andi");
        daftarPengujung("Doni", "Eti","Fahmi", "Galih");
    }
}