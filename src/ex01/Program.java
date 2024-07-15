import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if(number == 0 || number < 0){
            System.err.print("Illegal Argument");
            System.exit(-1);
        }
        int count = 1;
        boolean isPrime = true;
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            count++;
        }
        if (isPrime) {
            System.out.print("true " + count);
        } else {
            System.out.print("false " + count);
        }
    }
}