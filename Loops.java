import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        for(int i = 10; i>0; --i){
            System.out.println(i);
        }
        int a = 1;
        while(a<=10){
            System.out.println(a);
            a++;
        }
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; ++i){
            sum += i;
        }
        System.out.println("The sum is " + sum);
        // sc.close();
    }    
}
