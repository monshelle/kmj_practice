import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("\\.");
        String y = strArr[0];
        String m = strArr[1];
        String d = strArr[2];
        System.out.println(m+"-"+d+"-"+y);
    }
}