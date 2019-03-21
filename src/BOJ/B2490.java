package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2490 {
    public B2490() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            cnt = 0;
            for (int j = 0; j < 4; j++) {
                if(st.nextToken().equals("0")){
                    cnt++;
                }
            }
            if(cnt==0){
                System.out.println("E");
            }else if(cnt==1){
                System.out.println("A");
            }else if(cnt==2){
                System.out.println("B");
            }else if(cnt==3){
                System.out.println("C");
            }else if(cnt==4){
                System.out.println("D");
            }
        }
    }
}