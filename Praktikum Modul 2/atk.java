/*
 Seorang penjual alat tulis menjual 10 bolpoint, 10 pensil dan 10 penghapus. 1 biji bolpoint
 harganya Rp. 2000, 1 biji pensil harganya Rp. 1.000 dan 1 penghapus harganya Rp. 500.
 Gunakanlah objek untuk menyelesaikan soal dibawah ini!
 
 1. Buatlah method untuk memasukkan (setter) nama, stok, harga satuan, dan harga (stok x
 harga satuan) alat tulis tersebut! (40 point)

 2. Buatlah method untuk menampilkan (getter) nama, stok, harga satuan, dan harga (stok x
 harga satuan) alat tulis tersebut! (40 point)

 3. Buatlah method Total Harga (setter getter) untuk menampilkan uang yang diterima penjual
 jika semua alat tulis tersebut terjual semuanya! (20 point)

*/ 
import java.util.Scanner;
public class atk {
    int jenisbarang = 3;
    int stok[] = new int[jenisbarang];
    int hrgsatuan[] = new int[jenisbarang];
    int hrgstok[] = new int[jenisbarang];
    int hrgtotal;
    String[] nama = new String[jenisbarang];
    Scanner inputdata = new Scanner(System.in);

    public void inputbarang(){
        System.out.println("Masukkan Data Barang ATK");
        for(int i=0; i<3; i++){
            System.out.print("Nama Barang: ");
            nama[i]= inputdata.next();
            System.out.print("Jumlah Stok: ");
            stok[i] = inputdata.nextInt();
            System.out.print("Harga Satuan: ");
            hrgsatuan[i] = inputdata.nextInt();
            System.out.println("______________________");
           }
        
    }
    public void tampilbarang(){
        System.out.println("Data Harga Barang ATK");
        for(int i=0; i<3; i++){
            System.out.print("Nama Barang: ");
            System.out.println(nama[i]);
            System.out.print("Jumlah Stok: ");
            System.out.println(stok[i]);
            System.out.print("Harga Satuan: ");
            System.out.println(hrgsatuan[i]);
            System.out.print("Harga Keseluruhan: ");
            hrgstok[i] = hrgsatuan[i]*stok[i];
            System.out.println(hrgstok[i]);
            System.out.println("______________________");
        }
        
    }
    public void hargatotal(){
        hrgtotal=hrgstok[0]+hrgstok[1]+hrgstok[2];
        System.out.print("Harga Total Seluruh Barang : ");
        System.out.println(hrgtotal);
        System.out.println("______________________");

    }
    public static void main(String[] args) {
    atk obj = new atk();
    obj.inputbarang();
    obj.tampilbarang();
    obj.hargatotal();
    }
}