
package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa edho = new Mahasiswa("2110010148","Ridho","TI");
        System.out.println("Nama Mahasiswa = "+edho.getNpm());
        System.out.println("NPM Mahasiswa = "+edho.getNama());
        System.out.println("Prodi Mahasiswa = "+edho.getProdi());
    }
}
