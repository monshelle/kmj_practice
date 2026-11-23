import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("-");
        String a = strArr[0];
        String b = strArr[1];
        String c = strArr[2];
        System.out.println(a+"-"+c+"-"+b);
    }
}