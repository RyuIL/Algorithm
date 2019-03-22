package BOJ;

import java.util.Scanner;

//피보나치의수3 (피사노 주기)

public class B2749{
    public B2749(){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int p = 1500000; // 피보나치 수열을 10^6로 나누었을 때 주기
        long[] lArr = new long[p];

        lArr[0] = 0;
        lArr[1] = 1;

        for (int i = 2; i < p; i++) {
            if(i>p){
                break;
            }

            lArr[i] = lArr[i-2] + lArr[i-1];
            lArr[i] %= 1000000;
        }

        if(n>=p){
            n%=p;
        }

        System.out.println(lArr[(int)n]);
    }
}