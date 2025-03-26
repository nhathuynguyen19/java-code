import java.text.DecimalFormat;

public class temp {
    public static void main(String[] args) {
        double tienno = 50000000;  // Số tiền nợ ban đầu
        double laiSuat = 4.166666667;     // Lãi suất hàng tháng (0.7% = 0.007)
        double tienTra = 900000;     // Số tiền trả hàng tháng

        double tienLai = 0;
        DecimalFormat df = new DecimalFormat("#,###.00"); // Định dạng số

        // Vòng lặp cho đến khi số nợ bằng 0 hoặc âm
        while (tienno > 0) {
            double tempLai = tienno * laiSuat;      // Tính lãi cho tháng này
            double tongTienTra = tienTra + tempLai; // Tổng tiền cần trả

            tienLai += tempLai;                     // Cộng lãi vào tổng lãi
            tienno -= tongTienTra;                   // Cập nhật số nợ

            System.out.println("Số nợ còn lại: " + df.format(tienno));
            System.out.println("Tổng lãi đã trả: " + df.format(tienLai));
            System.out.println("----------");
            System.out.println("test");
        }

        // Nếu số nợ âm, in ra thông báo
        if (tienno < 0) {
            System.out.println("Số nợ đã trả xong, còn thừa: " + df.format(Math.abs(tienno)));
        }
    }
}
