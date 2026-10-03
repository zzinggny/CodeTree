import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int max = 0;
        for(int s = 0; s<=1001; s++){
            boolean before = false;
            int count = 0;
            for(int i = 0; i<n; i++){
                if( h[i] > s ) {
                    if(before == true){
                        continue;
                    }else{
                        count ++;
                        before = true;
                    }
                }else{
                    before = false;
                }
            }
            max = Math.max(count, max);
        }

        System.out.print(max);
    }
}