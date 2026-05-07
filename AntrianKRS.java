public class AntrianKRS {
    MahasiswaKRS[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses;

    public AntrianKRS(int n) {
        max = n;
        data = new MahasiswaKRS[max];
        size = 0;
        front = rear = -1;
        sudahProses = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void Enqueue(MahasiswaKRS mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }

            data[rear] = mhs;
            size++;
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
        } else if (sudahProses >= 30) {
            System.out.println("Kuota proses KRS sudah penuh");
        } else {
            System.out.println("Mahasiswa diproses:");

            for (int i = 0; i < 2; i++) {
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahProses++;
            }
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;

            while (i != rear) {
                data[i].tampilkanData();
                System.out.println("----------------");
                i = (i + 1) % max;
            }

            data[i].tampilkanData();
        }
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else if (size == 1) {
            System.out.println("Hanya ada 1 antrian:");
            data[front].tampilkanData();
        } else {
            System.out.println("2 Antrian terdepan:");

            data[front].tampilkanData();

            int kedua = (front + 1) % max;
            data[kedua].tampilkanData();
    }
}

    public void lihatBelakang() {
        System.out.println("Antrian paling belakang:");
        data[rear].tampilkanData();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian : " + size);
    }

    public void jumlahProses() {
        System.out.println("Sudah proses : " + sudahProses);
    }

    public void belumProses() {
        System.out.println("Belum proses : " + (30 - sudahProses));
    }
}

