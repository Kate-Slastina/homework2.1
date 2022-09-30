import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 1;
        int j = 0;
        int k = 0;
        var i = 0;
            while ( i < a){
                k = b + j;
                j = b;
                b = k;
                ++i;
        }System.out.println(b);
    }
}