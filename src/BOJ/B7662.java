import java.lang.*;
import java.util.*;
import java.io.*;

class B7662 {
    public static void main(String[] args) {

        FastReader rd = new FastReader();
        StringBuilder out = new StringBuilder();

        int T = rd.nextInt();
        for (int t=0; t<T; t++) {
            int K = rd.nextInt();
            PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
            PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
            Hashtable<Integer, Integer> elementHashTable = new Hashtable<Integer, Integer>(); 
            
            int cnt = 0;
            for (int k=0; k<K; k++) {
                String[] Line = rd.nextLine().split(" ");
                String cmd = Line[0];
                int n = Integer.parseInt(Line[1]);
                switch (cmd) {
                    case "I": {
                        priorityQueueLowest.add(n);
                        priorityQueueHighest.add(n);
                        elementHashTable.put(n, (elementHashTable.get(n) == null) ? 1 : (elementHashTable.get(n) + 1));
                        cnt += 1;
                        break;
                    }
                    case "D": {
                        if (cnt <= 0) {
                            continue;
                        }
                        
                        if (n == 1) {
                            while (elementHashTable.get(priorityQueueHighest.peek()) == 0) {
                                priorityQueueHighest.poll();
                            }
                            int delNum = priorityQueueHighest.poll();
                            elementHashTable.put(delNum, elementHashTable.get(delNum) - 1);
                        } else if (n == -1) {
                            while (elementHashTable.get(priorityQueueLowest.peek()) == 0) {
                                priorityQueueLowest.poll();
                            }
                            int delNum = priorityQueueLowest.poll();
                            elementHashTable.put(delNum, elementHashTable.get(delNum) - 1);
                        }

                        cnt -= 1;
                        if (cnt <= 0) {
                            priorityQueueLowest = new PriorityQueue<>();
                            priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
                            continue;
                        }
                    }
                }
            }

            if (cnt <= 0) {
                out.append("EMPTY\n");
            } else {
                while (elementHashTable.get(priorityQueueHighest.peek()) == 0) {
                    priorityQueueHighest.poll();
                }
                int bigAnswer = priorityQueueHighest.poll();

                while (elementHashTable.get(priorityQueueLowest.peek()) == 0) {
                    priorityQueueLowest.poll();
                }
                int smallAnswer = priorityQueueLowest.poll();
                
                out.append(bigAnswer + " " + smallAnswer + "\n");
            }
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
