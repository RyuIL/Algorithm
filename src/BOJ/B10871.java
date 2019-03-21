package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
    public B10871() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            if(temp<g){
                System.out.print(temp+" ");
            }
        }
    }
}