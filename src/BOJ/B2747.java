package BOJ;

import java.util.Scanner;

public class B2747{
    public B2747(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] iArr = new int[n+1];

        iArr[0] = 0;
        iArr[1] = 1;

        for (int i = 2; i < n+1; i++) {
            iArr[i] = iArr[i-2]+iArr[i-1];
        }

        System.out.println(iArr[n]);
        
    }
}