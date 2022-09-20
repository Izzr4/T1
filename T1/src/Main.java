import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double jari, tinggi, luas,volume;
        byte pilihan;
        System.out.println("===== Program Menghitung Luas Permukaan / Volume Tabung ====");
        System.out.println("Mau menghitung apa?\n1. Luas\n2. Volumne");
        System.out.print("Pilihan Anda: ");
        pilihan = input.nextByte(); //Mengambil inputan user
        System.out.println("=================================\n");

        if (pilihan == 1)   //input user = 1
        {
            System.out.println("Menghitung Luas Tabung ");
            System.out.print("Masukkan Jari-jari\t: ");
            jari = input.nextDouble();

            System.out.print("Masukkan Tinggi\t\t: ");
            tinggi = input.nextDouble();
            luas = 2 * Math.PI * jari * (jari+tinggi);

            System.out.print("Berikut Cara Menghitung Luas Permukaan: ");
            System.out.println("2 x 3.14 x R x (R+T)");
            System.out.printf("Luas Tabung\t\t\t: %.3f\n\n",luas);
            System.out.println("===== Program Selesai =====");


        }else if (pilihan == 2) //input user = 2

        {
            System.out.print("Masukkan Jari-jari\t: ");
            jari = input.nextDouble();

            System.out.print("Masukkan Tinggi\t\t: ");
            tinggi = input.nextDouble();
            volume = Math.PI * jari * jari * tinggi;

            System.out.print("Berikut Cara Menghitung Volume: ");
            System.out.println("3.14 x R x R x T");
            System.out.printf("Volume Tabung\t\t: %.3f\n\n", volume);
            System.out.println("===== Program Selesai =====");

        }
        else { //Inputan user tidak 1 ataupun 2
            System.out.println("PILIHAN CUMA ADA 2!");
        }
    }
}
