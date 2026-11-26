import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        System.out.println(square);
        if(n<5){
            System.out.println("tiny");
        }
    }
}