import java.sql.SQLOutput;
import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.println(time + "은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
        scanner.close();
    }
}
