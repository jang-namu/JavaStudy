// 한 라인 주석 command + '/'으로 한 줄 주석
/* 여러 줄 주석*/
public class Hello {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
