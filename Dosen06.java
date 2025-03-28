public class Dosen06 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen06(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println(kode + " | " + nama + " | " + (jenisKelamin ? "Laki-laki" : "Perempuan") + " | Usia: " + usia);
    }
}
