package Pertemuan14;
import java.util.Scanner;

public class Kafe_05 {
      public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("selamat datang, " + namaPelanggan + "!");

        if(isMember){
            System.out.println("anda adalah member,dapatkan diskon 10% untuk setiap pembelian!");
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
     public static int hitungTotalHarga05(int totalHarga, String kodePromo) {
        double diskon = 0;

        if(kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = totalHarga* 0.50;
            System.out.println ("anda mendapatkan diskon 50%\t\t  : Rp"+ (int)diskon);
         } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = totalHarga*0.30;
            System.out.println("anda mendapatkan diskon 30% Rp "+ (int)diskon);
         } else {
            System.out.println("kode Promo tidak valid");
     }    
     return totalHarga - (int)diskon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("bUDI" , true);
          int []hargaItem = {15000, 20000, 22000,12000,10000,18000};

        int totalKeseluruhan = 0;
        char lanjut;

        do {
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan : " );
        int pilihanMenus = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan   : ");
        int banyakItem = sc.nextInt();
        int totalAwal =hargaItem[pilihanMenus-1]* banyakItem;
        totalKeseluruhan+=totalAwal;
        System.out.println("subtotal menunya \t\t\t  : Rp " +totalAwal);

        System.out.print("Apakah ingin menambah pesanan lagi? (y/n) : ");
        lanjut=sc.next().charAt(0);
        } while(lanjut=='y' ||lanjut=='Y');

        System.out.println("==================================================");
        System.out.println("Total harga sebelum diskon \t\t  : Rp"  + totalKeseluruhan);
        System.out.println("==================================================");
        System.out.print("masukkan kode promo \t\t\t  : ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga05(totalKeseluruhan, kodePromo);

         System.out.println("==================================================");
        System.out.println("Total harga unutk pesanan anda\t\t  : Rp" + totalHarga);
    }
}

