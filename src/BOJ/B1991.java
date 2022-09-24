import java.lang.*;
import java.util.*;
import java.io.*;

class Main {
    
    static StringBuilder out = new StringBuilder();
    static HashMap<String, String[]> tree;
    
    public static void main(String[] args) {

        FastReader rd = new FastReader();
        
        int N = rd.nextInt();
        
        tree = new HashMap<>(N+1);
        for (int i=0; i<N; i++) {
            String[] Line = rd.nextLine().split(" ");
            String parentsNode = Line[0];
            String leftNode = Line[1];
            String rightNode = Line[2];
            
            tree.put(parentsNode, new String[] {leftNode, rightNode});
        }
        
        preorder("A");
        out.append("\n");

        inorder("A");
        out.append("\n");

        postorder("A");
        out.append("\n");
        
        System.out.println(out);
    }

    static void preorder(String root) {
        if (!root.equals(".")) {
            String[] Line = tree.get(root);
            out.append(root);
            preorder(Line[0]);
            preorder(Line[1]);
        }
    }

    static void inorder(String root) {
        if (!root.equals(".")) {
            String[] Line = tree.get(root);
            inorder(Line[0]);
            out.append(root);
            inorder(Line[1]);
        }
    }

    static void postorder(String root) {
        if (!root.equals(".")) {
            String[] Line = tree.get(root);
            postorder(Line[0]);
            postorder(Line[1]);
            out.append(root);
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
