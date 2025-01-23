import java.util.Scanner;

public class NumTable3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] num = new int[row][col];
        boolean spa = true;
        int number = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int lon = 0;
        int eql_lon = 1;
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
                    // System.out.print(lon);
                    if(lon == max){
                        eql_lon++;
                    }
                    number = Integer.MIN_VALUE;
                    spa = true;
                    lon = 0;
                }
            }
            else {
                spa = false;
                if(num[r - 1][c - 1] == number){
                    lon++;
                    // System.out.print(lon);
                    
                }
                else {
                    // System.out.print(num[r - 1][c - 1]);
                    number = num[r - 1][c - 1];
                    lon++;
                    // System.out.print(lon);
                }
            }
            if(lon > max){
                max = lon;
                if(i == oder - 1){
                    eql_lon = 1;    
                }
                else {
                    eql_lon = 0;
                }
            }
        }
        System.out.println(max);
        System.out.println(eql_lon);
    }
}
