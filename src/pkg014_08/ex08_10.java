package pkg014_08;

public class ex08_10 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;

        int x[] = {7, 9, -1, 4, 12, 9, 3, 2, -7, 2, 1, 9, -15, 24, 11, 13};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            if (x[i] % 2 == 0) {
                even++;  // Corrected variable name to 'even'
            } else {
                odd++;  // Corrected variable name to 'odd'
            }
        }
        System.out.println("Odd " + odd);
        System.out.println("Even " + even);
    }
}
