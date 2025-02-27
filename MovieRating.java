import java.util.Scanner;
public class MovieRating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie ratings:");
        float mr = sc.nextFloat();
        if(mr<=3.0){
            System.out.println("Not great");
        }
        if(mr<=5.0){
            System.out.println("Good");
        }
        if(mr<=7.0){
            System.out.println("Great");
        }
        if(mr<=9.0){
            System.out.println("Best");
        }
        else{
            System.out.println("Out of the world");
        }
        sc.close();
    }
}