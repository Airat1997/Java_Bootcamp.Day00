import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int currentNumber = 0, remainderDivision = 0, sum = 0, lengthNumber = 0, countNumbers = 1, count = 1, countPrimaryNumbers = 0;
        while (currentNumber != 42) {
            currentNumber = console.nextInt();
            remainderDivision = currentNumber;
            lengthNumber = currentNumber;
            while (lengthNumber != 0) {
                lengthNumber /= 10;
                countNumbers++;
            }
            for (int j = 1; j < countNumbers; j++) {
                sum += remainderDivision % 10;
                remainderDivision = remainderDivision / 10;
            }
            boolean isPrime = true;
            for (int i = 2; i * i < sum; i++) {
                if (sum % i == 0) {
                    isPrime = false;
                    break;
                }
                count++;
            }
            remainderDivision = 0;
            countNumbers = 1;
            sum = 0;
            if (isPrime) {
                countPrimaryNumbers++;
            }

        }
        System.out.println("Count of coffee-request " + countPrimaryNumbers);
    }
}