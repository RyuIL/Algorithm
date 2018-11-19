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
                int temp = Integer.parseInt(st.nextToken());
                if(j==0){
                    arr[i][j] = arr[i-1][j]+temp;
                }else if (j==i){
                    arr[i][j] = arr[i-1][j-1]+temp;
                }else {
                    arr[i][j] = (arr[i - 1][j - 1] + temp > arr[i - 1][j] + temp) ? arr[i - 1][j - 1] + temp : arr[i - 1][j] + temp;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n ; i++) {
            ans = (ans<arr[n-1][i] ? arr[n-1][i] : ans);
        }

        bw.write(ans+"\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
