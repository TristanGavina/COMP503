public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        
        System.out.print("10! is equal to: ");
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
            System.out.print(i);
            if (i < 10) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
        }
        
        System.out.println(factorial);
    }
}
