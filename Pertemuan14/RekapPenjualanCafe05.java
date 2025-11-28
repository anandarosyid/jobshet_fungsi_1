package Pertemuan14;
import java.util.Scanner;
public class RekapPenjualanCafe05 {

    static String[] menu ;
    static int[][] penjualan ;
    static Scanner sc = new Scanner(System.in);
    static int jumlahMenu, jumlahHari;

    static void menuHari(){
        System.out.print("Masukkan jumlah menu : ");
        jumlahMenu = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan jumlah hari : " );
        jumlahHari=sc.nextInt();
        sc.nextLine();

        menu= new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        for (int i = 0; i < jumlahMenu;i++){
            System.out.print("Nama menu Ke- " + (i+1) + " : " );
            menu[i]=sc.nextLine();
        }
    }
    
    static void inputData(){
        for (int i = 0; i < menu.length; i++){
            System.out.println("\nInput Penjualan " + menu[i]);

            for (int j = 0; j < jumlahHari; j++){
                System.out.print("Hari Ke - " + (j+1) + " : ");
                penjualan[i][j]=sc.nextInt();
            }
        }
    }

    static void tampilArray(){
        System.out.println("\n================DATA PENJUALAN CAFE =================");
        System.out.print("Menu \t\t");
        for (int j = 0; j < jumlahHari; j++){
            System.out.print("H" + (j+1) +"\t");
        }
        System.out.println("\n-----------------------------------------------------");

        for (int i = 0; i < menu.length;i++){
            System.out.print(menu[i] +  "\t\t");
            for(int j = 0; j < jumlahHari;  j++){
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("====================================================");
    }

    static void menuterlaris(){
        int max=0;
        String terlaris = menu[0];

        for (int i = 0 ;i < menu.length; i++){
            int total = 0;
            for (int j = 0; j < jumlahHari; j++){
                total+= penjualan[i][j];
            } if (total>max){
                max=total;
                terlaris=menu[i];
            }

        }
        System.out.println("\nMenu Terlaris\t: "+ terlaris);
        System.out.println("Total Penjualan : " + max);
    }

    static void ratRata(){
        System.out.println("\n============Rata Rata Penjualan==========");
        for(int i = 0; i < menu.length; i++){
        int total=0;
        for(int j = 0; j < jumlahHari; j++){
            total += penjualan[i][j];
        }
        double rata=(double)total / jumlahHari;
        System.out.println((menu[i])+ " : "+rata);
        }
    }
    public static void main (String[]args){
       
        menuHari();
        inputData();
        tampilArray();
        menuterlaris();
        ratRata();
    }
}
    
