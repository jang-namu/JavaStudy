import java.util.Scanner;
public class prac9 {
    public static double calcDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력 >> ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double radius = scanner.nextDouble();

        System.out.print("점 입력 >> ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (calcDistance(x, y, a, b) <= radius) {
            System.out.println("점 (" + a + ", " + b + ")는 원 안에 있다.");
        }
    }
}
