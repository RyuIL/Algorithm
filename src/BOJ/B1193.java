package BOJ;

import java.util.Scanner;

public class B1193 {
    public B1193(){
        Scanner sc = new Scanner(System.in);

        int scInputData = sc.nextInt();

        int temp = 1; //분자
        int temp2 = 1; //분모
        int stair = 1;
        int cnt = 1;
        int a=0;
        while (true){
            if(stair>=scInputData){
                break;
            }

            stair=fact(++cnt);
        }

        if(cnt%2!=0){
            temp=cnt;
        }else {
            temp2=cnt;
        }

        for (int i = 0; i < cnt-(stair-scInputData)-1; i++) {
            if(scInputData==1) break;

            if(cnt%2!=0){
                temp--;
                temp2++;
            }else {
                temp++;
                temp2--;
            }
        }

        System.out.println(temp+"/"+temp2);
    }

    static int fact(int n){
        if(n<=1) return n;
        else return fact(n-1)+n;
    }
}
