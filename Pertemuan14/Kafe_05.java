package Pertemuan14;
import java.util.Scanner;

public class Kafe_05 {
      public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("selamat datang, " + namaPelanggan + "!");

        if(isMember){
            System.out.println("anda adalah member,dapatkan diskon 10% untuk setiap pembelian!");
        }
         if(kodePromo.equals("DISKON 50")) {
            System.out.println ("anda mendapatkan diskon 50 %");
         } else if (kodePromo.equals("DISKON 30")) {
            System.out.println("anda mendapatkan diskon 30 %");
         } else {
            System.out.println("kodePromo tidak valid");
         }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam  - Rp 15,000");
        System.out.println("2. Cappuccino  - Rp 20,000");
        System.out.println("3. Latte       - Rp 22,000");
        System.out.println("4. Teh Tarik   - Rp 12,000");
        System.out.println("5. Roti Bakar  - Rp 10,000");
        System.out.println("6. Mie Goreng  - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silakan pilih menu yang Anda inginkan...");
    }
     public static int hitungTotalHarga05(int pilihanMenu,int banyakItem) {
        int []hargaItem = {15000, 20000, 22000,12000,10000,18000};

        int hargaTotal = hargaItem[pilihanMenu-1]*banyakItem;
        return hargaTotal;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("bUDI" , true, "DISKON 30");
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan\t: " );
        int pilihanMenus = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesant\t: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga05(pilihanMenus, banyakItem);

        System.out.println("Total harga unutk pesanan anda\t\t\t: Rp" + totalHarga);
    }
}

