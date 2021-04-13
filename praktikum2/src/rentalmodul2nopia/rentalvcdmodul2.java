package rentalmodul2nopia;
import java.util.Scanner;

class Rental{
    String judul,aktor,sutradara,publisher;
    int stock;
    int kategori;
    String lagi;
}
class vcd extends Rental{
    public String judul()
    {return(judul);}
    public String aktor()
    {return(aktor);}
    public String sutradara()
    {return(sutradara);}
    public String publisher()
    {return(publisher);}
    public int kategori()
    {return(kategori);}
     public int stock()
    {return(stock);}
}
public class rentalvcdmodul2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        vcd rent = new vcd();
        System.out.println("===================================================================");
        System.out.println("                         Rental VCD                                ");
        System.out.println("===================================================================");
        int pilih = 1;
        while (pilih==1) {

            System.out.println("Judul               : ");
            rent.judul = input.nextLine();

            System.out.println("Aktor               : ");
            rent.aktor = input.nextLine();

            System.out.println("Sutradara           : ");
            rent.sutradara = input.nextLine();

            System.out.println("Publisher                : ");
            rent.publisher = input.nextLine();

            System.out.println("Stok                     : ");
            rent.stock = input.nextInt();

            System.out.println("Kategori                 : ");
            System.out.println("1. Semua Umur");
            System.out.println("2. Dewasa");
            System.out.println("3. Remaja");
            System.out.println("4. Anak-anak");
            System.out.println("Masukkan Pilihan         : ");
            rent.kategori = input.nextInt();

            System.out.println("===================================================================");
            System.out.println("                        DAFTAR FILM                                ");
            System.out.println("===================================================================");

            System.out.println("Judul Film                  : " + rent.judul);
            System.out.println("Aktor                       : " + rent.aktor);
            System.out.println("Sutradara                   : " + rent.sutradara);
            System.out.println("Publisher                   : " + rent.publisher);
            switch (rent.kategori) {
            case 1:
                System.out.println("Kategori                    : Semua Umur (SU)");
                break;
            case 2:
                System.out.println("Kategori                    : Dewasa (D)");
                break;
            case 3:
                System.out.println("Kategori                    : Remaja (R)");
                break;
            case 4:
                System.out.println("Kategori                    : Anak-anak (AA)");
                break;

            }
            System.out.println("Stok                        : " + rent.stock);

            System.out.println("Lakukan Lagi? : ( 1 untuk Ya dan 0 untuk Tidak )");
            pilih=input.nextInt();
            if(pilih!=1){
              pilih=0;
            }
        }
    }   
}