import java.lang.*;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

        FastReader rd = new FastReader();
        StringBuilder out = new StringBuilder();

        int N = rd.nextInt();
        String[] Line = rd.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> idxList = new Stack<>();
        stack.add(Integer.parseInt(Line[0]));
        idxList.add(0);

        out.append("0 ");
        
        int idx;
        int h;
        for (int i=1; i<N; i++) {
            h = Integer.parseInt(Line[i]);
            
            if (stack.peek() == h) {
                stack.pop();
                idxList.pop();
            } else if (stack.peek() < h) {
                stack.pop();
                idxList.pop();
                while (!stack.empty()) {
                    if (stack.peek() > h) {
                        break;
                    }
                    stack.pop();
                    idxList.pop();
                }
            }
            
            out.append(((idxList.empty()) ? 0 : idxList.peek() + 1) + " ");
            stack.add(h);
            idxList.add(i);
        }
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
