import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words);

        char[] ts = t.toCharArray();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for(int j=0; j<ts.length; j++){
                if(ts[j]!=words[i].toCharArray()[j]){
                    flag = false; 
                    break;
                }
            }
            if(flag && ++cnt==k){
                System.out.println(words[i]);
            }
        }
        
    }
}