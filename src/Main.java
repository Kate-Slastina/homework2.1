import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 10;
        int k = 0;
        int t =0;
        int l =n;
        while (l>0){
            ++t;
            l = l/10;
        }
        for (int i = 0;i < t;++i){
            k = n%10;
            if (b > k){
                b = k;
            }
            n = n/10;
        } System.out.println(b);
    }
}
