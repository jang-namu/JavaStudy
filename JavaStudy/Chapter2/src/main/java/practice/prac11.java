import java.util.Scanner;
public class prac11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int season = scanner.nextInt();

        if (season > 12 || season < 1) {
            ;
        } else {
            if (season <= 2) {
                System.out.println("겨울");
            } else if (season <= 5) {
                System.out.println("봄");
            } else if (season <= 8) {
                System.out.println("여름");
            } else if (season <= 11) {
                System.out.println("가을");
            } else {
                System.out.println("겨울");
            }
        }

        switch (season) {
            case 1:
            case 2:
            case 12:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
        }
    }
}
