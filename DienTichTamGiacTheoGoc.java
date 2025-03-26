import java.util.Scanner;

class TamGiac
{
    private double a, b, alpha;
    public static final double PI = 3.14159;

    public void nhap(Scanner scanner)
    {
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        alpha = scanner.nextDouble();
    }

    public double dienTich()
    {
        double alphaRadiant = (alpha * PI) / 180;
        return 0.5 * a * b * Math.sin(alphaRadiant);
    }

    public void inDienTichVoiDinhDang()
    {
        System.out.println(String.format("%.2f", dienTich()));
    }
}

public class DienTichTamGiacTheoGoc {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        TamGiac a = new TamGiac();
        a.nhap(scanner);
        a.inDienTichVoiDinhDang();
        scanner.close();
    }
}
