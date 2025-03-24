import java.util.Scanner;
public class ArrayRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = -9999;
        int min = 9999;
        System.out.println("Enter the no.of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Enter value for "+ i + "th index:");
            int num = sc.nextInt();
            arr[i] = num;
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Span of array is "+ (max - min));
        System.out.println("Enter the number you are trying to find:");
        int find = sc.nextInt();
        int flag = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == find){
                System.out.println("we found "+find+" in "+ i + "th index.");
                flag++;
            }
        }
        if(flag == 0){
            System.out.println("We could not find the number.");
        }
    }
}
