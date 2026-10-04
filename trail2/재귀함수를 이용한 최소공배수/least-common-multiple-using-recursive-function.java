import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){//최대공약수
        int gcd = 1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int calc(int[] arr, int n){
        if(n==0){
            return arr[0];
        }

        int before = calc(arr, n-1);

        return before * arr[n] / gcd(before,arr[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(calc(arr, n-1));
    }
}