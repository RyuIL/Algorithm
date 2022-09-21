import java.lang.*;
import java.security.Signature;
import java.util.*;
import java.io.*;

class Main {
    public static long f = 1;
    
    public static void main(String[] args) {

        FastReader rd = new FastReader();
        StringBuilder out = new StringBuilder();
        int N = rd.nextInt();

        int cnt = 0;
        for (int i=5; i<N+1; i+=5) {
            int temp = i;
            while (temp % 5 == 0) {
                cnt += 1;
                temp = temp/5;
            }
        }

        out.append(cnt);
        System.out.println(out);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
