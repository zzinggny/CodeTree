import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        
        int count = 0;
        for(int i=x; i<=y; i++){
            StringBuilder sb = new StringBuilder();
            int tmp = i;
            while(tmp>0){
                sb.append(tmp%10);
                tmp/=10;
            }
            int isPalindrom = Integer.parseInt(sb.toString());
            if(isPalindrom==i){
                count++;
            }
        }
        System.out.print(count);
    }
}