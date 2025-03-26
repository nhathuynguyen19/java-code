import java.util.Scanner;

class Diem
{
    // toa do x, y
    private int x, y;

    // nhap
    public void nhap(Scanner scanner)
    {
        this.x = scanner.nextInt();
        this.y = scanner.nextInt();
    }

    // tinh khoang cach 2 diem
    public void khoangCach2Diem(Diem b)
    {
        double khoang_cach = Math.sqrt(Math.pow(b.x - x, 2) + Math.pow(b.y - y, 2));
        System.out.println(String.format("%.9f", khoang_cach));
    }

    // xuat
    public void xuat()
    {
        System.out.println(String.format("x: %d, y: %d", this.x, this.y));
    }
}

public class KhoangCachEuclid
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Diem a = new Diem();
        Diem b = new Diem();

        a.nhap(scanner);
        b.nhap(scanner);

        a.khoangCach2Diem(b);

        scanner.close();
    }
}