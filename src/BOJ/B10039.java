package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10039{
    public B10039() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] iArr = new int[5];

        for (int i = 0; i < 5 ; i++) {
            iArr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;

        for (int i = 0; i < iArr.length ; i++) {
            if(iArr[i]<40){
                sum += 40;
            }else{
                sum += iArr[i];
            }

        }

        System.out.println(sum/5);

        br.close();
    }
}
