package BOJ;

import java.util.Scanner;

public class B2231 {
    public B2231(){
        Scanner scData = new Scanner(System.in);

        int a = scData.nextInt();
        int temp = 0;

        for(int i=13; i<a; i++){
            temp = i;
            if(i>10){
                String bun = Integer.toString(i);
                for(int j=0; j<bun.length(); j++){

                    temp+=bun.charAt(j)-'0';
                }
            }

            if (temp == a){
                System.out.println(i);
                break;
            }
            temp=0;
        }
        if(temp==0) System.out.println("0");
    }
}
