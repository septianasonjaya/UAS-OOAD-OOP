import java.util.Scanner;
class Mahasiswa{
    String nama, email, mk1, mk2, mk3;
    int pil, no_hp, jurusan, bayar, semester, npm, sks, sks1, sks2, sks3;
    boolean simpan, pilih;
        

    void registrasi(){
        Scanner input = new Scanner (System.in);
        UjianMasuk ujian = new UjianMasuk();

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Form Pendaftaran");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Nama              : ");
        nama = input.nextLine();
        System.out.print("Email             : ");
        email = input.nextLine();
        System.out.print("No Hp             : ");
        no_hp = input.nextInt();
        System.out.println("Jurusan           : 1. Teknik Industri ");
        System.out.println("                    2. Teknik Informatika");
        System.out.println("                    3. DKV");
        System.out.print("Masukkan Pilihan  : ");
        jurusan = input.nextInt();
        switch (jurusan){
            case 1 :
                System.out.print("Teknik Industri");
                break;
            case 2 :
                System.out.print("Teknik Informatika");
                break;
            case 3 :
                System.out.print("DKV");
                break;
            
            default :
            System.out.println("Masukkan Pilihan 1-3 !");
                registrasi();
        }

        System.out.println("");
        System.out.print("Simpan Data ? (true/false) : ");
        simpan = input.nextBoolean();

        if (simpan == true && jurusan == 1){
            System.out.println("Data Berhasil Disimpan");
            ujian.industri();
        }else if (simpan == true && jurusan == 2){
            System.out.println("Data Berhasil Disimpan");
            ujian.informatika();
        }else{
            System.out.println("");
            System.out.println("Data Gagal Disimpan");
            System.out.println("");
            System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
            pilih = input.nextBoolean();

            if(pilih == false){
                registrasi();
            }
        }
    }

    void pembayaran(){
        Scanner input = new Scanner (System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Form Pembayaran");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Masukkan Nominal : ");
        bayar = input.nextInt();

        if (bayar == 300000){
            System.out.println("Pembayaran Sukses !");
            registrasi();
        }else if (bayar == 4725000){
            System.out.println("Pembayaran Sukses !");
            perwalian();
        }else{
            System.out.println("Lakukan Pembayaran sesuai dengan nominal yg ditentukan !");
            System.out.println("");
            System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
            pilih = input.nextBoolean();

            if(pilih == false){
                pembayaran();
            }
        }

    }
    void perwalian(){
        Scanner input = new Scanner (System.in);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Form Perwalian");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Masukkan NPM              : ");
        npm = input.nextInt();
        System.out.print("Masukkan Semester (1/2)   : ");
        semester = input.nextInt();
        System.out.println("Jurusan                   : 1. Teknik Industri ");
        System.out.println("                            2. Teknik Informatika");
        System.out.println("                            3. DKV");
        System.out.print("Masukkan Jurusan          : ");
        jurusan = input.nextInt();

        if (semester == 1 && jurusan == 1){
            mkIndustri1();
        }else if (semester == 2 && jurusan == 1){
            mkIndustri2();
        }else if (semester == 1 && jurusan == 2){
                mkInformatika1();
        }else if(semester == 2 && jurusan ==2){
                mkInformatika2();
        }else{
            System.out.println("");
            System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
            pilih = input.nextBoolean();
            
            if(pilih == false){
                perwalian();
            }
            }

    }
    void mkIndustri1(){

            Scanner input = new Scanner (System.in);

            System.out.println("");
            System.out.println("Jumlah SKS yang harus diambil adalah : 9");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("                       Daftar Mata Kuliah Semester 1");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("1. Kalkulus                         3 SKS");
            System.out.println("2. Bahasa Inggris                   4 SKS");
            System.out.println("3. Fisika                           2 SKS");
            System.out.println("4. Pengantar TI                     6 SKS");
            System.out.println("Input Mata Kuliah yang akan diambil sesuai daftar diatas : ");
            System.out.print("1. ");
            mk1 = input.nextLine();
            System.out.print("2. ");
            mk2 = input.nextLine();
            System.out.print("3. ");
            mk3 = input.nextLine();

            System.out.print("Simpan Data ? (true/false) : ");
            simpan = input.nextBoolean();

            if(simpan == true){
                if(mk1.equalsIgnoreCase("kalkulus") || mk1.equalsIgnoreCase("Kalkulus") || mk1.equalsIgnoreCase("KALKULUS")){
                    sks1 = 3;
                }else if(mk1.equalsIgnoreCase("bahasa inggris") || mk1.equalsIgnoreCase("Bahasa Inggris") || mk1.equalsIgnoreCase("Bahasa inggris") || mk1.equalsIgnoreCase("BAHASA INGGRIS")){
                    sks1 = 4;
                }else if(mk1.equalsIgnoreCase("fisika") || mk1.equalsIgnoreCase("Fisika") || mk1.equalsIgnoreCase("FISIKA")){
                    sks1 = 2;
                }else if(mk1.equalsIgnoreCase("pengantar ti") || mk1.equalsIgnoreCase("Pengantar TI") || mk1.equalsIgnoreCase("Pengantar ti") || mk1.equalsIgnoreCase("PENGANTAR TI")){
                    sks1 = 6;
                }

                if(mk2.equalsIgnoreCase("kalkulus") || mk2.equalsIgnoreCase("Kalkulus") || mk2.equalsIgnoreCase("KALKULUS")){
                    sks2 = 3;
                }else if(mk2.equalsIgnoreCase("bahasa inggris") || mk2.equalsIgnoreCase("Bahasa Inggris") || mk2.equalsIgnoreCase("Bahasa inggris") || mk2.equalsIgnoreCase("BAHASA INGGRIS")){
                    sks2 = 4;
                }else if(mk2.equalsIgnoreCase("fisika") || mk2.equalsIgnoreCase("Fisika") || mk2.equalsIgnoreCase("FISIKA")){
                    sks2 = 2;
                }else if(mk2.equalsIgnoreCase("pengantar ti") || mk2.equalsIgnoreCase("Pengantar TI") || mk2.equalsIgnoreCase("Pengantar ti") || mk2.equalsIgnoreCase("PENGANTAR TI")){
                    sks2 = 6;
                }

                if(mk3.equalsIgnoreCase("kalkulus") || mk3.equalsIgnoreCase("Kalkulus") || mk3.equalsIgnoreCase("KALKULUS")){
                    sks3 = 3;
                }else if(mk3.equalsIgnoreCase("bahasa inggris") || mk3.equalsIgnoreCase("Bahasa Inggris") || mk3.equalsIgnoreCase("Bahasa inggris") || mk3.equalsIgnoreCase("BAHASA INGGRIS")){
                    sks3 = 4;
                }else if(mk3.equalsIgnoreCase("fisika") || mk3.equalsIgnoreCase("Fisika") || mk3.equalsIgnoreCase("FISIKA")){
                    sks3 = 2;
                }else if(mk3.equalsIgnoreCase("pengantar ti") || mk3.equalsIgnoreCase("Pengantar TI") || mk3.equalsIgnoreCase("Pengantar ti") || mk3.equalsIgnoreCase("PENGANTAR TI")){
                    sks3 = 6;
                }

                sks = sks1 + sks2 + sks3;

                if (sks == 9){
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("                  KRS Semester Ganjil TEKNIK INDUSTRI");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    NIM     : " + npm);
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Rencana Studi Semester          |");
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Mata Kuliah         |     SKS   |");
                    System.out.print("1. " + mk1);
                    System.out.print("            | " + sks1);
                    System.out.println(" SKS");
                    System.out.print("2. " + mk2 );
                    System.out.print("            | "+ sks2);
                    System.out.println(" SKS");
                    System.out.print("3. " + mk3);
                    System.out.print("           | "+ sks3);
                    System.out.println(" SKS");

                }else{
                    System.out.println("");
                    System.out.println("Perwalian Gagal, Mata Kuliah yang Diambil Tidak sesuai dengan SKS yang sudah ditentukan !!");
                    System.out.println("");
                    System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                        mkIndustri1();
                    }
                        
                }

            }else{
                System.out.println("");
                System.out.println("Data Gagal Disimpan");
                System.out.println("");
                System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                         mkIndustri1();
                    }
                       
            }
        
    }





    void mkIndustri2(){

            Scanner input = new Scanner (System.in);

            System.out.println("");
            System.out.println("Jumlah SKS yang harus diambil adalah : 10");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("                       Daftar Mata Kuliah Semester 2");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("1. Statistika                             3 SKS");
            System.out.println("2. Penelitian Operasional                 3 SKS");
            System.out.println("3. Pengetahuan Bahan                      3 SKS");
            System.out.println("4. Manajemen Kinerja                      4 SKS");
            System.out.println("Input Mata Kuliah yang akan diambil sesuai Daftar diatas: ");
            System.out.print("1. ");
            mk1 = input.nextLine();
            System.out.print("2. ");
            mk2 = input.nextLine();
            System.out.print("3. ");
            mk3 = input.nextLine();

            System.out.print("Simpan Data ? (true/false) : ");
            simpan = input.nextBoolean();

            if(simpan == true){
                if(mk1.equalsIgnoreCase("statistika") || mk1.equalsIgnoreCase("Statistika") || mk1.equalsIgnoreCase("STATISTIKA")){
                    sks1 = 3;
                }else if(mk1.equalsIgnoreCase("penelitian operasional") || mk1.equalsIgnoreCase("Penelitian Opersional") || mk1.equalsIgnoreCase("Penelitian opersional") || mk1.equalsIgnoreCase("PENELITIAN OPERASIONAL")){
                    sks1 = 3;
                }else if(mk1.equalsIgnoreCase("pengetahuan bahan") || mk1.equalsIgnoreCase("Pengetahuan Bahan") || mk1.equalsIgnoreCase("Pengetahuan bahan") || mk1.equalsIgnoreCase("PENGETAHUAN BAHAN")){
                    sks1= 3;
                }else if(mk1.equalsIgnoreCase("manajemen kinerja") || mk1.equalsIgnoreCase("Manajemen Kinerja") || mk1.equalsIgnoreCase("Manajemen kinerja") || mk1.equalsIgnoreCase("MANAJEMEN KINERJA")){
                    sks1 = 4;
                }

                if(mk2.equalsIgnoreCase("statistika") || mk2.equalsIgnoreCase("Statistika") || mk2.equalsIgnoreCase("STATISTIKA")){
                    sks2 = 3;
                }else if(mk2.equalsIgnoreCase("penelitian operasional") || mk2.equalsIgnoreCase("Penelitian Opersional") || mk2.equalsIgnoreCase("Penelitian opersional") || mk2.equalsIgnoreCase("PENELITIAN OPERASIONAL")){
                    sks2 = 3;
                }else if(mk2.equalsIgnoreCase("pengetahuan bahan") || mk2.equalsIgnoreCase("Pengetahuan Bahan") || mk2.equalsIgnoreCase("Pengetahuan bahan") || mk2.equalsIgnoreCase("PENGETAHUAN BAHAN")){
                    sks2 = 3;
                }else if(mk2.equalsIgnoreCase("manajemen kinerja") || mk2.equalsIgnoreCase("Manajemen Kinerja") || mk2.equalsIgnoreCase("Manajemen kinerja") || mk2.equalsIgnoreCase("MANAJEMEN KINERJA")){
                    sks2 = 4;
                }

                if(mk3.equalsIgnoreCase("statistika") || mk3.equalsIgnoreCase("Statistika") || mk3.equalsIgnoreCase("STATISTIKA")){
                    sks3 = 3;
                }else if(mk3.equalsIgnoreCase("penelitian operasional") || mk3.equalsIgnoreCase("Penelitian Opersional") || mk3.equalsIgnoreCase("Penelitian opersional") || mk3.equalsIgnoreCase("PENELITIAN OPERASIONAL")){
                    sks3 = 3;
                }else if(mk3.equalsIgnoreCase("pengetahuan bahan") || mk3.equalsIgnoreCase("Pengetahuan Bahan") || mk3.equalsIgnoreCase("Pengetahuan bahan") || mk3.equalsIgnoreCase("PENGETAHUAN BAHAN")){
                     sks3 = 3;
                }else if(mk3.equalsIgnoreCase("manajemen kinerja") || mk3.equalsIgnoreCase("Manajemen Kinerja") || mk3.equalsIgnoreCase("Manajemen kinerja") || mk3.equalsIgnoreCase("MANAJEMEN KINERJA")){
                    sks3 = 4;
                }

                sks = sks1 + sks2 + sks3;

                if (sks == 10){
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("                   KRS Semester Genap TEKNIK INDUSTRI");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    NIM     : " + npm);
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Rencana Studi Semester          |");
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Mata Kuliah         |     SKS   |");
                    System.out.print("1. " + mk1);
                    System.out.print("            | " + sks1);
                    System.out.println(" SKS");
                    System.out.print("2. " + mk2 );
                    System.out.print("            | "+ sks2);
                    System.out.println(" SKS");
                    System.out.print("3. " + mk3);
                    System.out.print("           | "+ sks3);
                    System.out.println(" SKS");

                }else{
                    System.out.println("");
                    System.out.println("Perwalian Gagal, Mata Kuliah yang Diambil Tidak sesuai dengan SKS yang sudah ditentukan !!");
                    System.out.println("");
                    System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                        mkIndustri2();
                    }
                        
                }

            }else{
                System.out.println("");
                System.out.println("Data Gagal Disimpan");
                System.out.println("");
                System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                         mkIndustri2();
                    }
            }
    }




    void mkInformatika1(){

            Scanner input = new Scanner (System.in);

            System.out.println("");
            System.out.println("Jumlah SKS yang harus diambil adalah : 9");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("                       Daftar Mata Kuliah Semester 1");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("1. Kalkulus                         3 SKS");
            System.out.println("2. Bahasa Inggris                   4 SKS");
            System.out.println("3. Fisika                           2 SKS");
            System.out.println("4. Algoritma                        6 SKS");
            System.out.println("Input Mata Kuliah yang akan diambil sesuai daftar diatas : ");
            System.out.print("1. ");
            mk1 = input.nextLine();
            System.out.print("2. ");
            mk2 = input.nextLine();
            System.out.print("3. ");
            mk3 = input.nextLine();

            System.out.print("Simpan Data ? (true/false) : ");
            simpan = input.nextBoolean();

            if(simpan == true){
                if(mk1.equalsIgnoreCase("kalkulus") || mk1.equalsIgnoreCase("Kalkulus") || mk1.equalsIgnoreCase("KALKULUS")){
                    sks1 = 3;
                }else if(mk1.equalsIgnoreCase("bahasa inggris") || mk1.equalsIgnoreCase("Bahasa Inggris") || mk1.equalsIgnoreCase("Bahasa inggris") || mk1.equalsIgnoreCase("BAHASA INGGRIS")){
                    sks1 = 4;
                }else if (mk1.equalsIgnoreCase("fisika") || mk1.equalsIgnoreCase("Fisika") || mk1.equalsIgnoreCase("FISIKA")){
                    sks1 = 2;
                }else if (mk1.equalsIgnoreCase("algoritma") || mk1.equalsIgnoreCase("Algoritma") || mk1.equalsIgnoreCase("ALGORITMA")){
                    sks1 = 6;
                }

                if(mk2.equalsIgnoreCase("kalkulus") || mk2.equalsIgnoreCase("Kalkulus") || mk2.equalsIgnoreCase("KALKULUS")){
                    sks2 = 3;
                }else if(mk2.equalsIgnoreCase("bahasa inggris") || mk2.equalsIgnoreCase("Bahasa Inggris") || mk2.equalsIgnoreCase("Bahasa inggris") || mk2.equalsIgnoreCase("BAHASA INGGRIS")){
                    sks2 = 4;
                }else if (mk2.equalsIgnoreCase("fisika") || mk2.equalsIgnoreCase("Fisika") || mk2.equalsIgnoreCase("FISIKA")){
                    sks2 = 2;
                }else if (mk2.equalsIgnoreCase("algoritma") || mk2.equalsIgnoreCase("Algoritma") || mk2.equalsIgnoreCase("ALGORITMA")){
                    sks2 = 6;
                }

                if(mk3.equalsIgnoreCase("kalkulus") || mk3.equalsIgnoreCase("Kalkulus") || mk3.equalsIgnoreCase("KALKULUS")){
                    sks3 = 3;
                }else if(mk3.equalsIgnoreCase("bahasa inggris") || mk3.equalsIgnoreCase("Bahasa Inggris") || mk3.equalsIgnoreCase("Bahasa inggris") || mk3.equalsIgnoreCase("BAHASA INGGRIS")){
                    sks3 = 4;
                }else if (mk3.equalsIgnoreCase("fisika") || mk3.equalsIgnoreCase("Fisika") || mk3.equalsIgnoreCase("FISIKA")){
                    sks3 = 2;
                }else if (mk3.equalsIgnoreCase("algoritma") || mk3.equalsIgnoreCase("Algoritma") || mk3.equalsIgnoreCase("ALGORITMA")){
                    sks3 = 6;
                }

                sks = sks1 + sks2 + sks3;

                if (sks == 9){
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("                  KRS Semester Ganjil TEKNIK INFORMATIKA");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    NIM     : " + npm);
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Rencana Studi Semester          |");
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Mata Kuliah         |     SKS   |");
                    System.out.print("1. " + mk1);
                    System.out.print("                  | " + sks1);
                    System.out.println(" SKS");
                    System.out.print("2. " + mk2 );
                    System.out.print("            | "+ sks2);
                    System.out.println(" SKS");
                    System.out.print("3. " + mk3);
                    System.out.print("                    | "+ sks3);
                    System.out.println(" SKS");

                }else{
                    System.out.println("");
                    System.out.println("Perwalian Gagal, Mata Kuliah yang Diambil Tidak sesuai dengan SKS yang sudah ditentukan !!");
                    System.out.println("");
                    System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                         mkInformatika1();
                    }
                }

            }else{
                System.out.println("");
                System.out.println("Data Gagal Disimpan");
                System.out.println("");
                System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                         mkInformatika1();
                    }
            }
    }





    void mkInformatika2(){

        Scanner input = new Scanner (System.in);

            System.out.println("");
            System.out.println("Jumlah SKS yang harus diambil adalah : 10");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("                       Daftar Mata Kuliah Semester 2");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("1. Pemrograman Visual                   4 SKS");
            System.out.println("2. Arkom                                3 SKS");
            System.out.println("3. Web                                  3 SKS");
            System.out.println("4. Keamanan Jaringan                    3 SKS");
            System.out.println("Input Mata Kuliah yang akan diambil sesuai Daftar diatas : ");
            System.out.print("1. ");
            mk1 = input.nextLine();
            System.out.print("2. ");
            mk2 = input.nextLine();
            System.out.print("3. ");
            mk3 = input.nextLine();

            System.out.print("Simpan Data ? (true/false) : ");
            simpan = input.nextBoolean();

            if(simpan == true){
                if(mk1.equalsIgnoreCase("pemrograman visual") || mk1.equalsIgnoreCase("Pemrograman Visual") || mk1.equalsIgnoreCase("Pemrograman visual") || mk1.equalsIgnoreCase("PEMROGRAMAN VISUAL")){
                    sks1 = 4;
                }else if(mk1.equalsIgnoreCase("arkom") || mk1.equalsIgnoreCase("Arkom") || mk1.equalsIgnoreCase("ARKOM")){
                    sks1 = 3;
                }else if (mk1.equalsIgnoreCase("web") || mk1.equalsIgnoreCase("Web") ||mk1.equalsIgnoreCase("WEB")){
                    sks1 = 3;
                }else if (mk1.equalsIgnoreCase("keamanan jaringan") || mk1.equalsIgnoreCase("Keamanan Jaringan") || mk1.equalsIgnoreCase("Keamanan jaringan") || mk1.equalsIgnoreCase("KEAMANAN JARINGAN")){
                    sks1 = 3;
                }

                if(mk2.equalsIgnoreCase("pemrograman visual") || mk2.equalsIgnoreCase("Pemrograman Visual") || mk2.equalsIgnoreCase("Pemrograman visual") || mk2.equalsIgnoreCase("PEMROGRAMAN VISUAL")){
                    sks2 = 4;
                }else if(mk2.equalsIgnoreCase("arkom") || mk2.equalsIgnoreCase("Arkom") || mk2.equalsIgnoreCase("ARKOM")){
                    sks2 = 3;
                }else if (mk2.equalsIgnoreCase("web") || mk2.equalsIgnoreCase("Web") ||mk2.equalsIgnoreCase("WEB")){
                    sks2 = 3;
                }else if (mk2.equalsIgnoreCase("keamanan jaringan") || mk2.equalsIgnoreCase("Keamanan Jaringan") || mk2.equalsIgnoreCase("Keamanan jaringan") || mk2.equalsIgnoreCase("KEAMANAN JARINGAN")){
                    sks2 = 3;
                }

                if(mk3.equalsIgnoreCase("pemrograman visual") || mk3.equalsIgnoreCase("Pemrograman Visual") || mk3.equalsIgnoreCase("Pemrograman visual") || mk3.equalsIgnoreCase("PEMROGRAMAN VISUAL")){
                    sks3 = 4;
                }else if(mk3.equalsIgnoreCase("arkom") || mk3.equalsIgnoreCase("Arkom") || mk3.equalsIgnoreCase("ARKOM")){
                    sks3 = 3;
                }else if (mk3.equalsIgnoreCase("web") || mk3.equalsIgnoreCase("Web") ||mk3.equalsIgnoreCase("WEB")){
                    sks3 = 3;
                }else if (mk3.equalsIgnoreCase("keamanan jaringan") || mk3.equalsIgnoreCase("Keamanan Jaringan") || mk3.equalsIgnoreCase("Keamanan jaringan") || mk3.equalsIgnoreCase("KEAMANAN JARINGAN")){
                    sks3 = 3;
                }

                sks = sks1 + sks2 + sks3;

                if (sks == 10){
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("                   KRS Semester Genap TEKNIK INFORMATIKA");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    NIM     : " + npm);
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Rencana Studi Semester          |");
                    System.out.println("-----------------------------------------");
                    System.out.println("|        Mata Kuliah         |     SKS   |");
                    System.out.print("1. " + mk1);
                    System.out.print("         | " + sks1);
                    System.out.println(" SKS");
                    System.out.print("2. " + mk2 );
                    System.out.print("                | "+ sks2);
                    System.out.println(" SKS");
                    System.out.print("3. " + mk3);
                    System.out.print("                 | "+ sks3);
                    System.out.println(" SKS");

                }else{
                    System.out.println("");
                    System.out.println("Perwalian Gagal, Mata Kuliah yang Diambil Tidak sesuai dengan SKS yang sudah ditentukan !!");
                    System.out.println("");
                    System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                         mkInformatika2();
                    }
            }         

            }else{
                System.out.println("");
                System.out.println("Data Gagal Disimpan");
                System.out.println("");
                System.out.print("Apakah Anda Ingin Keluar (true/false) ?");
                    pilih = input.nextBoolean();

                    if(pilih == false){
                         mkInformatika2();
                    }

            }
            
    }
}