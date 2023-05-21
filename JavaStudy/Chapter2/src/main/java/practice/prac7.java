import java.util.Scanner;
public class prac7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점 (x, y)의 좌표를 입력하시오 >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= 100 && a <= 200) {
            if (b >= 100 && b <= 200) {
                System.out.println("(" + a + ", " + b + ")는 사각형 안에 있습니다.");
            }
        }
    }
}
