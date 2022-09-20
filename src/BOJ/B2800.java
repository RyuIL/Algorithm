import java.lang.*;
import java.util.*;
import java.io.*;

class Main {
    
    static List<int[]> brackets;
    static Set<String> result;
    static boolean[] check;
    public static void main(String[] args) {

        FastReader rd = new FastReader();
        
        String Line = rd.nextLine();
        
        brackets = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<Line.length(); i++) {
            char element = Line.charAt(i);
            if (element == '(') {
                stack.push(i);
            } else if (element == ')') {
                brackets.add(new int[] {stack.pop(), i});
            }
        }
        
        check = new boolean[Line.length()];
        result = new TreeSet<>();
        comb(0, Line.toCharArray());
        
        result.stream().forEach(System.out::println);
    }
    
    static void comb(int depth, char[] str) {
        if (depth == brackets.size()) {
            
            boolean tf = false;
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i<str.length; i++) {
                if (!check[i]) { sb.append(str[i]); }
                else { tf = true; }
            }
            
            if (tf) { result.add(sb.toString()); }
            
            return;
        }
        
        int[] bracket = brackets.get(depth);
        
        comb(depth + 1, str);
        check[bracket[0]] = true;
        check[bracket[1]] = true;
        
        comb(depth+1, str);
        check[bracket[0]] = false;
        check[bracket[1]] = false;
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
