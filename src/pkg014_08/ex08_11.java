package pkg014_08;
public class ex08_11 {
    public static void main(String[] args) {
        int[] x = new int[4]; // Increase the size of the array to 5
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 2;
        }
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 2;
            System.out.println("x["+i+"]  = "+x[i]);
        }
    }
}
