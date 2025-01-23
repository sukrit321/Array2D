import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int out = 0;
        int good = 0;
        int goodcnt = 0;
        int noob = 0;
        int noobcnt = 0;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int win = 0;
        int loss = 0;
        boolean wi = false;
        boolean lo = false;
        int[][] map = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                map[i][j] = sc.nextInt();
            }
        }
        int g = 0; 
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
            for(int j = 0; j < row; j++){
                for(int k = 0; k < col; k++){
                    if(map[j][k] == 1){
                        wi = true;
                    }
                    if (map[j][k] == 2 && lo == false){
                        loss = i + 1;
                        lo = true;
                    }
                }
            }
            if(wi == false && g == 0){
                win = i + 1;
                g++;
            }
            else {
                wi = false;
            }
        }
        System.out.println(good);
        System.out.println(noob);
        System.out.println(goodcnt);
        System.out.println(noobcnt);
        System.out.println(out);
        if(g > 0){
            System.out.println("attacker " + win);
        }
        else if(lo == true){
            System.out.println("battleship " + loss);
        }
        else {
            System.out.println("battleship -1");
        }
    }
}
