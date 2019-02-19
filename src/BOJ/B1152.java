package BOJ;

import java.util.Scanner;

public class B1152 {
    public B1152(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        sc.close();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }

    }
}
