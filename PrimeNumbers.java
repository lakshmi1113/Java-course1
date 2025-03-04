import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int lr = sc.nextInt();
        System.out.println("Enter the higher range:");
        int hr = sc.nextInt();
        for(int n=lr; n<=hr; n++){
            int count = 0;
            for(int div=2;div*div<=n; div++){
                if(n%div ==0){
                    count++;
                    break;
            }
        }
        if(count==0){
            System.out.println(n);
        }
    }
    sc.close();
}
}