//Muh.Faishal Rizal
//20090029
//2D
package Tugas03;
import java.util.Scanner;
public class No1{
    public static void main(String[] args) {
        String cari;
        boolean ketemu = false;
        String data[] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Faishal","Tesla"};
        
        System.out.print("data = ");
        for (int f = 0; f < data.length; f++) {
            System.out.print(data[f]+ " ");  
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("cari nama = ");
        cari = scan.nextLine();
        System.out.println();   
        for (int f = 0; f < data.length; f++) {
            if (cari.equalsIgnoreCase(data[f])){ 
                System.out.println("data "+ cari+" berada di indeks "+f);
                ketemu = true;
                break; 
            }
        }if (ketemu ==false){
            System.out.println("Data tidak ditemukan");
        }
        System.out.println("Muh.Faishal Rizal");
    }
}
