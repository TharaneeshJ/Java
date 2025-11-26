public class practice {
    public static void main(String[] args) {
        int number = 12346;
        int reverse = 0;
        int num = number;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println(reverse);
    }
}
