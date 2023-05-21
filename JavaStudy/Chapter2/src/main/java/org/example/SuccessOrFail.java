import java.util.Scanner;
public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        if (score >= 80) {
            System.out.println("합격 축하합니다.");
        }
        scanner.close();
    }
}
