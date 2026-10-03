import java.util.Scanner;
public class Main {
    public static void numPrint(int n){
        if(n == 0){
            return;
        }
        numPrint(n-1);
        System.out.print(n+" ");
    }
    public static void numPrintReverse(int n){
        if(n == 0){
            return;
        }
        
        System.out.print(n+" ");
        numPrintReverse(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numPrint(n);
        System.out.println();
        numPrintReverse(n);
    }
}