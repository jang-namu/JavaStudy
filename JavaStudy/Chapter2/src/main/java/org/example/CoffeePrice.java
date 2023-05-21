import java.util.Scanner;
public class CoffeePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("무슨 커피 드릴까요?");
        String order = scanner.next();
        int price = 0;
        switch (order) {
            case "아메리카노":
                price = 2500;
                break;
            case "라떼":
                price = 3500;
                break;
            case "디카페인":
                price = 2500;
                break;
            default:
                System.out.println("메뉴에 없습니다!");
        }

        if (price != 0) {
            System.out.println(order + "는 " + price +"원 입니다.");
        }
        scanner.close();
    }
}
