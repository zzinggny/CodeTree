import java.util.Scanner;
public class Main {
    public static int calc(int n){
        if(n<10)    return n*n;

        return calc(n/10)+(n%10)*(n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(calc(n));
    }
}