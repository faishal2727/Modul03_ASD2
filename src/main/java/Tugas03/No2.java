//Muh.Faishal Rizal
//20090029
//2D
package Tugas03;
import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        int cari;
        int data [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        boolean ketemu = false;
        int batasbawah = data.length -1;
        int batasatas = 0;
        int poin = 0;
        System.out.print("data = ");
        for (int f = 0; f < data.length; f++) {
            System.out.print(data[f]+ " ");         
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("cari angka = ");
        cari = scan.nextInt();
        System.out.println(); 
        
        while ((batasatas <= batasbawah ) && (ketemu == false)){
        poin = (batasatas + batasbawah)/2;
        System.out.println("indeks pointer : "+poin);  
            if (data[poin]==cari){
                ketemu = true;
                System.out.println("Data "+cari+" telah ditemukan pada indeks ke "+poin);
            }
            else {
                if (cari < data[poin]){
                    System.out.println("cari di kiri");
                    batasbawah = poin-1;   
                }
                else{
                    System.out.println("cari di kanan");
                    batasatas = poin+1;    
                }
            }
        }
        if (ketemu==true){
            System.out.println("data "+cari+" ditemukan di indeks "+(poin+" di baris "+(poin+1)));
        }
        else{
            System.out.println("data "+cari+" tidak ada ");
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("Muh.Faishal Rizal");
    } 
}
