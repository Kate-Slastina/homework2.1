import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        var i = n%10;
        switch (i){

            case 1:
                System.out.println(n + " TORT");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(n + " TORTA");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(n + " TORTOV");
                break;
        }
    }
}