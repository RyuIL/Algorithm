package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> paths = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> nodes = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        long sum = (long) nodes.get(0) * (long) paths.get(0);
        int current = 0;
        for (int i = 1; i < N-1; i++) {
            sum += Math.min((long) nodes.get(current) * paths.get(i), (long) nodes.get(i) * paths.get(i));
            if((long) nodes.get(current) * paths.get(i) > (long) nodes.get(i) * paths.get(i)) current = i;
        }

        System.out.println(sum);
    }
}
