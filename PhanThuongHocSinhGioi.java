import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MonHang {
    private int khoi_luong;
    private int gia_tri;

    // getter khoi luong
    public int get_khoi_luong() {
        return khoi_luong;
    }

    // getter gia tri
    public int get_gia_tri() {
        return gia_tri;
    }

    // nhap
    public void nhap(Scanner scanner) {
        khoi_luong = scanner.nextInt();
        gia_tri = scanner.nextInt();
    }

    // sap xep mon hang co gia tri tu cao den thap
    public void sapXep(MonHang[] danhSachMonHang) {
        Arrays.sort(danhSachMonHang, (a, b) -> Integer.compare(b.gia_tri, a.gia_tri));
    }

    // xuat
    public void xuat() {
        System.out.println(String.format("%d %d", khoi_luong, gia_tri));
    }
}

class Tui {
    private int tai_trong;

    // getter tai trong
    public int get_tai_trong() {
        return tai_trong;
    }

    // nhap
    public void nhap(Scanner scanner) {
        tai_trong = scanner.nextInt();
    }

    // sap xep tui theo tai trong tu thap den cao
    public void sapXep(List<Tui> danhSachTui) {
        Collections.sort(danhSachTui, new Comparator<Tui>() {
            @Override
            public int compare(Tui a, Tui b) {
                return Integer.compare(b.tai_trong, a.tai_trong);
            }
        });
    }

    // xoa tui
    public void deleteTui(List<Tui> danhSachTui, int j) {
        danhSachTui.remove(j);
    }

    // xuat
    public void xuat() {
        System.out.println(String.format("%d", tai_trong));
    }
}

public class PhanThuongHocSinhGioi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        int n, k;

        n = scanner.nextInt();
        k = scanner.nextInt();

        MonHang[] danhSachMonHang = new MonHang[n];
        List<Tui> danhSacTui = new ArrayList<>();

        // nhap mon hang
        for (int i = 0; i < n; i++) {
            danhSachMonHang[i] = new MonHang();
            danhSachMonHang[i].nhap(scanner);
        }

        // nhap tui
        for (int i = 0; i < k; i++) {
            Tui tui = new Tui();
            tui.nhap(scanner);
            danhSacTui.add(tui);
        }

        // sap xep mon hang theo gia tu cao den thap
        danhSachMonHang[0].sapXep(danhSachMonHang);

        // sap xep tui theo tai trong tu thap den cao
        Tui t = new Tui();
        t.sapXep(danhSacTui);

        // cho banh vao tui
        int sum = 0;
        for (int i = 0; i < danhSachMonHang.length; ++i) {
            for (int j = 0; j < k; j++) {
                if (danhSachMonHang[i].get_khoi_luong() <= danhSacTui.get(j).get_tai_trong()) {
                    sum += danhSachMonHang[i].get_gia_tri();
                    t.deleteTui(danhSacTui, j);
                    k--;
                    break;
                }
            }
        }

        // test
        // for (MonHang x : danhSachMonHang) {
        //     x.xuat();
        // }
        // for (Tui x : danhSacTui) {
        //     x.xuat();
        // }

        
        // xuat
        System.out.println(sum);

        //
        scanner.close();
    }
}
