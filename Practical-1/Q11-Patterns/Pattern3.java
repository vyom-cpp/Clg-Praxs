// 1234
// 567
// 89
// 0

public class Pattern3 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
                if (k == 10) {
                    k = 0;
                }
            }
            System.out.println();
        }
    }
}