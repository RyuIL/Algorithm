import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class B7662 {

    private static final String INSERT = "I";
    private static final String DELETE = "D";
    private static final int DELETE_MIN = -1;
    private static final int DELETE_MAX = 1;
    private static final String EMPTY = "EMPTY";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            for (int j = 0; j <N; j++) {
                String[] order = br.readLine().split(" ");
                int value = Integer.parseInt(order[1]);
                switch (order[0]) {
                    case INSERT:
                        tm.put(value, tm.getOrDefault(value, 0)+1);
                        break;
                    case DELETE:
                        if(tm.isEmpty()) break;
                        Integer key = null;
                        if(value == DELETE_MIN) {
                            key = tm.firstKey();
                        } else if (value == DELETE_MAX) {
                            key = tm.lastKey();
                        }

                        if(1 == tm.put(key, tm.get(key) - 1) && key != null) {
                            tm.remove(key);
                        }
                        break;
                    default:
                        break;
                }
            }
            System.out.println(tm.isEmpty() ? EMPTY : tm.lastKey() + " " + tm.firstKey());
        }
    }
}
