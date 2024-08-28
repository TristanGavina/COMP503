public class Fibonacci {
    public static void main(String[] args) {
        int F0 = 0, F1 = 1;

        System.out.println(F0);
        System.out.println(F1);

        for (int i = 2; i < 10; i++) {
            int F = F0 + F1;
            System.out.println(F);
            F0 = F1;
            F1 = F;
        }
    }
}
