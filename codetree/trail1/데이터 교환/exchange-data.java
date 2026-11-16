public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        
        temp = a;
        a = c; //a에는 c값을
        c = b; //c에는 b값을
        b = temp; //b에는 a값을

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}