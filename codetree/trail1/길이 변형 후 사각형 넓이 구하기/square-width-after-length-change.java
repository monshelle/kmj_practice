import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //가로
        int b = sc.nextInt(); //세로
        a = a+8;
        b = b*3;
        System.out.println(a+"\n"+b+"\n"+a*b);
    }
}