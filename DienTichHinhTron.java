import java.util.Scanner;

// main
public class DienTichHinhTron
{
	static class HinhTron {
		private double r;
		public static final double PI = 3.141592653;
	
		public double tinhDienTich() {
			return PI * (this.r * this.r);
		}
	
		public void nhapBanKinh() {
			Scanner scanner = new Scanner(System.in);
			this.r = scanner.nextDouble();
			scanner.close();
		}
	
		public void xuat(double number) {
			System.out.println(String.format("%.9f", number));
		}
	}

	public static void main(String args[]) {

		System.out.println("input: ");
		HinhTron hinhtron1 = new HinhTron();
		hinhtron1.nhapBanKinh();
		double dien_tich = hinhtron1.tinhDienTich();
		hinhtron1.xuat(dien_tich);
	}
}