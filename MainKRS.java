import java.util.Scanner;
public class MainKRS {
    public static void menu() {
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Proses KRS");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan 2 Antrian Depan");
        System.out.println("5. Tampilkan Antrian Belakang");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Jumlah Sudah Proses");
        System.out.println("8. Jumlah Belum Proses");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;

        do {
            menu();
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);

                    antrian.Enqueue(mhs);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.peek();
                    break;

                case 5:
                    antrian.lihatBelakang();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahProses();
                    break;

                case 8:
                    antrian.belumProses();
                    break;

                case 9:
                    antrian.clear();
                    break;
            }

        } while (pilih >= 1 && pilih <= 9);
    }
}

