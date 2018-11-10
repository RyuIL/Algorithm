package BOJ;

import java.io.*;
import java.util.*;

public class B1966_2 {

    public B1966_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n ; i++) {
            LinkedList<HashMap> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int purpose = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            int[] qq = new int[size];


            for (int j = 0; j <size; j++) {
                HashMap hm = new HashMap();
                int in = Integer.parseInt(st.nextToken());

                qq[j] = in;

                if(j==purpose){
                    hm.put("key", in);
                }else {
                    hm.put("not", in);
                }
                q.addLast(hm);
            }

            Arrays.sort(qq);

            int ans =0;
            while (true){
                int max = qq[qq.length-(ans+1)];
                int temp = 0;
                if(!q.getFirst().containsValue(max)){
                    q.addLast(q.removeFirst());
                }else {
                    if(q.getFirst().containsKey("key")){
                        bw.write(++ans+"\n");
                        bw.flush();
                        q.clear();
                        break;
                    }
                    ans++;
                    q.removeFirst();
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }

    private static int maxCheck(LinkedList<Integer> a){
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < a.size() ; i++) {
            if(a.get(i)>temp){
                temp = a.get(i);
            }
        }

        return temp;
    }
}
