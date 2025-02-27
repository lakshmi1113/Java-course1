import java.util.Scanner;
public class Cloth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the weather like?-\n 1.sunny \n 2.rainy");
        int w = sc.nextInt();
        System.out.println("What is the temperature like?-\n 1.hot \n 2.cold");
        int t = sc.nextInt();
        if (w==1){
            if(t==1){
                System.out.println("It's pretty hot outside, wear breathable light half-sleeved clothes.");
            }
            else{
                System.out.println("It's pleasant weather, wear anything!");
            }
        }
        else{
            if (t==1){
                System.out.println("It's very humid outside, wear light clothes but carry an umbrella.");
            }
            else{
                System.out.println("Stay indoors, the weather to burry yourself in blankets. If you do go out opt for woolen clothes or cardigans, carry an umbrella.");
            }
        }
        sc.close();
    }
}