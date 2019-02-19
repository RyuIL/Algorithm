package BOJ;

import java.util.Scanner;

public class B2577 {
    public B2577(){
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        for (int i = 0; i < 3 ; i++) {
            temp *= sc.nextInt();
        }

        String str = Integer.toString(temp);

        char[] cArr = str.toCharArray();

        int[] ansArr = new int[10];

        for (int i = 0; i <cArr.length ; i++) {
            ansArr[cArr[i]-'0']++;
        }

        for (int i = 0; i < ansArr.length ; i++) {
            System.out.println(ansArr[i]);
        }
    }
}
