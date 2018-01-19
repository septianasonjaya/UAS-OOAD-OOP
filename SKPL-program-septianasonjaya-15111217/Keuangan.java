class Keuangan{
    Mahasiswa mhs = new Mahasiswa();
    
    void bayarRegis(){
        System.out.println("");
        System.out.println("Lakukan Pembayaran Rp. 300.000 untuk melakukan Pendaftaran");
        System.out.println("");
        mhs.pembayaran();   
    }

    void bayarPerwalian(){
        System.out.println("");
        System.out.println("Lakukan Pembayaran Rp. 4.725.000 untuk melakukan Perwalian");
        System.out.println("");
        mhs.pembayaran();
}
}
