package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {
    public B2579() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr, ans;
        arr = new int[n];
        ans = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(n==1){
            System.out.println(arr[0]);
            return;
        }else if(n==2){
            System.out.println(arr[0]+arr[1]);
            return;
        }
        ans[0] = arr[0];
        ans[1] = arr[0]+arr[1];
        ans[2] = arr[0]+arr[2];

        for (int i = 3; i <n ; i++) {
            int temp = arr[i-1]+ans[i-3]+arr[i];
            int temp2 = ans[i-2]+arr[i];
            ans[i] = (temp>temp2) ? temp :temp2;
        }

        System.out.println(ans[n-1]);

        br.close();
    }
}
