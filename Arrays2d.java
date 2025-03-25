import java.util.Scanner;
public class Arrays2d {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no.of rows for the 2-d array:");
            int nrow = sc.nextInt();
            System.out.println("Enter the no.of columns for the 2-d array:");
            int ncol = sc.nextInt();
            int[][] arr = new int[nrow][ncol];
            for(int i = 0; i<nrow; i++){
                for(int j = 0; j<ncol; j++){
                    System.out.println("enter value for "+ j+"th column in "+i+"th row");
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<nrow; i++){
                for(int j=0; j<ncol; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }