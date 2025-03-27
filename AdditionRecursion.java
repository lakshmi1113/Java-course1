import java.util.Scanner;
public class AdditionRecursion {
    public static int add(int a){
        if(a>=0){
            return a+add(a-1);
        }
        if(a<0){
            return a ;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(add(num));
    }
}

