import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름 도시 나이 체중 독신여부를 빈칸으로 분리하여 입력해주세요.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름은 " + name);

        String city = scanner.next();
        System.out.println("거주지는 " + city);

        byte age = scanner.nextByte();
        System.out.println("나이는 " + age);

        byte weight = scanner.nextByte();
        System.out.println("체중은 " + weight);

        boolean inSingle = scanner.nextBoolean();
        System.out.println("독신여부는 " + inSingle);
        scanner.close();
    }
}
