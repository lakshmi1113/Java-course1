import java.util.Scanner;
public class RotatingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        String n1 = Integer.toString(n);
        System.out.println("Enter the rotating number:");
        int rn = sc.nextInt();
        int count = 0;
        int l = n1.length();
        for(int i=0; i<rn; i++){
            n1 = n1.charAt(l-1)+ n1;
        }
        l = n1.length();
        System.out.println("new number is" + n1.substring(0,l-rn));
    }
}
