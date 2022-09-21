import java.lang.*;
import java.util.*;
import java.io.*;

class Main {
    static ArrayList<Integer> dpList = new ArrayList<>();

    public static void main(String[] args) {

        FastReader rd = new FastReader();
        StringBuilder out = new StringBuilder();
        int n = rd.nextInt();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < n + 1; i++) {
            dpList.add(0);
        }

        dpList.set(1, 1);
        dpList.set(2, 3);
        dp(n);

        out.append(dpList.get(n));
        System.out.println(out);
    }

    static int dp(int n) {
        if (dpList.get(n) != 0) {
            return dpList.get(n);
        }
        dpList.set(n, (dp(n - 1) + 2 * dp(n - 2)) % 10007);
        return dpList.get(n);
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
