import java.util.Scanner;

public class Main {
    public static int sum(int N){
        if(N== 1){
            return 1;
        }
        return sum(N-1)+N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}