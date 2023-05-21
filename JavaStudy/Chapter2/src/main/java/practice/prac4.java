import java.util.Scanner;
public class prac4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력 >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && b >= c) {
            System.out.println("중간 값은 " + b);
        } else if (b >= a && a >= c) {
            System.out.println("중간 값은 " + a);
        } else {
            System.out.println("중간 값은 " + c);
        }
    }
}
