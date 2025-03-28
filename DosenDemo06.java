import java.util.Scanner;
public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen06 daftar = new DataDosen06();
        
        System.out.println("Masukkan data untuk 10 dosen:");
        for (int i = 0; i < 10; i++) {
            System.out.print("\nKode Dosen: ");
            String kode = input.nextLine();
            System.out.print("Nama Dosen: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = input.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();
            daftar.tambah(new Dosen06(kode, nama, jenisKelamin, usia));
        }
        
        System.out.println("\nData sebelum sorting:");
        daftar.tampil();
        
        daftar.ASC();
        System.out.println("\nData setelah Sorting ASC (Usia Termuda → Tertua):");
        daftar.tampil();
        
        daftar.DSC();
        System.out.println("\nData setelah Sorting DSC (Usia Tertua → Termuda):");
        daftar.tampil();
        
        System.out.print("\nMasukkan nama dosen yang ingin dicari: ");
        String cariNama = input.nextLine();
        daftar.pencarianDataSequential(cariNama);
        
        System.out.print("\nMasukkan usia dosen yang ingin dicari: ");
        int cariUsia = input.nextInt();
        daftar.pencarianDataBinary(cariUsia);
    }
}
