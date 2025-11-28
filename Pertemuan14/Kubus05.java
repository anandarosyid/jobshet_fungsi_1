package Pertemuan14;
import java.util.Scanner;
public class Kubus05 {

    static int hitungVolume(int sisi){
        int Volume = sisi*sisi*sisi;
        return Volume;
    }

    static int hitungLuasPermukaan(int sisi){
        int luasPermukaan= 6 * sisi*sisi;
        return luasPermukaan;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus : ");
        int sisiKubus = sc.nextInt();

        int Volume = hitungVolume(sisiKubus);
        int luasPermukaan = hitungLuasPermukaan(sisiKubus);

        System.out.println("volume kubus adalah : "+ Volume);
        System.out.println("Luaspermukaan kubus adalah : " + luasPermukaan);
     }
    }
    

