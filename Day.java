import java.util.Scanner;
public class Day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which day number is it today?");
        int d = sc.nextInt();
        switch(d){
            case 1:
            System.out.println("Today is gloomy monday.");
            break;
            case 2:
            System.out.println("Today is Tuesday.");
            break;
            case 3:
            System.out.println("Today is wednesday.");
            break;
            case 4:
            System.out.println("Today is thursday.");
            break;
            case 5:
            System.out.println("Yay! today is friday.");
            break;
            case 6:
            System.out.println("today is saturday.");
            break;
            case 7:
            System.out.println("Today is sunday.");
            break;
        }
        sc.close();
    }
}