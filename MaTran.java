import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaTran {
    public static void xuatMaTran(List<List<Long>> MaTran) {
        for(List<Long> inner : MaTran) {
            for (long x : inner) {
                System.out.print(String.format("%d ", x));
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao
        long N, K;
        List<List<Long>> fourInt = new ArrayList<>();
        long A, B;

        // set gia tri
        N = scanner.nextLong();
        K = scanner.nextLong();

        for (int i = 0; i < K; i++) {
            List<Long> innerList = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L));
            for (long x : innerList) {
                x = scanner.nextLong();
                innerList.add(x);
            }
            fourInt.add(innerList);
        }

        A = scanner.nextLong();
        B = scanner.nextLong();

        // test
        xuatMaTran(fourInt);

        scanner.close();
    }
}
