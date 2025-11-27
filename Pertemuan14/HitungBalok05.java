package Pertemuan14;
import java.util.Scanner;
public class HitungBalok05 {

      static int hitungLuas05(int pjg,int lb){
        int Luas = pjg*lb;
        return Luas;
    }
        static int htungVolume05(int tinggi,int a,int b){
            int volume = hitungLuas05(a, b) * tinggi;
            return volume;
        }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("masukkan panjang :");
        p=input.nextInt(); 
        System.out.print("masukkan lebar : ");
        l=input.nextInt();
        System.out.print("masukkan Tinggi :");
        t=input.nextInt();

        L= hitungLuas05(p, l);
        System.out.println("Luas persegi panjnag adalah "+ L);
        vol= htungVolume05(t,p,l);
        System.out.println("Volume balok adalah " + vol);
        input.close();
    }
  
    
    
}
