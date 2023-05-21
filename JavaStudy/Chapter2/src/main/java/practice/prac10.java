import java.util.Scanner;
public class prac10 {
    public static double calcDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 원의 중심과 반지름 입력 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int radius1 = scanner.nextInt();
        System.out.print("두 번째 원의 중심과 반지름 입력 >> ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int radius2 = scanner.nextInt();

        double distance = calcDistance(x1, y1, x2, y2);
        if (distance < radius1 + radius2) {
            System.out.println("두 원은 서로 겹친다.");
        } else if (distance == radius1 + radius2) {
            System.out.println("두 원은 붙어 있다.");
        } else {
            System.out.println("두 원은 떨어져 있다.");
        }
    }
}
