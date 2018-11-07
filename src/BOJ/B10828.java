package BOJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class B10828 {
    public B10828(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<Integer> arr = new LinkedList<>();

        for (int i = 0; i <n ; i++) {
            String input = sc.nextLine();
            if(checkString(input,"push")){
                arr.addLast(Integer.parseInt(input.substring(5,input.length())));
            }else if(checkString(input,"pop")){
                if(arr.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(arr.removeLast());
                }
            }else if(checkString(input,"size")){
                System.out.println(arr.size());
            }else if(checkString(input,"empty")){
                if(arr.isEmpty()){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            }else if(checkString(input,"top")){
                if(arr.isEmpty()){
                    System.out.println("-1");
                }else {
                    System.out.println(arr.getLast());
                }
            }
        }

        sc.close();

    }

    private boolean checkString(String s, String c){
        return s.contains(c)? true:false;
    }

}
