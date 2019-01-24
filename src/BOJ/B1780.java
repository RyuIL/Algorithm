package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1780 {

    private static int[][] arr;
    private static int[] count;
    public B1780() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[n][n];
        count = new int[3];


        for (int i = 0; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <n ; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        sol(n,0,0);

        System.out.println(count[0]);
        System.out.println(count[1]);
        System.out.println(count[2]);


        br.close();
    }


    public static void sol(int n, int row, int col) {
        if(check(n, row, col)){
            count[arr[row][col]+1]++;
        }else {
            int d = n/3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3 ; j++) {
                    sol(d, row+d*i, col+d*j);
                }
            }
        }
    }

    public static boolean check(int n, int row, int col){
        int f = arr[row][col];
        for (int i = row; i < row+n; i++) {
            for (int j = col; j < col+n; j++) {
                if(f!=arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
