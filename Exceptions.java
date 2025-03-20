import java.util.Scanner;
public class Exceptions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter 2 numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int z = a/b;
            System.out.println(a+"/"+ b + "=" + z);
        }
        catch(ArithmeticException ex){
            System.out.println("---- catch block ----");
            System.out.println(ex.toString());
        }
        finally{
            System.out.println("--- finally ---");
            System.out.println("This code has been written by Lakshmi.");
            sc.close();
        }
        System.out.println("-----END-----");
    }
}