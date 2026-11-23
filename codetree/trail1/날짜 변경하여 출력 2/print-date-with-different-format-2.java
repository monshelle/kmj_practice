import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("-");
        String mm = strArr[0];
        String dd = strArr[1];
        String yyyy = strArr[2];
        System.out.println(yyyy+"."+mm+"."+dd);
    }
}