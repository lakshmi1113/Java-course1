import java.util.Scanner;

class ArrayCreation {
    void printArray(int[][] a, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a [i][j] + " ");
            }
            System.out.println();
        }
    }

    void createArray(int[][] a, int r, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the value for " + j + "th column in " + i + "th row:");
                a[i][j] = sc.nextInt();
            }
        }

    }
}

public class ProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for a1:");
        int r1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the number of colums for a1:");
        int c1 = sc.nextInt();
        
        System.out.println("Enter the number of rows for a2:");
        int r2 = sc.nextInt();
        
        System.out.println("Enter the number of columns for a2:");
        int c2 = sc.nextInt();
        
        ArrayCreation ac = new ArrayCreation();
        int[][] a1 = new int[r1][c1];
        int[][] a2 = new int [r2][c2];
        ac.createArray(a1, r1, c1);
        System.out.println("array a1-");
        ac.printArray(a1, r1, c1);
        ac.createArray(a2, r2, c2);
        System.out.println("array a2-");
        ac.printArray(a2, r2, c2);

    
        int row = r1;
        int col = c1;
        int[][] arrprd = new int[r1][c1];
        if( r1==r2 && c1 == c2){
            for(int i = 0; i<row; i++){
                for(int j=0; j<col; j++){
                    arrprd[i][j] = ((a1[i][j])*(a2[i][j]));
                }
            }        
        }
        else{
            System.out.println("The two arrays' elements(indices) do not coincide, so product array cannot be obtained");
        }
        System.out.println("The product array is-");
        ac.printArray(arrprd, r1, c1);
}
}