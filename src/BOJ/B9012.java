package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class B9012 {
    public B9012(){
        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt(); sc.nextLine();

        for (int i = 0; i <n ; i++) {
            String in = sc.nextLine();
            char[] cArr = in.toCharArray();
            boolean check = true;
            for (int j = 0; j < cArr.length; j++) {
                if(cArr[j]=='('){
                    st.push("(");
                }else if(cArr[j]==')'){
                    if(st.isEmpty()){
                        System.out.println("NO");
                        check=false;
                        break;
                    }
                    st.pop();
                }
            }

            if(st.isEmpty()&&check){
                System.out.println("YES");
                st.removeAllElements();
            }else if(check) {
                System.out.println("NO");
                st.removeAllElements();
            }
        }
    }
}
