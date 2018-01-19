import java.util.Scanner;
class UjianMasuk extends Mahasiswa{
    static String jwb1, jwb2, jwb3, jwb4;
    static int skor, skor1, skor2, skor3, skor4, skor5;
    
    void industri(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("******************************************************************************");
        System.out.println("                     Form Tes Jurusan Teknik Industri");
        System.out.println("******************************************************************************");
        System.out.println("1. 600 : 5 x 0 =");
        System.out.println("    a.0      b. 5000");
        System.out.println("2. saban sinonimnya = ");
        System.out.println("    a. tiap       b.jarang");
        System.out.println("3. capek >< = ");
        System.out.println("    a. lelah       b.segar");
        System.out.println("4.  wilma selalu mandi setiap hari, kecuali hanya jika ia sakit ,Hari ini Wilma sakit =");
        System.out.println("    a. wilma pergi ke dokter     b.wilma tidak mandi");
        

        System.out.println("Jawaban");
        System.out.print("1. ");
        jwb1 = input.nextLine();
        System.out.print("2. ");
        jwb2 = input.nextLine();
        System.out.print("3. ");
        jwb3 = input.nextLine();
        System.out.print("4. ");
        jwb4 = input.nextLine();


        if(jwb1.equalsIgnoreCase("a") || jwb1.equalsIgnoreCase("A")){
            skor1 = 25;
        }
        if(jwb2.equalsIgnoreCase("a") || jwb2.equalsIgnoreCase("A")){
            skor2 = 25;
        }
        if (jwb3.equalsIgnoreCase("b") || jwb3.equalsIgnoreCase("B")){
            skor3 = 25;
        }
        if(jwb4.equalsIgnoreCase("b") || jwb3.equalsIgnoreCase("B")){
            skor4 = 25;
        }

        skor = skor1 + skor2 + skor3 + skor4;
        System.out.println("Skor Anda : " + skor);

        if(skor == 100 || skor == 75 || skor == 50){
            System.out.println("Selamat Anda LULUS");
            System.out.println("**** NPM ANDA : 17111002 ****");
        }else{
            System.out.println("Maaf Anda TIDAK LULUS");
        }


    }

    void informatika(){
        
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("******************************************************************************");
        System.out.println("                    Form Tes Jurusan Teknik Informatika");
        System.out.println("******************************************************************************");
        System.out.println("1. Applikasi sosmed paling jadul adalah : ");
        System.out.println("    a. WA      b. friendster");
        System.out.println("2. alat penyimpan data adalah :  ");
        System.out.println("    a. kabel data       b.flashdisc");
        System.out.println("3. Program komputer yang digunakan untuk mengakses informasi yang ada di internet adalah : ");
        System.out.println("    a. Browser Internet       b.HTTP");
        System.out.println("4. Software komputer yang digunakan untuk presentasi disebut : ");
        System.out.println("    a. MS.power point     b.MS.Access");
        

        System.out.println("Jawaban");
        System.out.print("1. ");
        jwb1 = input.nextLine();
        System.out.print("2. ");
        jwb2 = input.nextLine();
        System.out.print("3. ");
        jwb3 = input.nextLine();
        System.out.print("4. ");
        jwb4 = input.nextLine();

        
        if(jwb1.equalsIgnoreCase("b") || jwb1.equalsIgnoreCase("B")){
            skor1 = 25;
        }
        if(jwb2.equalsIgnoreCase("b") || jwb2.equalsIgnoreCase("B")){
            skor2 = 25;
        }
        if (jwb3.equalsIgnoreCase("a") || jwb3.equalsIgnoreCase("A")){
            skor3 = 25;
        }
        if(jwb4.equalsIgnoreCase("a") || jwb4.equalsIgnoreCase("A")){
            skor4 = 25;
        }

        skor = skor1 + skor2 + skor3 + skor4;
        System.out.println("Skor Anda : " + skor);

        if(skor == 100 || skor == 75 || skor == 50){
            System.out.println("Selamat Anda LULUS");
            System.out.println("**** NPM ANDA : 17111001 ****");
        }else{
            System.out.println("Maaf Anda TIDAK LULUS");
        }
    }
   

}