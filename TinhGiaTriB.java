import java.util.Scanner;

class GiaTriB {
    private int x;

    public void nhap(Scanner scanner) {
        x = scanner.nextInt();
    }

    public int congThuc1() {
        return x * x * x + 2 * x * x + 5 * x;
    }

    public int congThuc2() {
        return x * x - 2 * x + 4;
    }

    public int congThuc3() {
        return 5 * x - 8;
    }

    public boolean dk1() {
        return x > 3;
    }

    public boolean dk2() {
        return x >= 1;
    }

    public void xuat(int num) {
        System.out.println(num);
    }
}

public class TinhGiaTriB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GiaTriB b = new GiaTriB();

        b.nhap(scanner);

        if (b.dk1()) {
            b.xuat(b.congThuc1());
        } else if (b.dk2()) {
            b.xuat(b.congThuc2());
        } else {
            b.xuat(b.congThuc3());
        }

        scanner.close();
    }
}
