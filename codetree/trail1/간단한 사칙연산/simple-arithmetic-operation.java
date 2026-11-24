import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int div = a/b;
        int rem = a%b;
        System.out.println(add + "\n" + sub + "\n" + div + "\n" + rem);
    }
}