package BOJ;

import java.util.Scanner;

public class B1978 {
    public B1978(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        boolean isPrime;
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            isPrime=true;
            for (int j = 2; j < arr[i]; j++) {
                if(arr[i]%j==0){
                    isPrime=false;
                    continue;
                }

            }
            if(isPrime&&arr[i]>1){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
