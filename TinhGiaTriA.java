import java.util.Scanner;

class VariableCalculator {
    private long x;

    public long get_x() {
        return x;
    }

    public void nhap(Scanner scanner) {
        x = scanner.nextLong();
    }

    public long congThuc1() {
        long t = (long) (Math.pow(x, 3));
        return (t + (5 * x));
    }

    public long congThuc2() {
        long t = (long) (Math.pow(x, 2));
        return (t - (2 * x) + 4);
    }

    public boolean dk1() {
        return x >= 10;
    }

    public void inGiaTri(long num) {
        System.out.println(num);
    }
}

public class TinhGiaTriA {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        VariableCalculator a = new VariableCalculator();

        a.nhap(scanner);

        if (a.dk1()) {
            a.inGiaTri(a.congThuc1());
        } else {
            a.inGiaTri(a.congThuc2());
        }

        scanner.close();
    }
}
