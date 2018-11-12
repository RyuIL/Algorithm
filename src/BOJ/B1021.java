package BOJ;

import java.io.*;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1021 {
    static Deque<Integer> dq = new LinkedList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int lcnt = 0;
    static int rcnt = 0;

    public B1021() throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n+1 ; i++) {
            dq.addLast(i);
        }
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < m+1; i++) {
            int g = Integer.parseInt(st.nextToken());
            int index = 0;

            Iterator<Integer> it = dq.iterator();
            while (it.hasNext()){
                if(it.next()==g){
                    break;
                }
                index++;
            }
            while (true){
                if(g==dq.getFirst()){
                    dq.removeFirst();
                    break;
                }else if(index<=dq.size()/2){
                    left();
                }else {
                    right();
                }
            }
        }

        bw.write(lcnt+rcnt+"\n");
        bw.flush();
        br.close();
        bw.close();
    }

    private static void left(){
        dq.addLast(dq.removeFirst());
        lcnt++;
    }

    private static void right(){
        dq.addFirst(dq.removeLast());
        rcnt++;
    }
}
