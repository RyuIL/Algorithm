package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class B2293 {

    StringTokenizer st;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public B2293() throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        int[] Narr = new int[n];
        int [] Garr = new int[g+1];
        for (int i = 0; i < n ; i++) {
            Narr[i] = Integer.parseInt(br.readLine());
        }
        Garr[0] = 1;

        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < g+1 ; j++) {
                if(j - Narr[i] >= 0) Garr[j] += Garr[j - Narr[i]];
            }
        }
        bw.write(Garr[g]+"\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
