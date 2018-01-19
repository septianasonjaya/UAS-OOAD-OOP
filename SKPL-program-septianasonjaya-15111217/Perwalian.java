import java.util.Scanner;
class Perwalian {

	int nim;
	String nama;
	int password;
	int no;
	int noreg;
	int jurusan;
	int semester;
	int pilih;

	void Perwalian(){

		Scanner scan = new Scanner (System.in);

		while(no==0)
		{
		System.out.println("Masukan NIM");
		System.out.println("***********************");
		System.out.println();
		System.out.print ("NIM : ");
		nim = scan.nextInt();
		System.out.print ("NAMA : ");
		nama = scan.nextLine();
		nama = scan.nextLine();
		System.out.print ("PASSWORD (1234) : ");
		password = scan.nextInt();

		if (password == 1234){
			//nextblablabla
			System.out.println ();
			System.out.println ("Selamat Datang " + nama);
			System.out.println ("Mahasiswa Sekolah Tinggi Teknologi Bandung");
			System.out.println ("******************************************");
			System.out.println ();
			System.out.println ("Silahkan isi form perwalian berikut ");
			System.out.println ();
			System.out.print ("Pilih Semester lanjutan (2/3/4/5/6/7/8) : ");
			semester = scan.nextInt();
			System.out.println ("Pilih Jurusan : ");
			System.out.println ("1. Teknik Industri");
			System.out.println ("2. Teknik Informatika");
			System.out.println ("3. Design Komunikasi Visual");
			System.out.println ("Pilihan : ");
			//jurusan = scan.nextInt();
			jurusan = scan.nextInt();
			System.out.println("Nomor Registrasi Perwalian Sedang diProses..");
			System.out.println ();
			System.out.println ("Terima Kasih telah melakukan Perwalian Semester Lanjutan..");
			System.out.println ();
			System.out.println ("**********************************************************");
			System.out.println ("Silahkan masukan Nomor Registrasi Akhir Transaksi dibawah ini ");
			System.out.println("***********************************************************");
			System.out.print("Nomor Registrasi (6 digit) : ");
			noreg = scan.nextInt();
			System.out.println();
			System.out.println();
			System.out.println("Nomor Registrasi Sedang diProses..");
			System.out.println();
			System.out.println();
			System.out.println("Proses Transaksi Berhasil..");
			System.out.println("---------------------------");
			System.out.println();

			System.out.println("Harap menunggu konfirmasi pengesahan dari Akademik dan Wali Dosen");
			System.out.println("*********************************");
			System.out.println("");
			System.out.println("");
			System.out.println("*********************************");
			System.out.println("Selamat, anda telah disetujui oleh akademik dan Dosen Wali..");
			System.out.println("");
			System.out.println("Mengetahui");
			System.out.println("");
			System.out.println("Bapak Asep Suparna.MM");
			System.out.println("Akademik STTBandung");
			System.out.println("---------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("Mengetahui");
			System.out.println("");
			System.out.println("Bapak Ahmad Salim.MM");
			System.out.println("Wali Dosen STTBandung");
			System.out.println("---------------------");
			System.out.println("");
			System.out.println("");

			System.out.println("== Berikut Nomor KHS anda ==");
			System.out.println("----------------------------");
			System.out.println();
			System.out.println("== NOMOR RESI KHS == ");
			System.out.println("1232283938");
			System.out.println();
			System.out.println("== NIM == ");
			System.out.println(nim);
			System.out.println();
			System.out.println("== NAMA == ");
			System.out.println(nama);
			System.out.println();
			System.out.println("== JURUSAN == ");
			if (jurusan==1){
			System.out.println("TEKNIK INDUSTRI");
			System.out.println();
			}
			else if (jurusan==2){
			System.out.println("TEKNIK INFORMATIKA");
			System.out.println();
			}
			else if (jurusan==3){
			System.out.println("DESIGN KOMUNIKASI VISUAL");
			System.out.println();
			}

			System.out.println("== SEMESTER == ");
			System.out.println(semester);
			System.out.println();
			System.out.println("*********************************");
			System.out.println("*********************************");
			System.out.println();


			System.out.println ("Info Lebih lanjut dapat dilihat di SttBandung.ac.id");
			System.out.println("*********************************");
			System.out.println("*********************************");
			System.out.println();
			System.out.println();
			System.out.println ("Menu Pilihan : ");
			System.out.println ("2. kembali ke Menu Utama");
 			System.out.println ("3. Keluar dari Sistem");
 			System.out.print("Pilihan : ");
			pilih = scan.nextInt();
				if (pilih==2){
					System.out.println ("Terima kasih, Sistem kembali ke Halaman utama,");
					no=1;		
				}
				else if (pilih==3){
					System.exit(0);
				}
				else{
					System.out.println ("Permintaan tidak ada !");
					System.out.println ("Mohon isi pilihan yang tersedia...");
					System.out.println ("Sistem error...");
					System.out.println ("");
					no=1;
				}//end menu pilihan



			
		}//end pass correct
		else{
			System.out.println ();
			System.out.println("Password salah..");
			System.out.println("Silahkan Ulangi untuk login account !! ");
			System.out.println ();
			no=0;//kembali ke input nim
		}//end salah
		}//end while all
	}
}