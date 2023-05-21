import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원)>>");
        double won = scanner.nextInt();

        System.out.println(won + "원은 $" + won/1100 + "입니다.");
    }
}
