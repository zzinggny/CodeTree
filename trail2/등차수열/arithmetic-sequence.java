import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        for (int k = 1; k < 100; k++) {
            int count = 0;
            for (int j = 0; j < n-1; j++) {
                for (int i = j+1; i < n; i++) {
                    if( arr[j] - k == k-arr[i] || k - arr[j] == arr[i] -k  ){
                        count ++;
                    }
                }
            }
            max = Math.max(max, count);
        }

        System.out.print(max);
    }
}