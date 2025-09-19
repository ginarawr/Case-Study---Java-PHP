//package matrik; 
import java.util.Scanner; 

public class Main { 
    public void kalimat(){ 
        System.out.print("Isi matriks adalah : "); 
    } 

    public int hitungluas(int p,int l){ 
        int luas; 
        luas = p * l; 
        return luas; 
    } 

    public int hitungvolume(int p,int l,int t){ 
        int volume; 
        volume = p * l * t; 
        return volume; 
    }  

    public static void main(String[] args) { 
        int p, l, t; 
        int data[]; 
        Scanner masuk = new Scanner(System.in); 

        System.out.print("masukkan panjang : "); 
        p = masuk.nextInt(); 

        System.out.print("masukkan lebar : "); 
        l = masuk.nextInt(); 

        System.out.print("masukkan tinggi : "); 
        t = masuk.nextInt();       

        data = new int[3]; 
        Main saya = new Main(); 

        data[0] = saya.hitungluas(p, l); 
        data[1] = saya.hitungvolume(p, l, t); 
        data[2] = 10; 

        int bil = 0; 
        while (bil <= 2) { 
            saya.kalimat(); 
            System.out.println(data[bil]); 
            bil = bil + 1; 
        } 
    } 
}
