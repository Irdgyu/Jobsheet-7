public class MahasiswaBerprestasi06 {
    Mahasiswa06[] listMhs;
    int idx = 0;

    MahasiswaBerprestasi06(int jumlah) {
        listMhs = new Mahasiswa06[jumlah];
    }

    void tambah(Mahasiswa06 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("--------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    int sequentialSearching(double cari) {
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].ipk == cari) {
                return j;
            }
        }
        return -1;
    }

    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            } else if (listMhs[mid].ipk > cari) { // Perbaikan arah pencarian
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            Mahasiswa06 m = listMhs[pos];
            System.out.println("NIM   : " + m.nim);
            System.out.println("Nama  : " + m.nama);
            System.out.println("Kelas : " + m.kelas);
            System.out.println("IPK   : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}