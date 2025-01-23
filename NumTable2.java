import java.util.Scanner;

public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] num = new int[row][col];
        boolean spa = true;
        int number = Integer.MIN_VALUE;
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
                if(!spa){
                    System.out.println();
                    number = Integer.MIN_VALUE;
                    spa = true;
                }
            }
            else {
                spa = false;
                if(num[r - 1][c - 1] == number){
                    System.out.print("*");
                }
                else {
                    System.out.print(num[r - 1][c - 1]);
                    number = num[r - 1][c - 1];
                }
            }
        }
    }
}