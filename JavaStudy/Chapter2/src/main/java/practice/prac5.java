import java.util.Scanner;
public class prac5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("정수 3개 입력");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b) {
                    System.out.println("삼각형이 된다.");
                }
            }
        }
    }
}
