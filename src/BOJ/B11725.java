import java.lang.*;
import java.security.Signature;
import java.util.*;
import java.io.*;

class Main {

    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer> parentNodes = new ArrayList<>();
    public static StringBuilder out = new StringBuilder();
    
    public static void main(String[] args) {
        
        FastReader rd = new FastReader();

        int N = rd.nextInt();
        visited = new boolean[N + 1];
        for (int i=0; i<N + 1; i++) {
            graph.add(new ArrayList<Integer>());
            parentNodes.add(0);
        }
        for (int i=0; i<N-1; i++) {
            String[] Line = rd.nextLine().split(" ");
            int a = Integer.parseInt(Line[0]);
            int b = Integer.parseInt(Line[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1);

        for (int i=2; i<N+1; i++) {
            out.append(parentNodes.get(i) + "\n");
        }
        System.out.println(out);
    }

    public static void dfs(int x) {
        visited[x] = true;
        for (int i=0; i<graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                parentNodes.set(y, x);
                dfs(y);
            }
        }
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
