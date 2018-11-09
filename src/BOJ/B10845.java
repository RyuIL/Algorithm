package BOJ;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B10845 {
    public B10845() throws IOException {
        String str = "";
        StringTokenizer s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> q = new LinkedList<>();


        for (int i = 0; i <n ; i++) {
            str = br.readLine();
            s = new StringTokenizer(str);

            if(s.nextToken().equals("push")){
                q.addLast(Integer.parseInt(s.nextToken()));
            }else if(str.equals("pop")){
                if (q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(q.removeFirst() + "\n");
                }
                bw.flush();
            }else if(str.equals("size")){
                bw.write(q.size() + "\n");
                bw.flush();
            }else if(str.equals("empty")){
                if (q.isEmpty()) {
                    bw.write(1 + "\n");
                } else bw.write(0 + "\n");
                bw.flush();
            }else if(str.equals("front")){
                if (q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(q.getFirst() + "\n");
                }
                bw.flush();
            }else if(str.equals("back")){
                if (q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(q.getLast() + "\n");
                }
                bw.flush();
            }
        }
        bw.close();
        br.close();

    }
}
