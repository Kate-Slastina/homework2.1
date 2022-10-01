import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 11;
        int j = 2;
        int i = 1;
        int k = 0;
        while (i<n){
            if (i%2==0){
                b=b-10*j;
                ++k;
            }else {
                b=b*3;
            }
            if ((k%7==0) && (k!=0)){
                ++j;
            }
            ++i;
        }System.out.println(b + " кроликов и " + j + " волка в "+ n  + " 52месяце" );
    }
}
