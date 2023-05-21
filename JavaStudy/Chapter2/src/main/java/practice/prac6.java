import java.util.Scanner;
public class prac6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오 >> ");

        int number = scanner.nextInt();
        if (number <= 12) {
            if (number == 3 || number == 6 || number == 9) {
                System.out.println("박수 짝");
            }
        } else {
            int two = number/10;
            int one = number%10;
            if (one == 3 || one == 6 || one == 9) {
                if (two == 3 || two == 6 || two == 9) {
                    System.out.println("박수 짝짝");
                } else {
                    System.out.println("박수 짝");
                }
            }
        }
    }
}
