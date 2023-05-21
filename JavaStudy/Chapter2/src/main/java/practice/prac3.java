import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오 >> ");
        int price = scanner.nextInt();
        System.out.println("오만원권 " + price/50000);
        price %= 50000;
        System.out.println("만원권 " + price/10000);
        price %= 10000;
        System.out.println("천원권 " + price/1000);
        price %= 1000;
        System.out.println("백원 " + price/100);
        price %= 100;
        System.out.println("오십원 " + price/50);
        price %= 50;
        System.out.println("십원 " + price/10);
        price %= 10;
        System.out.println("일원 " + price);
    }
}
