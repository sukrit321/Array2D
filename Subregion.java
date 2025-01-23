import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = 0;
            }
        }
        if(p <= 0 || p > row || q <= 0 || q >col){
            System.out.println("invalid input");
        }
        else if (p + h - 1 > row || q + w - 1 > col){
            System.out.println("invalid input");
        }
        else {
            for(int i = p - 1; i < p + h - 1; i++){
                for(int j = q - 1; j < q + w - 1; j++){
                    arr[i][j] = 1;
                }
            }
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
