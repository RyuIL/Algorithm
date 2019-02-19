package BOJ;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B2920 {
    public B2920(){
        StringTokenizer st;
        Scanner sc = new Scanner(System.in);

        st = new StringTokenizer(sc.nextLine());

        int[] intArr = new int[8];

        for (int i = 0; i < 8 ; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isAscen = true;
        boolean isDecen = true;

        for (int i = 1; i < 8 ; i++) {
            int test = intArr[i - 1] - intArr[i];
            if(test == -1 && isAscen){
                isDecen = false;
            }else if(test == 1 && isDecen){
                isAscen = false;
            }else {
                System.out.println("mixed");
                isAscen = false;
                isDecen = false;
                break;
            }
        }

        if(isAscen) System.out.println("ascending");
        if(isDecen) System.out.println("descending");
    }
}
