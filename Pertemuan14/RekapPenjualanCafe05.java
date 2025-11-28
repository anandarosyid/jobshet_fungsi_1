package Pertemuan14;
import java.util.Scanner;
public class RekapPenjualanCafe05 {

    static String[] menu = {
        "Kopi          ",
        "Teh           ",
        "Es Kelapa Muda",
        "Roti bakar    ",
        "Gorengan      "};
    static int[][] penjualan = new int [5][7];
    static Scanner sc = new Scanner(System.in);
    
    static void inputData(){
        for (int i = 0; i < menu.length; i++){
            System.out.println("\nInput Penjualan " + menu[i]);

            for (int j = 0; j < penjualan[i].length; j++){
                System.out.print("Hari Ke - " + (j+1) + " : ");
                penjualan[i][j]=sc.nextInt();
            }
        }
    }

    static void tampilArray(){
        System.out.println("\n===================================================================");
        System.out.print("Menu \t\t");
        for (int j = 0; j < penjualan[0].length; j++){
            System.out.print("H" + (j+1) +"\t");
        }
        System.out.println("\n-------------------------------------------------------------------");

        for (int i = 0; i < menu.length;i++){
            System.out.print(menu[i] +  "\t");
            for(int j = 0; j < penjualan[i].length;  j++){
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================================================================");
    }

    static void menuterlaris(){
        int max=0;
        String terlaris = menu[0];

        for (int i = 0 ;i < menu.length; i++){
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++){
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
        System.out.println("\n========Rata Rata Penjualan=======");
        for(int i = 0; i < menu.length; i++){
        int total=0;
        for(int j = 0; j < penjualan[i].length; j++){
            total += penjualan[i][j];
        }
        double rata=(double)total / penjualan[i].length;
        System.out.println((menu[i])+ " = "+rata);
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        inputData();
        tampilArray();
        menuterlaris();
        ratRata();
    }
}
    
