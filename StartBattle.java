import java.util.Scanner;

public class StartBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int out = 0;
        int good = 0;
        int goodcnt = 0;
        int noob = 0;
        int noobcnt = 0;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] map = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                map[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if((r >= 1 && r <= row) && (c >= 1 && c <= col)){
                if(map[r - 1][c - 1] == 1){
                    map[r - 1][c - 1] = 2;
                    good++;
                }
                else if (map[r - 1][c - 1] == 0){
                    map[r - 1][c - 1] = -1;
                    noob++;
                }
                else if (map[r - 1][c - 1] == 2){
                    goodcnt++;
                }
                else if (map[r - 1][c - 1] == -1){
                    noobcnt++;
                }
            }
            else {
                out++;
            }
        }
        System.out.println(good);
        System.out.println(noob);
        System.out.println(goodcnt);
        System.out.println(noobcnt);
        System.out.println(out);
    }
}
