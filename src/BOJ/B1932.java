package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class B1932 {
    public B1932() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        st = new StringTokenizer(br.readLine());

        arr[0][0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i+1 ; j++) {
                if(n==j) break;

                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] sumArr = new int[n][n];
        sumArr[0][0] = arr[0][0];
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j < i+1; j++) {
                if(j==n) break;
                if(j==0){
                    sumArr[i][j] = sumArr[i-1][j]+arr[i][j];
                }else if (j==i){
                    sumArr[i][j] = sumArr[i-1][j-1]+arr[i][j];
                }else {
                    sumArr[i][j] = (sumArr[i - 1][j - 1] + arr[i][j] > sumArr[i - 1][j] + arr[i][j]) ? sumArr[i - 1][j - 1] + arr[i][j] : sumArr[i - 1][j] + arr[i][j];
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n ; i++) {
            ans = (ans<sumArr[n-1][i] ? sumArr[n-1][i] : ans);
        }

        System.out.println(ans);


        br.close();
        bw.close();
    }
}
