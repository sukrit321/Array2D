import java.util.Scanner;

public class NumTable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] num = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                num[i][j] = sc.nextInt();
            }
        }
        int oder = sc.nextInt();
        for(int i = 0; i < oder; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r <= 0 || r > row || c <= 0 || c > col){
                System.out.print("-");
            }
            else {
                System.out.print(num[r - 1][c - 1]);
            }
        }
    }
}