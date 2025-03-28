import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = input6.nextInt();
        input6.nextLine(); 

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input6.nextLine();
            System.out.print("Nama  : ");
            String nama = input6.nextLine();
            System.out.print("Kelas : ");
            String kelas = input6.nextLine();
            System.out.print("IPK   : ");
            double ipk = input6.nextDouble();
            input6.nextLine(); 
            System.out.println("------------------------------");
            list.tambah(new Mahasiswa06(nim, nama, kelas, ipk));
        }

        System.out.println("Data Mahasiswa Sebelum Sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("Data Mahasiswa Setelah Sorting:");
        list.tampil();

        System.out.println("------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan IPK Mahasiswa yang dicari: ");
        double cari = input6.nextDouble();

        System.out.println("\nMenggunakan Sequential Searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        System.out.println("\nMenggunakan Binary Searching");
        int posisi2 = list.findBinarySearch(cari, 0, list.idx - 1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
    }
}