package BOJ;

import java.util.Scanner;

public class B1065 {
    public B1065() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cArr = new int[3];
        int cnt = 0;

        if (0< n && n< 100) {
            System.out.println(n);
        } else if (n == 1000) {
            System.out.println(144);
        } else {
            for (int i = 100; i <= n; i++) {
                for (int j = 0; j < 3; j++) {
                    cArr[j] = Integer.toString(i).charAt(j) - '0';
                }

                if (cArr[0] - cArr[1] == cArr[1] - cArr[2]) {
                    cnt++;
                }
            }
            System.out.println(cnt+99);
        }

        sc.close();
    }


}

