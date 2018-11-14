package BOJ;

import java.io.*;

public class B1003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] fArr;

    public B1003() throws IOException {
        fArr = new int[41][2];
        fArr[0][0] = 1;
        fArr[1][1] = 1;

        for (int i = 2; i <41 ; i++) {
            for (int j = 0; j < 2 ; j++) {
                fArr[i][j] = fArr[i-1][j]+fArr[i-2][j];
            }
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            int m = Integer.parseInt(br.readLine());
            bw.write(fArr[m][0]+" "+fArr[m][1]+"\n");
            bw.flush();
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
