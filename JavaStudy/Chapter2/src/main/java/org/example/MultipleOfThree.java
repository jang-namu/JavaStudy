import java.util.Scanner;
public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("3의 배수");
        } else {
            System.out.println("3의 배수가 아님");
        }
        scanner.close();
    }
}
