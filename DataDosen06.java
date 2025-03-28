public class DataDosen06 {
    Dosen06[] dataDosen = new Dosen06[10];
    int idx = 0;
    
    void tambah(Dosen06 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }
    }
    
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }
    
    void ASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen06 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    
    void DSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen06 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
    
    void pencarianDataSequential(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ada lebih dari satu dosen dengan nama yang sama!");
        }
    }
    
    void pencarianDataBinary(int usia) {
        ASC();
        int left = 0, right = idx - 1;
        int count = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == usia) {
                int i = mid;
                while (i >= left && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    count++;
                    i--;
                }
                i = mid + 1;
                while (i <= right && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    count++;
                    i++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (count == 0) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ada lebih dari satu dosen dengan usia yang sama!");
        }
    }
}
