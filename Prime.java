import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean flag = true;
        if(n<1){
            System.out.println("Negative numbers are neither prime nor composite");
        }
        if(n==1){
            System.out.println("1 is neither prime nor composite");
        }
        if(n==2){
            System.out.println("2 is a prime number");
        }
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(n>2){
        if(flag ){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+"is not a prime number");
        }
    }
    }
}
