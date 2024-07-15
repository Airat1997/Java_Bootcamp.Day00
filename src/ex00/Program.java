public class Program {

    public static void main(String[] args) {
        int number = 479598;
        int result = 0;
        for (int j = 1; j < 7; j++) {
            result += number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
}