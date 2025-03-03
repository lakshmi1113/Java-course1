import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int num;
        char choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number:");
            num = sc.nextInt();
            if(num> max){
                max = num;
            }
            if(num< min){
                min = num;
            }
            System.out.println("Do you want to continue? y/n:");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');
        System.out.println("Largest number is "+max);
        System.out.println("Smallest number is "+min);

        }
        

    }

