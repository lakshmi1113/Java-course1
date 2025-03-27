import java.util.Scanner;
import java.util.*;
public class RemovePrime{
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
     public static void solution(ArrayList<Integer> a){
            for(int i = a.size()-1; i >= 0; i--){
                if(isPrime(a.get(i)) == true){
                    a.remove(i);
                }
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arraylist:");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        for(int i = 0; i<n; i++){
            System.out.println("Enter the array elements:");
            arr.add(sc.nextInt());
        }
        solution(arr);
        System.out.println(arr);
    }
    }