import java.util.Scanner;
public class Menu{
        int pil;

        Keuangan pay = new Keuangan();
        Perwalian pw1 = new Perwalian();
        void printMenu(){
        
        Scanner in = new Scanner (System.in);
        System.out.println ("*************************************************");
		System.out.println ("");
		System.out.println ("                  MENU UTAMA                     ");
		System.out.println ("                Selamat Datang                   ");
		System.out.println ("         Sekolah Tinggi Teknologi Bandung        ");
		System.out.println ("*************************************************");
		System.out.println ("");
        System.out.println("1. Pendaftaran");
        System.out.println("2. Perwalian");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan : ");
        pil = in.nextInt();
        switch (pil){
            case 1:
                pay.bayarRegis();
                break;
            case 2 :
                pay.bayarPerwalian();
                break;
            case 3: 
                break;
            default :
            System.out.println("Masukkan Pilihan 1 - 3 !");
            printMenu();
            
        }
        

    }

    }
