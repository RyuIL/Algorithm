package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8958 {
    public B8958() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }

        for (int i = 0; i < n ; i++) {
            int ans = 0;
            int score = 0;
            for (int j = 0; j <strArr[i].length() ; j++) {
                char t = strArr[i].charAt(j);
                if(t=='O') {
                    score+=1;
                    ans = score+ans;
                }
                else if (t=='X') {score=0;}
            }
            System.out.println(ans);
        }

        br.close();
    }
}
